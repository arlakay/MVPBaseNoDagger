package com.erd.pjitransport.ui.main;

import android.widget.Toast;

import com.erd.pjitransport.model.resp.QuestionResp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private MainActivity mContext;

    public MainPresenter(MainActivity activity){
        this.mContext = activity;
    }

    public void getQuestions(){
        Call<QuestionResp> questionCall = mContext.getFirstAPI().getQuestions();
        questionCall.enqueue(new Callback<QuestionResp>() {
            @Override
            public void onResponse(Call<QuestionResp> call, Response<QuestionResp> response) {
                assert response.body() != null;
                mContext.questionDetails.addAll(response.body().getChoices());
                mContext.adapter = new MainAdapter(mContext, mContext.questionDetails);
                mContext.adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<QuestionResp> call, Throwable t) {
                Toast.makeText(mContext, "Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
