package com.example.medina.diplomskirad.Api;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.medina.diplomskirad.Helper.Config;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.volley.MyVolley;
import com.example.medina.diplomskirad.Model.PorukaVM;
import com.example.medina.diplomskirad.MyApp;

public class PorukaApi {
    public static void postPoruka(final Context context, final MyRunnable<PorukaVM> onSuccess, PorukaVM prijedlog) {

        final String url = Config.urlApi + "Poruka/";


        MyVolley.post(url, PorukaVM.class, new Response.Listener<PorukaVM>() {
            @Override
            public void onResponse(PorukaVM response) {
                onSuccess.run(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }, prijedlog);
    }
}
