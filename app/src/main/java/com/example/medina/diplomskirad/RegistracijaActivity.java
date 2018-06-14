package com.example.medina.diplomskirad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.KorisnikApi;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Model.KorisniciVM;
import com.example.medina.diplomskirad.Model.PacijentVM;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistracijaActivity extends AppCompatActivity {
    private EditText imeInput;
    private EditText prezimeInput;
    private EditText emailInput;
    private EditText usernameInput;
    private EditText passwordInput;
    private EditText adresaInput;
    private EditText telefonInput;
    private Button registriraj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracija);
        imeInput = (EditText) findViewById(R.id.txtIme);
        prezimeInput = (EditText) findViewById(R.id.txtPrezime);
        emailInput = (EditText) findViewById(R.id.txtEmail);
        usernameInput = (EditText) findViewById(R.id.txtUsername);
        passwordInput = (EditText) findViewById(R.id.txtPassword);
        adresaInput = (EditText) findViewById(R.id.txtAdresa);
        registriraj = (Button) findViewById(R.id.btnRegistracija);
        telefonInput = (EditText) findViewById(R.id.txtTelefon);
        registriraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do_registrirajSe();
            }
        });
    }

    private void do_registrirajSe() {
        KorisniciVM korisnik = new KorisniciVM();

        korisnik.Ime = imeInput.getText().toString();
        korisnik.Prezime = prezimeInput.getText().toString();
        korisnik.Email = emailInput.getText().toString();
        korisnik.KorisnickoIme = usernameInput.getText().toString();
        korisnik.Lozinka = passwordInput.getText().toString();
        korisnik.Adresa = adresaInput.getText().toString();
        korisnik.Mobitel = telefonInput.getText().toString();
        korisnik.IsAdmin = false;
        korisnik.Aktivan = true;



        KorisnikApi.postKorisnik(this, new MyRunnable<KorisniciVM>() {
            @Override
            public void run(KorisniciVM result) {
                if (result == null)
                    Toast.makeText(getApplicationContext(), "Greška u komunikaciji...", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getApplicationContext(), "Uspješno ste se registrovali", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                }
            }
        }, korisnik);
    }
    }

