package com.pji_solutions.pjitransport.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.support.v4.app.Fragment;

import com.pji_solutions.pjitransport.BaseApplication;
import com.pji_solutions.pjitransport.R;
import com.pji_solutions.pjitransport.network.FirstNetworkAPI;

import butterknife.BindString;
import butterknife.ButterKnife;

/**
 * Created by tunggul.jati on 15/08/2018.
 */

public abstract class BaseFragment extends Fragment {

    @BindString(R.string.loading)
    public String LOADING;

    @BindString(R.string.connection_error)
    public String CONNECTION_ERROR;

    protected abstract int getLayout();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    public void showProgressDialog(String message) {
        ((BaseActivity) getActivity()).showProgressDialog(message);
    }

    public void dismissProgressDialog() {
        ((BaseActivity) getActivity()).dismissProgressDialog();
    }

    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    public FirstNetworkAPI getFirstAPI()
    {
        return BaseApplication.getInstance().getFirstApi();
    }

//   public SecondNetworkAPI getSecondAPI(){
//        return BaseApplication.getInstance().getSecondApi();
//   }


}