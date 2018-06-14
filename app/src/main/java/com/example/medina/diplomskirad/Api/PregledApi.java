package com.example.medina.diplomskirad.Api;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.medina.diplomskirad.Helper.Config;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.volley.MyVolley;
import com.example.medina.diplomskirad.Model.PregledVM;
import com.example.medina.diplomskirad.MyApp;

import org.json.JSONArray;

public class PregledApi {
    public static void getPregled(final Context context, final MyRunnable<PregledVM> onSuccess, final int pacijentId) {


        final String url = Config.urlApi + "Pregled/GetPregledByPacijent";
        MyVolley.get(url, PregledVM.class, new Response.Listener<PregledVM>() {
                    @Override
                    public void onResponse(PregledVM response) {
                        onSuccess.run(response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }, pacijentId
        );
    }
}
