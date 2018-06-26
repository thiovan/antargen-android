package com.example.asus.tugasakhir.network;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ASUS on 5/24/2018.
 */

public class RetrofitClient {
    public static final String BASE_URL = "http://antargen.ktpsapi.com/public/";
    private static Retrofit retrofit = null;
    // variable to hold context
    private static Context context;

    public static Retrofit getClient() {
        if (retrofit==null) {

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }

}

