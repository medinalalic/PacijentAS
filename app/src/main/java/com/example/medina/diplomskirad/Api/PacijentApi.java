package com.example.medina.diplomskirad.Api;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.medina.diplomskirad.Helper.Config;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.volley.MyVolley;
import com.example.medina.diplomskirad.Model.KorisniciVM;
import com.example.medina.diplomskirad.Model.PacijentVM;
import com.example.medina.diplomskirad.Model.PorukaVM;
import com.example.medina.diplomskirad.Model.PregledVM;
import com.example.medina.diplomskirad.Model.ZubVM;
import com.example.medina.diplomskirad.MyApp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class PacijentApi {
    public static void postSlika(final Context context, final MyRunnable<PacijentVM> onSuccess, PacijentVM p) {

        final String url = Config.urlApi + "Pacijent/PutPacijent/";


        MyVolley.put(url, PacijentVM.class, new Response.Listener<PacijentVM>() {
            @Override
            public void onResponse(PacijentVM response) {
                onSuccess.run(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }, p);
    }

    public static void IzmjenaPodataka(final Context context, final MyRunnable<PacijentVM> onSuccess, final PacijentVM object) {

        final String url = Config.urlApi + "Pacijent/IzmjenaPodatka";
        MyVolley.post(url, PacijentVM.class, new Response.Listener<PacijentVM>() {
                    @Override
                    public void onResponse(PacijentVM response) {

                        onSuccess.run(response);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MyApp.getContext(), "Greška sa konekcijom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                },
                object

        );
    }


    public static void getSlika(final Context context, final MyRunnable<PacijentVM> onSuccess, final int pacijentId) {


        final String url = Config.urlApi + "Pacijent/GetSlika";
        MyVolley.get(url, PacijentVM.class, new Response.Listener<PacijentVM>() {
                    @Override
                    public void onResponse(PacijentVM response) {
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
