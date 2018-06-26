package com.example.medina.diplomskirad;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.PorukaApi;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.PorukaVM;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PorukaActivity extends AppCompatActivity {

    private EditText poruka;
    private Button dodaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poruka);
        poruka = (EditText) findViewById(R.id.txtporuka);

        dodaj = (Button) findViewById(R.id.btnPoruka);

        dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PorukaVM p = new PorukaVM();
                p.TekstPoruke = poruka.getText().toString();
                p.Procitana = false;
                p.PacijentId = Sesija.getlogiraniKorisnik().Id;
                p.StomatologId=1;
                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strDate = sdf.format(c.getTime());

                p.Datum = strDate;


                PorukaApi.postPoruka(getApplicationContext(), new MyRunnable<PorukaVM>() {
                    @Override
                    public void run(PorukaVM result) {
                        if (result != null) {
                            Toast.makeText(getApplicationContext(), "Poruka uspješno poslana : ", Toast.LENGTH_SHORT).show();
                            poruka.setText("");
                        } else
                            Toast.makeText(getApplicationContext(), "Greška, pokušajte kasnije ", Toast.LENGTH_SHORT).show();
                    }
                }, p);
            }
        });
    }
}
