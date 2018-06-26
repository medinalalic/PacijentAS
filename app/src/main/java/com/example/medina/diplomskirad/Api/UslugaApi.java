package com.example.medina.diplomskirad.Api;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.medina.diplomskirad.Helper.Config;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.volley.MyVolley;
import com.example.medina.diplomskirad.Model.OcjenaVM;
import com.example.medina.diplomskirad.Model.UslugaVM;
import com.example.medina.diplomskirad.Model.ZubVM;
import com.example.medina.diplomskirad.MyApp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class UslugaApi {
    public static void getUslugeByNaziv(final Context context, final String naziv, final MyRunnable < JSONArray > onSuccess) {
        final String url = Config.urlApi + "Usluga/GetUslugeByNaziv/" + naziv;
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


    public static void getAllUsluge(final Context context, final MyRunnable < JSONArray > onSuccess) {

        final String url = Config.urlApi + "Usluga/GetAllUsluge";
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

    public static ArrayList < UslugaVM.UslugaInfo > jsonToUslugeList(JSONArray jsonObj) {

        ArrayList < UslugaVM.UslugaInfo  > items = new ArrayList < UslugaVM.UslugaInfo  > ();

        JSONObject o = new JSONObject();


        try {
            for (int i = 0; i < (jsonObj.length()); i++) {

                items.add(new UslugaVM.UslugaInfo(jsonObj.getJSONObject(i).getInt("Id"),
                        jsonObj.getJSONObject(i).getString("Vrsta"),
                        jsonObj.getJSONObject(i).get("Slika").toString(),
                        jsonObj.getJSONObject(i).getInt("Ocjena")));

            }




        } catch (Exception e) {

            Log.e("jsonNeocjProizvodi", "err: " + e.getMessage());

        }

        return items;

    }



    public static void getNeocjenjene(final Context context, final int uslugaId,final int pacijentId, final MyRunnable< JSONArray > onSuccess) {
        final String url = Config.urlApi + "Usluga/GetUslugeNeocjenjene/" + uslugaId+"/"+pacijentId;
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

    public static ArrayList < UslugaVM.UslugaInfo > jsonToUslugeList2(JSONArray jsonObj) {

        ArrayList < UslugaVM.UslugaInfo  > items = new ArrayList < UslugaVM.UslugaInfo  > ();

        JSONObject o = new JSONObject();


        try {
            for (int i = 0; i < (jsonObj.length()); i++) {

                items.add(new UslugaVM.UslugaInfo(jsonObj.getJSONObject(i).getInt("Id"),
                        jsonObj.getJSONObject(i).getString("Vrsta"),
                        jsonObj.getJSONObject(i).get("Slika").toString(),
                        jsonObj.getJSONObject(i).getInt("Ocjena")));

            }




        } catch (Exception e) {

            Log.e("jsonNeocjProizvodi", "err: " + e.getMessage());

        }

        return items;

    }

    public static void postOcjena(final Context context, final MyRunnable <OcjenaVM> onSuccess, OcjenaVM ocjena) {

        final String url = Config.urlApi + "Ocjena/PostOcjena/";



        MyVolley.post(url, OcjenaVM.class, new Response.Listener < OcjenaVM > () {
            @Override
            public void onResponse(OcjenaVM response) {

                onSuccess.run(response);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(MyApp.getContext(), "Greška u komunikaciji sa serverom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }, ocjena);
    }

}
