package com.pji_solutions.pjitransport;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.pji_solutions.pjitransport.network.FirstNetworkAPI;
import com.pji_solutions.pjitransport.network.FirstNetworkService;
import com.pji_solutions.pjitransport.util.acra.ACRAReportSender;
import com.pji_solutions.pjitransport.util.acra.LibraryCrash;

import org.acra.ACRA;

/**
 * Created by tunggul.jati on 14/08/2018.
 */

public class BaseApplication extends Application {

    private static BaseApplication currentApplication;

    private SharedPreferences appSharedPreferences;
    private SharedPreferences ncAppSharedPreferences;

    private FirstNetworkService mFirstService;

    //private SecondNetworkService mSecondService;

    public BaseApplication()
    {
        currentApplication = this;
    }

    public static synchronized BaseApplication getInstance(){return currentApplication;}
//
//    public static BaseApplication from(Activity activity)
//    {
//        return (BaseApplication) activity.getApplication();
//    }


    @Override
    public void onCreate() {
        super.onCreate();
        setupAppSharedPreferences();
        currentApplication=this;
//        Object prodModule = new BaseModule(this);
//        objectGraph = ObjectGraph.create(prodModule);
//
        LibraryCrash.install(this);
        ACRA.init(this);
        ACRAReportSender reportSender = new ACRAReportSender(getBaseContext(), "pactera.report@gmail.com", "binimuda14");
        ACRA.getErrorReporter().setReportSender(reportSender);

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



//    public ObjectGraph objectGraph() {
//        return objectGraph;
//    }
//
//    public void inject(Object o) {
//        objectGraph.inject(o);
//    }

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

//    public SecondNetworkService getSecondNetworkService(){
//        if(mSecondService == null){
//            mSecondService = new SecondNetworkService();
//        }
//        return mSecondService;
//    }
//
//    public SecondNetworkAPI getSecondApi(){
//        return getSecondNetworkService().getApi();
//    }
}
