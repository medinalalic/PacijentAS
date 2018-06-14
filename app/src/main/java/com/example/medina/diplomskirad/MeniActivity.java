package com.example.medina.diplomskirad;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.TerminApi;
import com.example.medina.diplomskirad.Helper.F;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;

import java.util.Date;

public class MeniActivity extends AppCompatActivity {
    ImageView ordinacija;
    ImageView termin;
    ImageView profil;
    ImageView pregled;
ImageView odjava;
    ImageView poruka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meni);
       ordinacija = (ImageView) findViewById(R.id.btnUsluge);
       termin = (ImageView) findViewById(R.id.btnTermin);
        profil = (ImageView) findViewById(R.id.btnProfil);
       pregled = (ImageView) findViewById(R.id.btnPregled);
        odjava = (ImageView) findViewById(R.id.btnOdjava);
        poruka = (ImageView) findViewById(R.id.btnPoruka);

      /*  TerminApi.Odobren(MeniActivity.this, new MyRunnable<Boolean>() {
            @Override
            public void run(Boolean value) {
                if (value){
                    //send notif
                   // SharedPreferences prefs=getSharedPreferences("prefs",MODE_PRIVATE);
                   // boolean firstStart=prefs.getBoolean("firstStart",true);
                   // if(firstStart) {

                        String body = "Termin je odobren!";
                        Date datum = new Date();
                        String d = F.Date_ddMMyyyy(datum);
                        String tittle = d;
                        Intent intent = new Intent(MeniActivity.this, MeniActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        PendingIntent p = PendingIntent.getActivity(MeniActivity.this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
                        Uri sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                        NotificationCompat.Builder notify = new NotificationCompat.Builder(MeniActivity.this)
                                .setContentText(body).
                                        setContentTitle(tittle)
                                .setSmallIcon(R.drawable.icon)
                                .setSound(sound)
                                .setAutoCancel(true)
                                .setContentIntent(p);


                        NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                        notif.notify(0, notify.build());

                    }




              //  }
            }
        },Sesija.getlogiraniKorisnik().Id);*/

        ordinacija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeniActivity.this, MjestoFragmentActivity.class));

            }
        });
        pregled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeniActivity.this, PregledMjestoActivity.class));

            }
        });
        odjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sesija.setlogiraniKorisnik(null);
                Toast.makeText(MeniActivity.this,"Uspješno ste se odjavili.", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MeniActivity.this, MainActivity.class));
                return;


            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeniActivity.this, UrediProfilActivity.class));

            }
        });
        termin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeniActivity.this, TerminActivity.class));

            }
        });
        poruka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeniActivity.this, PorukaActivity.class));

            }
        });
    }
}
