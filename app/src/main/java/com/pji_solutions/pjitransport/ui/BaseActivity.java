package com.pji_solutions.pjitransport.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.pji_solutions.pjitransport.BaseApplication;
import com.pji_solutions.pjitransport.R;
import com.pji_solutions.pjitransport.network.FirstNetworkAPI;

import butterknife.BindString;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @BindString(R.string.loading)
    public String LOADING;

    @BindString(R.string.connection_error)
    public String CONNECTION_ERROR;

    private ProgressDialog progressDialog;

    protected abstract int getLayout();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        progressDialog = new ProgressDialog(this, R.style.GenericProgressDialogStyle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        progressDialog.dismiss();
    }

    public void showProgressDialog(String message) {
        progressDialog.setMessage(message);
        progressDialog.show();
    }

    /*@Override
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        if (menu != null) {
            if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
                try {
                    Method m = menu.getClass().getDeclaredMethod(
                            "setOptionalIconsVisible", Boolean.TYPE);
                    m.setAccessible(true);
                    m.invoke(menu, true);
                } catch (Exception e) {
                    Log.e(getClass().getSimpleName(), "onMenuOpened...unable to set icons for overflow menu", e);
                }
            }
        }
        return super.onPrepareOptionsPanel(view, menu);
    }*/

    public void setToolBar(String title) {
        getSupportActionBar().setTitle(title);
    }

    public void dismissProgressDialog() {
        progressDialog.hide();
    }

    public void showToast(String msg) {
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }

    public FirstNetworkAPI getFirstAPI()
    {
        return BaseApplication.getInstance().getFirstApi();
    }

//    public SecondNetworkAPI getSecondAPI(){
//        return BaseApplication.getInstance().getSecondApi();
//    }

}
