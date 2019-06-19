package com.pji_solutions.pjitransport.ui.main;

import android.widget.Toast;

import com.pji_solutions.pjitransport.model.resp.QuestionResp;
import com.pji_solutions.pjitransport.network.FirstNetworkAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private MainActivity activity;

    public MainPresenter(MainActivity activity){
        this.activity = activity;
    }

    public void getQuestions(){
        FirstNetworkAPI api = activity.getFirstAPI();

        Call<QuestionResp> questionCall = api.getQuestions();
        questionCall.enqueue(new Callback<QuestionResp>() {
                    @Override
                    public void onResponse(Call<QuestionResp> call, Response<QuestionResp> response) {
                        activity.questionDetails.addAll(response.body().getChoices());
                        activity.loadRV();
                    }

                    @Override
                    public void onFailure(Call<QuestionResp> call, Throwable t) {
                        Toast.makeText(activity, "Gagal", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
