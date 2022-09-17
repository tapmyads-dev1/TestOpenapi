package com.tapmyads.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.api.DetaultApi;
import org.openapitools.client.model.LoginWithCustomIDResponse;
import org.openapitools.client.model.LoginwithCustomID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginwithCustomID loginwithCustomID = new LoginwithCustomID();
        loginwithCustomID.setCustomId("adasdasd");
        loginwithCustomID.setProjectID("10RUL");
        loginwithCustomID.setCreateAccount(true);
//        DetaultApi.postLoginwithcustomid(loginwithCustomID, new com.android.volley.Response.Listener<LoginWithCustomIDResponse>() {
//            @Override
//            public void onResponse(LoginWithCustomIDResponse response) {
//                Log.d("========", "onResponse: " + response.toString());
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("========", "onResponse: " + error.toString());
//            }
//        });

        DetaultApi.postLoginwithcustomid(loginwithCustomID, new Response.Listener<LoginWithCustomIDResponse>() {
            @Override
            public void onResponse(LoginWithCustomIDResponse response) {
                Log.d("========", "onResponse: " + response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("========", "onResponse: " + error.toString());
            }
        });
    }
}