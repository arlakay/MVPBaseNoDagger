package com.erd.pjitransport.ui.main;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.erd.pjitransport.R;
import com.erd.pjitransport.model.bean.QuestionDetail;
import com.erd.pjitransport.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.rv_choice)
    RecyclerView rvChoicr;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    public List<QuestionDetail> questionDetails= new ArrayList<>();
    MainPresenter presenter;
    MainAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new MainPresenter(this);

        setupToolbar();
//        initRV();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvChoicr.setLayoutManager(layoutManager);

        presenter.getQuestions();

    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        if (getSupportActionBar() == null) {
            throw new IllegalStateException("Activity must implement toolbar");
        }
    }

    public void initRV(){
        adapter = new MainAdapter(this, questionDetails);
        rvChoicr.setAdapter(adapter);
    }

}
