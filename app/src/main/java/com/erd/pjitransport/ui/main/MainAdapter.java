package com.erd.pjitransport.ui.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.erd.pjitransport.R;
import com.erd.pjitransport.model.bean.QuestionDetail;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private Context context;
    private List<QuestionDetail> questionDetailList;

    public MainAdapter (Context context, List<QuestionDetail> questionDetails){
        this.context = context;
        this.questionDetailList = questionDetails;
    }

    @NonNull
    @Override
    public MainAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_list_question, viewGroup, false);
        MainAdapter.MainViewHolder mainViewHolder = new MainViewHolder(itemView);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MainViewHolder viewHolder, int i) {
        QuestionDetail item = questionDetailList.get(i);
        viewHolder.itemView.setTag(item);

        viewHolder.txtChoice.setText(item.getChoice());
        viewHolder.txtVote.setText(item.getVotes());

    }

    @Override
    public int getItemCount() {
        return questionDetailList != null ? questionDetailList.size() : 0 ;
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txt_choice) TextView txtChoice;
    @BindView(R.id.txt_vote)TextView txtVote;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
