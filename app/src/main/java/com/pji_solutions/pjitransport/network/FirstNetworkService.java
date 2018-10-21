package com.pji_solutions.pjitransport.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pji_solutions.pjitransport.preference.NCPrefHelper;
import com.pji_solutions.pjitransport.preference.PrefKey;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by tunggul.jati on 14/08/2018.
 */

public class FirstNetworkService {

    private FirstNetworkAPI api;
    //Development
    public final String DEFAULT_BASEURL_PUBLIC = "http://35.198.229.154";
    private String baseUrl = DEFAULT_BASEURL_PUBLIC;
    public final int CONNECTION_TIMEOUT_IN_SECOND = 30;
    public FirstNetworkService () {
        /*String baseUrl = NCPrefHelper.getString(PrefKey.FIRST_URL);
        Boolean isPublic = NCPrefHelper.getBoolean(PrefKey.IS_PUBLIC);
        if (baseUrl.isEmpty() || baseUrl.equalsIgnoreCase("")) {
            if (isPublic == true){
                baseUrl = DEFAULT_EOS_BASEURL_PUBLIC;
                NCPrefHelper.setString(PrefKey.FIRST_URL, baseUrl);
            } else {
                baseUrl = DEFAULT_EOS_BASEURL_INTRA;
                NCPrefHelper.setString(PrefKey.FIRST_URL, baseUrl);
            }
        }*/
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        Retrofit retrofitSvc = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(getCustomClient())
                .build();
        this.api = retrofitSvc.create(FirstNetworkAPI.class);
    }

    private OkHttpClient getCustomClient(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(
                new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request.Builder requestBuilder = chain.request().newBuilder();
                        return chain.proceed(requestBuilder.build());
                    }
                }
        ).addInterceptor(logging)
                .connectTimeout(CONNECTION_TIMEOUT_IN_SECOND, TimeUnit.SECONDS)
                .writeTimeout(CONNECTION_TIMEOUT_IN_SECOND, TimeUnit.SECONDS)
                .readTimeout(CONNECTION_TIMEOUT_IN_SECOND, TimeUnit.SECONDS)
                .build();

        return httpClient;
    }

    public FirstNetworkAPI getApi()
    {
        return this.api;
    }
}
