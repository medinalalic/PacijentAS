package com.example.medina.diplomskirad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PregledMjestoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregled_mjesto);
        Util.otvoriFragmentKaoReplace(this,R.id.pregledmjesto,new ToothChartFragment());
    }
}
