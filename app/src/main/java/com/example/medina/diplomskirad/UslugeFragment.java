package com.example.medina.diplomskirad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.PregledApi;
import com.example.medina.diplomskirad.Api.UslugaApi;
import com.example.medina.diplomskirad.Helper.Global;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.PregledVM;
import com.example.medina.diplomskirad.Model.UslugaVM;

import org.json.JSONArray;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class UslugeFragment extends Fragment {
    private static final String ARG_MODEL = "model";
    private ListView uslugeLV;
    public static ArrayList<UslugaVM.UslugaInfo> lista = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_usluge, container, false);
           uslugeLV=(ListView) rootView.findViewById(R.id.listaUsluga);
       final EditText unos=(EditText) rootView.findViewById(R.id.txtPretraga);

        ImageButton pretraga=(ImageButton) rootView.findViewById(R.id.btnPretraga);

            UslugaApi.getAllUsluge(getContext(),
                    new MyRunnable<JSONArray>() {
                        @Override
                        public void run(final JSONArray result) {
                            if (result == null)
                                Toast.makeText(getContext(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                            else {

                                Global.sveUsluge = UslugaApi.jsonToUslugeList(result);


                                uslugeLV.setAdapter(new BaseAdapter() {
                                    @Override
                                    public int getCount() {
                                        return Global.sveUsluge.size();
                                    }

                                    @Override
                                    public Object getItem(int position) {
                                        return Global.sveUsluge.get(position);
                                    }

                                    @Override
                                    public long getItemId(int position) {
                                        return position;
                                    }

                                    @Override
                                    public View getView(int position, View view, ViewGroup parent) {
                                        UslugaVM.UslugaInfo p = Global.sveUsluge.get(position);

                                        if (view == null) {

                                            view = getLayoutInflater().inflate(R.layout.usluga_lista_layout, parent, false);
                                        }


                                        TextView nazivP = (TextView) view.findViewById(R.id.nazivUsluge);
                                        ImageView slika = (ImageView) view.findViewById(R.id.uslugaImage);
                                        TextView ocjena = (TextView) view.findViewById(R.id.ocjenaInt);
                                        if(p.Ocjena!=0) {

                                            ocjena.setText(String.valueOf(p.Ocjena));
                                        }
                                        if(p.Ocjena==0) {
                                            ocjena.setText("0");
                                        }
                                        nazivP.setText(p.Vrsta);

                                        byte[] decodedBytes = Base64.decode(p.Slika, Base64.DEFAULT);
                                        Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);

                                        slika.setImageBitmap(bitmap);
                                        return view;
                                    }
                                });((BaseAdapter) uslugeLV.getAdapter()).notifyDataSetChanged();
                            }
                        }
                    });

      pretraga.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(!unos.getText().toString().equals("")){
                  UslugaApi.getUslugeByNaziv(getActivity(),unos.getText().toString(),
                          new MyRunnable<JSONArray>() {
                              @Override
                              public void run(final JSONArray result) {
                                  if (result == null)
                                      Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                                  else {

                                      Global.sveUsluge = UslugaApi.jsonToUslugeList(result);
                                      uslugeLV.setAdapter(new BaseAdapter() {
                                          @Override
                                          public int getCount() {
                                              return Global.sveUsluge.size();
                                          }

                                          @Override
                                          public Object getItem(int position) {
                                              return Global.sveUsluge.get(position);
                                          }

                                          @Override
                                          public long getItemId(int position) {
                                              return position;
                                          }

                                          @Override
                                          public View getView(int position, View view, ViewGroup parent) {
                                              UslugaVM.UslugaInfo p = Global.sveUsluge.get(position);

                                              if (view == null) {

                                                  view = getLayoutInflater().inflate(R.layout.usluga_lista_layout, parent, false);
                                              }


                                              TextView nazivP = (TextView) view.findViewById(R.id.nazivUsluge);
                                              ImageView slika = (ImageView) view.findViewById(R.id.uslugaImage);
                                              TextView ocjena = (TextView) view.findViewById(R.id.ocjenaInt);
                                              if(p.Ocjena!=0) {

                                                  ocjena.setText(String.valueOf(p.Ocjena));
                                              }
                                              if(p.Ocjena==0) {
                                                  ocjena.setText("0");
                                              }

                                              nazivP.setText(p.Vrsta);

                                              byte[] decodedBytes = Base64.decode(p.Slika, Base64.DEFAULT);
                                              Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);

                                              slika.setImageBitmap(bitmap);
                                              return view;
                                          }
                                      });((BaseAdapter) uslugeLV.getAdapter()).notifyDataSetChanged();
                                  }
                              }
                          });


              }
              else{
                  UslugaApi.getAllUsluge(getActivity(),
                          new MyRunnable<JSONArray>() {
                              @Override
                              public void run(final JSONArray result) {
                                  if (result == null)
                                      Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                                  else {

                                      Global.sveUsluge = UslugaApi.jsonToUslugeList(result);
                                      uslugeLV.setAdapter(new BaseAdapter() {
                                          @Override
                                          public int getCount() {
                                              return Global.sveUsluge.size();
                                          }

                                          @Override
                                          public Object getItem(int position) {
                                              return Global.sveUsluge.get(position);
                                          }

                                          @Override
                                          public long getItemId(int position) {
                                              return position;
                                          }

                                          @Override
                                          public View getView(int position, View view, ViewGroup parent) {
                                              UslugaVM.UslugaInfo p = Global.sveUsluge.get(position);

                                              if (view == null) {

                                                  view = getLayoutInflater().inflate(R.layout.usluga_lista_layout, parent, false);
                                              }


                                              TextView nazivP = (TextView) view.findViewById(R.id.nazivUsluge);
                                              ImageView slika = (ImageView) view.findViewById(R.id.uslugaImage);
                                              TextView ocjena = (TextView) view.findViewById(R.id.ocjenaInt);
                                              if(p.Ocjena!=0) {

                                                  ocjena.setText(String.valueOf(p.Ocjena));
                                              }
                                              if(p.Ocjena==0) {
                                                  ocjena.setText("0");
                                              }

                                              nazivP.setText(p.Vrsta);

                                              byte[] decodedBytes = Base64.decode(p.Slika, Base64.DEFAULT);
                                              Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);

                                              slika.setImageBitmap(bitmap);
                                              return view;
                                          }
                                      });((BaseAdapter) uslugeLV.getAdapter()).notifyDataSetChanged();
                                  }
                              }
                          });



              }
          }
      });


        uslugeLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                UslugaVM.UslugaInfo x = Global.sveUsluge.get(position);
                Sesija.setOdabranaUsluga(x);
                UslugaApi.getNeocjenjene(getActivity(), x.Id,Sesija.getlogiraniKorisnik().Id,
                        new MyRunnable<JSONArray>() {
                            @Override
                            public void run(final JSONArray result) {
                                if (result == null)
                                    Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                                else {

                                    lista= UslugaApi.jsonToUslugeList(result);

                                    if(lista.size() !=0){
                                        OcijeniUsluguFragment d=new OcijeniUsluguFragment();
                                        Bundle arg=new Bundle();
                                        arg.putSerializable("usluga",Sesija.getOdabranaUsluga());
                                        d.setArguments(arg);
                                        Util.otvoriFragmentKaoDialog(getActivity(),d);
                                    }


                                }
                            }
                        });



            }
        });


        return rootView;
    }



}
