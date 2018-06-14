package com.example.medina.diplomskirad;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.KorisnikApi;
import com.example.medina.diplomskirad.Api.PorukaApi;
import com.example.medina.diplomskirad.Api.PregledApi;
import com.example.medina.diplomskirad.Api.TerminApi;
import com.example.medina.diplomskirad.Api.ZubApi;
import com.example.medina.diplomskirad.Helper.F;
import com.example.medina.diplomskirad.Helper.Global;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.KorisniciVM;
import com.example.medina.diplomskirad.Model.PorukaVM;
import com.example.medina.diplomskirad.Model.PregledVM;
import com.example.medina.diplomskirad.Model.TerminVM;

import org.json.JSONArray;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TerminActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener,DatePickerDialog.OnDateSetListener {

    int day,month,year,hour,minute;
    String dayFinal,monthFinal,yearFinal,hourFinal,minuteFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termin);

        Button datum = findViewById(R.id.datum);
        datum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Util.otvoriFragmentKaoDialog(TerminActivity.this, new DatePickerFragment());

            }
        });

Button zauzeti=findViewById(R.id.zauzeti);
zauzeti.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       Util.otvoriFragmentKaoDialog(TerminActivity.this,new ZauzetiTerminiDialogFragment());

    }
});


        Button btn=(Button)findViewById(R.id.termin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  Calendar c=Calendar.getInstance();
                year=c.get(Calendar.YEAR);
                month=c.get(Calendar.MONTH);
                day=c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog=new DatePickerDialog(TerminActivity.this,TerminActivity.this,year,month,day);
                datePickerDialog.show();*/
               final TerminVM p = new TerminVM();
                TextView razlog=findViewById(R.id.txtrazlog);
                p.RazlogPosjete=razlog.getText().toString();
                p.Odobren=false;
                TextView datumm=findViewById(R.id.naslovdatum);
                TextView naslovvrijeme=findViewById(R.id.naslovVrijeme);
                p.Vrijeme=naslovvrijeme.getText().toString();
                p.PacijentId = Sesija.getlogiraniKorisnik().Id;
                p.Datum=datumm.getText().toString();


                TerminApi.Terminboool(TerminActivity.this, new MyRunnable<Boolean>() {
                    @Override
                    public void run(Boolean value) {
                        if (value){
                            Toast.makeText(TerminActivity.this,"Termin je slobodan",Toast.LENGTH_SHORT).show();
                            postTermin(p);

                        }else{
                            Toast.makeText(TerminActivity.this,"Termin je zauzet",Toast.LENGTH_SHORT).show();

                        }
                    }
                },p.Datum,p.Vrijeme);
            }


        });



}

    private void postTermin(final TerminVM p) {
        TerminApi.postTermin(getApplicationContext(), new MyRunnable<TerminVM>() {
            @Override
            public void run(TerminVM result) {
                if (result != null) {

                    DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                    DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

                    Date date = null;
                    try {
                        date = inputFormat.parse(p.Datum);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    String outputDateStr = outputFormat.format(date);
                    String body = "Termin za: "+outputDateStr;
                    String tittle = "Uspješno rezervisano";
                    Intent intent = new Intent(TerminActivity.this, TerminActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    PendingIntent p = PendingIntent.getActivity(TerminActivity.this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
                    Uri sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                    NotificationCompat.Builder notify = new NotificationCompat.Builder(TerminActivity.this)
                            .setContentText(body).
                                    setContentTitle(tittle)
                            .setSmallIcon(R.drawable.icon)
                            .setSound(sound)
                            .setAutoCancel(true)
                            .setContentIntent(p);


                    NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    notif.notify(0, notify.build());
                 //   Toast.makeText(getApplicationContext(), "Termin je spašen ", Toast.LENGTH_SHORT).show();

                } else
                    Toast.makeText(getApplicationContext(), "Greška, pokušajte kasnije ", Toast.LENGTH_SHORT).show();
            }
        }, p);
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
if(view.isShown()) {
    TextView naslovvrijeme = findViewById(R.id.naslovVrijeme);
    TextView datumm = findViewById(R.id.naslovdatum);
    hourFinal = String.valueOf(hourOfDay);
    minuteFinal = String.valueOf(minute);
    if (hourOfDay < 10) {

        hourFinal = "0" + hourFinal;
    }
    if (minute < 10) {

        minuteFinal = "0" + minuteFinal;
    }
    datumm.setText(yearFinal + "-" + monthFinal + "-" + dayFinal);
    naslovvrijeme.setText(hourFinal + ":" + minuteFinal);


}





    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        if (view.isShown()) {
            TextView datumm = findViewById(R.id.naslovdatum);
            //  datumm.setText(DateFormat.getDateInstance(DateFormat.SHORT).format((c.getTime())));
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            //  datumm.setText(format1.format(c.getTime()));
            yearFinal = String.valueOf(year);
            monthFinal = String.valueOf(month + 1);
            dayFinal = String.valueOf(dayOfMonth);
            if (month < 10) {

                monthFinal = "0" + monthFinal;
            }
            if (dayOfMonth < 10) {

                dayFinal = "0" + dayFinal;
            }
            Calendar c = Calendar.getInstance();
            hour = c.get(Calendar.HOUR_OF_DAY);
            minute = c.get(Calendar.MINUTE);
            TimePickerDialog timePickerDialog = new TimePickerDialog(TerminActivity.this, (TimePickerDialog.OnTimeSetListener) TerminActivity.this, hour, minute, android.text.format.DateFormat.is24HourFormat(TerminActivity.this));

            timePickerDialog.show();
        }

    }





}
