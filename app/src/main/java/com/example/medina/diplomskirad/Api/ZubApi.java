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
import com.example.medina.diplomskirad.Model.UslugaVM;
import com.example.medina.diplomskirad.Model.ZubVM;
import com.example.medina.diplomskirad.MyApp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ZubApi {
    public static void getDetalji(final Context context, final int pacijentId,final int zubId, final MyRunnable< JSONArray > onSuccess) {
        final String url = Config.urlApi + "Pregled/Detalji/" + pacijentId+"/"+zubId;
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


    public static ArrayList< ZubVM.ZubInfo > jsonToZubList(JSONArray jsonObj) {

        ArrayList < ZubVM.ZubInfo  > items = new ArrayList < ZubVM.ZubInfo  > ();

        JSONObject o = new JSONObject();


        try {
            for (int i = 0; i < (jsonObj.length()); i++) {

                items.add(new ZubVM.ZubInfo(jsonObj.getJSONObject(i).getInt("Id"),
                        jsonObj.getJSONObject(i).getString("DatumPregleda"),
                        jsonObj.getJSONObject(i).getString("VrijemePregleda"),

                        jsonObj.getJSONObject(i).getString("Vrsta"),
                        jsonObj.getJSONObject(i).getString("Cijena"),
                        jsonObj.getJSONObject(i).getString("Naziv"),
                        jsonObj.getJSONObject(i).getString("Napomena"),
                        jsonObj.getJSONObject(i).getInt("BrojZuba"),
                        jsonObj.getJSONObject(i).getString("NazivZuba")));

            }




        } catch (Exception e) {

            Log.e("jsonZubi", "err: " + e.getMessage());

        }

        return items;

    }
}
