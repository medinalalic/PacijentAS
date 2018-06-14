package com.example.medina.diplomskirad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.medina.diplomskirad.Api.PregledApi;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.PregledVM;

import java.text.SimpleDateFormat;

public class HistorijaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historija);

       final ListView lista=(ListView)findViewById(R.id.listapregleda);

            MyRunnable<PregledVM> onSuccess=new MyRunnable<PregledVM>() {
                @Override
                public void run(final PregledVM response) {


                    lista.setAdapter(new BaseAdapter() {
                        @Override
                        public int getCount() {
                            return response.PregledLista.size();
                        }

                        @Override
                        public Object getItem(int position) {
                            return response.PregledLista.get(position);
                        }

                        @Override
                        public long getItemId(int position) {
                            return response.PregledLista.get(position).Id;
                        }

                        @Override
                        public View getView(int position, View view, ViewGroup parent) {
                            if (view == null) {
                                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                                view = inflater.inflate(R.layout.layout_pregled_item, parent, false);
                            }
                            final PregledVM.PregledInfo x = response.PregledLista.get(position);
                            final SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
                            final SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");

                            ((TextView) view.findViewById(R.id.txtDatum)).setText( x.Datum != null ? sdf1.format(x.Datum) : "");
                            ((TextView) view.findViewById(R.id.txtVrijeme)).setText( x.Vrijeme != null ? sdf2.format(x.Vrijeme) : "");



                            return view;
                        }
                    });
                }
            };

            PregledApi.getPregled(getBaseContext(), onSuccess, Sesija.getlogiraniKorisnik().Id);

    }
}
