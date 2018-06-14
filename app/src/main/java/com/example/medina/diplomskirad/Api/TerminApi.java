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
import com.example.medina.diplomskirad.Model.PorukaVM;
import com.example.medina.diplomskirad.Model.TerminVM;
import com.example.medina.diplomskirad.Model.UslugaVM;
import com.example.medina.diplomskirad.MyApp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class TerminApi {
    public static void postTermin(final Context context, final MyRunnable<TerminVM> onSuccess, TerminVM termin) {

        final String url = Config.urlApi + "Termin/PostTermin/";
        termin.Vrijeme = termin.Datum+"T"+termin.Vrijeme+":00";
       termin.Datum = termin.Vrijeme;

        MyVolley.post(url, TerminVM.class, new Response.Listener<TerminVM>() {
            @Override
            public void onResponse(TerminVM response) {
                onSuccess.run(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }, termin);
    }

    public static void Terminboool(final Context context, final MyRunnable<Boolean> onSuccess,String datum, String vrijeme) {

        final String url = Config.urlApi + "Termin/IsSlobodanTermin";

        String d = datum+"T"+vrijeme+":00";
        MyVolley.get3(url, Boolean.class, new Response.Listener<Boolean>() {
            @Override
            public void onResponse(Boolean response) {
                onSuccess.run(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        },d);
    }


    public static void getZauzeteTermine(final Context context, final MyRunnable <JSONArray> onSuccess) {

        final String url = Config.urlApi + "Termin/GetZauzete";
        final ProgressDialog dialog = ProgressDialog.show(context, "Pristup podacima", "U toku");
        dialog.show();
        MyVolley.get2(url, new JSONArray(), new Response.Listener < JSONArray > () {
            @Override
            public void onResponse(JSONArray response) {
                dialog.dismiss();
                onSuccess.run(response);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                dialog.dismiss();
                Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static ArrayList< TerminVM.TerminInfo > jsonToTerminList(JSONArray jsonObj) {

        ArrayList < TerminVM.TerminInfo  > items = new ArrayList < TerminVM.TerminInfo > ();

        JSONObject o = new JSONObject();


        try {
            for (int i = 0; i < (jsonObj.length()); i++) {

                items.add(new TerminVM.TerminInfo(jsonObj.getJSONObject(i).getInt("Id"),
                        jsonObj.getJSONObject(i).getString("Datum"),
                        jsonObj.getJSONObject(i).get("Vrijeme").toString()));

            }




        } catch (Exception e) {

            Log.e("jsonTermini", "err: " + e.getMessage());

        }

        return items;

    }

    public static void Odobren(final Context context, final MyRunnable<Boolean> onSuccess,int pacijentId) {

        final String url = Config.urlApi + "Termin/Odobren";


        MyVolley.get(url, Boolean.class, new Response.Listener<Boolean>() {
            @Override
            public void onResponse(Boolean response) {
                onSuccess.run(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        },pacijentId);
    }
}
