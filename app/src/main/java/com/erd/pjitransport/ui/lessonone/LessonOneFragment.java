package com.erd.pjitransport.ui.lessonone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.erd.pjitransport.R;
import com.erd.pjitransport.ui.BaseActivity;
import com.erd.pjitransport.ui.BaseFragment;

public class LessonOneFragment extends BaseFragment {
    public static String TAG = LessonOneFragment.class.getSimpleName();

    @Override
    protected int getLayout() {
        return R.layout.fragment_lesson_one;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public static void showFragment(BaseActivity sourceActivity){
        FragmentTransaction ft = sourceActivity.getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, new LessonOneFragment(), TAG);
        ft.commit();
    }

}
