package com.example.medina.diplomskirad.Api;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.medina.diplomskirad.Helper.Config;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Helper.volley.MyVolley;
import com.example.medina.diplomskirad.Model.KorisniciVM;
import com.example.medina.diplomskirad.Model.PacijentVM;
import com.example.medina.diplomskirad.MyApp;

/**
 * Created by Medina on 18-Nov-17.
 */

public class KorisnikApi {

    public static void postKorisnik(final Context context, final MyRunnable<KorisniciVM> onSuccess, KorisniciVM korisnik) {

        final String url = Config.urlApi + "Korisnik/";
        final ProgressDialog dialog = ProgressDialog.show(context, "Pristup podacima", "U toku");
        dialog.show();
        MyVolley.post(url, KorisniciVM.class, new Response.Listener<KorisniciVM>() {
            @Override
            public void onResponse(KorisniciVM response) {
                dialog.dismiss();
                onSuccess.run(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                dialog.dismiss();
                Toast.makeText(MyApp.getContext(), "Greška sa konekcijom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }, korisnik);
    }
    public static void putKorisnik(final Context context, final MyRunnable<KorisniciVM> onSuccess,KorisniciVM korisnik) {

        final String url = Config.urlApi + "Korisnik/Put/";
        MyVolley.put(url, KorisniciVM.class, new Response.Listener<KorisniciVM>() {
                    @Override
                    public void onResponse(KorisniciVM response) {
                        onSuccess.run(response);


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MyApp.getContext(), "Greška sa konekcijom : " + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                },
                korisnik
        );
    }

    public static void IzmjenaPodataka(final Context context, final MyRunnable<KorisniciVM> onSuccess,final Object object) {

        final String url = Config.urlApi + "Korisnik/IzmjenaPodatka";
        MyVolley.post(url, KorisniciVM.class, new Response.Listener<KorisniciVM>() {
                    @Override
                    public void onResponse(KorisniciVM response) {

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

}


