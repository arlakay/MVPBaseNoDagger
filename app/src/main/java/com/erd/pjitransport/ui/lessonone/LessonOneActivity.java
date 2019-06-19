package com.erd.pjitransport.ui.lessonone;

import android.content.Intent;
import android.os.Bundle;

import com.erd.pjitransport.R;
import com.erd.pjitransport.ui.BaseActivity;

public class LessonOneActivity extends BaseActivity {

    public static void startActivity(BaseActivity sourceActivity){
        Intent i = new Intent(sourceActivity, LessonOneActivity.class);
        sourceActivity.startActivity(i);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_lesson_one;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LessonOneFragment.showFragment(this);

    }



}
