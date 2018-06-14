package com.example.medina.diplomskirad;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.UslugaApi;
import com.example.medina.diplomskirad.Api.ZubApi;
import com.example.medina.diplomskirad.Helper.Global;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.OcjenaVM;
import com.example.medina.diplomskirad.Model.UslugaVM;
import com.example.medina.diplomskirad.Model.ZubVM;

import org.json.JSONArray;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class OcijeniUsluguFragment extends DialogFragment {
    private int progressValue;
    public static ArrayList<UslugaVM.UslugaInfo> lista = new ArrayList<>();

    public OcijeniUsluguFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_ocijeni_uslugu, container, false);
        Bundle args = getArguments(); final  UslugaVM.UslugaInfo usluga;
        if (args != null) {
         usluga= (UslugaVM.UslugaInfo) args.getSerializable("usluga");
            if (args.getSerializable("usluga") != null) {
                getDialog().setTitle("Ocijeni uslugu");

                getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            }
            final TextView nazivUsluge = (TextView) view.findViewById(R.id.ocjeni_product_nazivProizvoidaTxt);
            final ImageView imageView = (ImageView) view.findViewById(R.id.ocjeni_product_productDetailImage);
            final TextView ocjenaseekBarTextView = (TextView) view.findViewById(R.id.ocjena);

            final Button ocjeniUslugu = (Button) view.findViewById(R.id.ocjeni_product_OcjeniBtn);


            final SeekBar brojUslugaseekBar = (SeekBar) view.findViewById(R.id.uslugaSeekBar);


            nazivUsluge.setText(usluga.Vrsta);


            byte[] decodedBytes = Base64.decode(usluga.Slika, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);

            imageView.setImageBitmap(bitmap);


            if (args.getSerializable("usluga") != null) {


                ocjenaseekBarTextView.setVisibility(View.VISIBLE);
                ocjeniUslugu.setVisibility(View.VISIBLE);
                brojUslugaseekBar.setVisibility(View.VISIBLE);


                ocjenaseekBarTextView.setText("Ocjena: " + brojUslugaseekBar.getProgress() + "/" + brojUslugaseekBar.getMax());
                brojUslugaseekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        ocjenaseekBarTextView.setText("Ocjena: " + progress + "/" + seekBar.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        ocjenaseekBarTextView.setText("Ocjena: " + progressValue + "/" + seekBar.getMax());

                    }
                });

                 ocjeniUslugu.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         OcjenaVM ocjena = new OcjenaVM();
                         ocjena.PacijentId = Sesija.getlogiraniKorisnik().Id;

                         Calendar c = Calendar.getInstance();
                         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                         String strDate = sdf.format(c.getTime());

                         ocjena.DatumOcjenjivanja = strDate;

                         ocjena.UslugaId = usluga.Id;
                         ocjena.OcjenaInt = progressValue;

                         UslugaApi.postOcjena(MyApp.getContext(), new MyRunnable<OcjenaVM>() {
                             @Override
                             public void run(OcjenaVM result) {
                                 Toast.makeText(MyApp.getContext(), "Uspješno ste ocijenili proizvod ", Toast.LENGTH_SHORT).show();
                             }
                         }, ocjena);

                     }
                 }

                 );  getDialog().dismiss();



            }

        }
            return view;
        }
    @Override
    public void onDismiss(final DialogInterface dialog) {
        super.onDismiss(dialog);
        final Activity activity = getActivity();
        if (activity instanceof DialogInterface.OnDismissListener) {
            ((DialogInterface.OnDismissListener) activity).onDismiss(dialog);
        }
    }

}
