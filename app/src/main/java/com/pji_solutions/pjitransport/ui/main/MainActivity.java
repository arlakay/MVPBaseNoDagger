package com.pji_solutions.pjitransport.ui.main;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pji_solutions.pjitransport.R;
import com.pji_solutions.pjitransport.model.bean.QuestionDetail;
import com.pji_solutions.pjitransport.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.rv_choice)
    RecyclerView rvChoicr;

    public List<QuestionDetail> questionDetails= new ArrayList<>();
    private MainPresenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new MainPresenter(this);

        presenter.getQuestions();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvChoicr.setLayoutManager(layoutManager);

    }

    public void loadRV(){
        rvChoicr.setAdapter(new MainAdapter(this, questionDetails));
    }

//    @OnClick(R.id.btn_lesson_one)
//    public void gotoLessonOne(View v){
//        LessonOneActivity.startActivity(this);
//    }

}
