package com.example.medina.diplomskirad;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.medina.diplomskirad.Api.KorisnikApi;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.KorisniciVM;

public class ProfilActivity extends AppCompatActivity {
    private EditText ime;
    private EditText prezime;
    private EditText username;
    private EditText email;
    private EditText adresa;    private EditText telefon;    private EditText pass;
    final KorisniciVM k = Sesija.getlogiraniKorisnik();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);



        Button spasiPromjene = (Button) findViewById(R.id.btnRegistracija);
        ime = (EditText) findViewById(R.id.txtIme);
        prezime = (EditText) findViewById(R.id.txtPrezime);
        username = (EditText) findViewById(R.id.txtUsername);
        email = (EditText) findViewById(R.id.txtEmail);
        adresa = (EditText) findViewById(R.id.txtAdresa);
        telefon = (EditText) findViewById(R.id.txtTelefon);
        pass = (EditText) findViewById(R.id.txtPassword);

        Intent intent = this.getIntent();
        final Bundle bundle = intent.getExtras();
        if(bundle !=null){
            KorisniciVM k2=(KorisniciVM)bundle.getSerializable("korisnik2");
            ime.setText(k2.Ime);
            prezime.setText(k2.Prezime);
            username.setText(k2.KorisnickoIme);
            email.setText(k2.Email);
            adresa.setText(k2.Adresa);
            telefon.setText(k2.Mobitel);
            pass.setText(k2.Lozinka);
        }
        else {
            ime.setText(k.Ime);
            prezime.setText(k.Prezime);
            username.setText(k.KorisnickoIme);
            email.setText(k.Email);
            adresa.setText(k.Adresa);
            telefon.setText(k.Mobitel);
            pass.setText(k.Lozinka);
        }



        spasiPromjene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                do_btnSacuvaj_click();
            }
        });
    }
    private void do_btnSacuvaj_click()
    {


        ime = (EditText) findViewById(R.id.txtIme);
        prezime = (EditText) findViewById(R.id.txtPrezime);
        username = (EditText) findViewById(R.id.txtUsername);
        email = (EditText) findViewById(R.id.txtEmail);
        adresa = (EditText) findViewById(R.id.txtAdresa);
        telefon = (EditText) findViewById(R.id.txtTelefon);
        pass = (EditText) findViewById(R.id.txtPassword);

        k.Ime = ime.getText().toString();
        k.Prezime = prezime.getText().toString();
        k.KorisnickoIme = username.getText().toString();
        k.Email = email.getText().toString();
        k.Adresa = adresa.getText().toString();
        k.Mobitel = telefon.getText().toString();
k.Lozinka=pass.getText().toString();


        k.Id=Sesija.getlogiraniKorisnik().Id;
        MyRunnable<KorisniciVM> onSuccess=new MyRunnable<KorisniciVM>() {
            @Override
            public void run(KorisniciVM response) {
                do_returnToLogin(k);
            }
        };

        KorisnikApi.IzmjenaPodataka(ProfilActivity.this,onSuccess,k);

    }
    private void do_returnToLogin(final KorisniciVM novi) {

        AlertDialog.Builder b = new AlertDialog.Builder(ProfilActivity.this);
        b = new AlertDialog.Builder(ProfilActivity.this);

        b.setMessage("Uspješno ste izvrišili izmjene, da li želite da se odjavite iz aplikacije?");
        b.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

                yes();
            }
        });
        b.setNegativeButton("Ne", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ProfilActivity.this, MeniActivity.class);

                intent.putExtra("korisnik",novi);
                startActivity(intent);

            }
        });
        b.show();
    }

    private void yes() {
        Intent intent = new Intent(ProfilActivity.this, MainActivity.class);
        intent.putExtra("finish", true);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

}
