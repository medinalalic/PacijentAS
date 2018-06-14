package com.example.medina.diplomskirad;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.AutentifikacijaApi;
import com.example.medina.diplomskirad.Api.TerminApi;
import com.example.medina.diplomskirad.Helper.F;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.KorisniciVM;
import com.example.medina.diplomskirad.Model.TerminVM;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button submit;
    private Button registracija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.btnLogin);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLoginInitiate();
            }
        });

        registracija = findViewById(R.id.btnRegistracija);

        registracija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegistracijaActivity.class));
            }
        });

    }

    private void doLoginInitiate() {
        AutentifikacijaApi.Provjera(this,
                new MyRunnable<KorisniciVM>() {
                    @Override
                    public void run(KorisniciVM result) {
                        if (result == null)
                            Toast.makeText(getApplicationContext(), "Pogrešan Username ili Password", Toast.LENGTH_SHORT).show();
                        else {
                            Sesija.setlogiraniKorisnik(result);
                            Toast.makeText(getApplicationContext(), "Dobrodošli "+result.KorisnickoIme+"!", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(MainActivity.this, MeniActivity.class));
                        }

                    }



                }, username.getText().toString(), password.getText().toString());

    }


}


