package com.erd.pjitransport;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.erd.pjitransport.network.FirstNetworkAPI;
import com.erd.pjitransport.network.FirstNetworkService;

public class BaseApplication extends Application {

    private static BaseApplication currentApplication;

    private SharedPreferences appSharedPreferences;
    private SharedPreferences ncAppSharedPreferences;

    private FirstNetworkService mFirstService;

    public BaseApplication()
    {
        currentApplication = this;
    }

    public static synchronized BaseApplication getInstance(){return currentApplication;}

    @Override
    public void onCreate() {
        super.onCreate();
        setupAppSharedPreferences();
        currentApplication=this;

//        LibraryCrash.install(this);
//        ACRA.init(this);
//        ACRAReportSender reportSender = new ACRAReportSender(getBaseContext(), "pactera.report@gmail.com", "binimuda14");
//        ACRA.getErrorReporter().setReportSender(reportSender);

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                // new activity created; force its orientation to portrait
                activity.setRequestedOrientation(
                        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });

    }

    private void setupAppSharedPreferences(){
        this.appSharedPreferences = getSharedPreferences(BaseApplication.class.getSimpleName(), Context.MODE_PRIVATE);
        this.ncAppSharedPreferences = getSharedPreferences("nc"+BaseApplication.class.getSimpleName(), Context.MODE_PRIVATE);

    }
    public SharedPreferences getAppSharedPreferences(){
        return appSharedPreferences;
    }

    public SharedPreferences getncAppSharedPreferences(){
        return ncAppSharedPreferences;
    }

    public static BaseApplication get(Context context)
    {
        return (BaseApplication) context.getApplicationContext();
    }

    public FirstNetworkService getFirstNetworkService(){
        if(mFirstService == null){
            mFirstService = new FirstNetworkService();
        }
        return mFirstService;
    }

    public FirstNetworkAPI getFirstApi(){
        return getFirstNetworkService().getApi();
    }

}
