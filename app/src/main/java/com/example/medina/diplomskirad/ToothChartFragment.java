package com.example.medina.diplomskirad;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.PregledApi;
import com.example.medina.diplomskirad.Api.UslugaApi;
import com.example.medina.diplomskirad.Api.ZubApi;
import com.example.medina.diplomskirad.Helper.Global;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.PregledVM;
import com.example.medina.diplomskirad.Model.UslugaVM;
import com.example.medina.diplomskirad.Model.ZubVM;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class ToothChartFragment extends Fragment {
    public static ArrayList<ZubVM.ZubInfo> lista = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista11 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista12 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista22 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista14 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista15 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista16 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista17 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista18 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista21 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista23 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista24 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista25 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista26 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista27 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista28 = new ArrayList<>();
   public static ArrayList<ZubVM.ZubInfo> lista31 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista32 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista33 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista34 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista35 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista36 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista37 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista38 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista41 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista42 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista43 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista44 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista45 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista46 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista47 = new ArrayList<>();
    public static ArrayList<ZubVM.ZubInfo> lista48 = new ArrayList<>();

    public ToothChartFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_tooth_chart, container, false);

        TextView tv=(TextView)view.findViewById(R.id.txtPacijent);
        tv.setText("Pacijent: "+Sesija.getlogiraniKorisnik().Ime+" "+Sesija.getlogiraniKorisnik().Prezime);

        final  ImageView zub13=(ImageView)view.findViewById(R.id.zub13);
        final  ImageView zub11=(ImageView)view.findViewById(R.id.zub11);
        final  ImageView zub12=(ImageView)view.findViewById(R.id.zub12);
        final  ImageView zub22=(ImageView)view.findViewById(R.id.zub22);
        final  ImageView zub14=(ImageView)view.findViewById(R.id.zub14);
        final  ImageView zub15=(ImageView)view.findViewById(R.id.zub15);
        final  ImageView zub16=(ImageView)view.findViewById(R.id.zub16);
        final  ImageView zub17=(ImageView)view.findViewById(R.id.zub17);
        final  ImageView zub18=(ImageView)view.findViewById(R.id.zub18);
        final  ImageView zub21=(ImageView)view.findViewById(R.id.zub21);
        final  ImageView zub23=(ImageView)view.findViewById(R.id.zub23);
        final  ImageView zub24=(ImageView)view.findViewById(R.id.zub24);
        final  ImageView zub25=(ImageView)view.findViewById(R.id.zub25);
        final  ImageView zub26=(ImageView)view.findViewById(R.id.zub26);
       final  ImageView zub27=(ImageView)view.findViewById(R.id.zub27);
        final  ImageView zub28=(ImageView)view.findViewById(R.id.zub28);
        final  ImageView zub31=(ImageView)view.findViewById(R.id.zub31);
        final  ImageView zub32=(ImageView)view.findViewById(R.id.zub32);
        final  ImageView zub33=(ImageView)view.findViewById(R.id.zub33);
        final  ImageView zub34=(ImageView)view.findViewById(R.id.zub34);
        final  ImageView zub35=(ImageView)view.findViewById(R.id.zub35);
        final  ImageView zub36=(ImageView)view.findViewById(R.id.zub36);
        final  ImageView zub37=(ImageView)view.findViewById(R.id.zub37);
        final  ImageView zub38=(ImageView)view.findViewById(R.id.zub38);
        final  ImageView zub41=(ImageView)view.findViewById(R.id.zub41);
        final  ImageView zub42=(ImageView)view.findViewById(R.id.zub42);
        final  ImageView zub43=(ImageView)view.findViewById(R.id.zub43);
        final  ImageView zub44=(ImageView)view.findViewById(R.id.zub44);
        final  ImageView zub45=(ImageView)view.findViewById(R.id.zub45);
        final  ImageView zub46=(ImageView)view.findViewById(R.id.zub46);
        final  ImageView zub47=(ImageView)view.findViewById(R.id.zub47);
        final  ImageView zub48=(ImageView)view.findViewById(R.id.zub48);




        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,13,
                        new MyRunnable<JSONArray>() {
                            @Override
                            public void run(final JSONArray result) {
                                if (result == null)
                                    Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                                else {

                                 lista= ZubApi.jsonToZubList(result);


                                    int id=result.length();
                                    if(id!=0){
                                        Global.zubi=lista;
                                    }

                                    if(Global.zubi != null)
                                        zub13.setImageResource(R.drawable.zubicplavi);
                                    else  zub13.setImageResource(R.drawable.zubic);

                                }
                            }
                        });



            zub13.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(lista!=null) {
       Bundle arg=new Bundle();
       arg.putSerializable("zubic",lista);


            ToothDetaljiFragment d=new ToothDetaljiFragment();
            d.setArguments(arg);
            Util.otvoriFragmentKaoDialog(getActivity(), d);
        }else{ zub13.setEnabled(false);}



    }
});

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,11,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista11= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi11=lista11;
                            }

                            if(Global.zubi11 != null)
                                zub11.setImageResource(R.drawable.zub11plavi);
                            else  zub11.setImageResource(R.drawable.zub11);

                        }
                    }
                });



        zub11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic11",lista11);
                d.setArguments(arg);

                    Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,12,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista12= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi12=lista12;
                            }

                            if(Global.zubi12 != null)
                                zub12.setImageResource(R.drawable.plavi12);
                            else  zub12.setImageResource(R.drawable.zub12);

                        }
                    }
                });



    zub12.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ToothDetaljiFragment d = new ToothDetaljiFragment();
            Bundle arg = new Bundle();
            arg.putSerializable("zubic12", lista12);
            d.setArguments(arg);

            Util.otvoriFragmentKaoDialog(getActivity(), d);


        }
    });


        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,22,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista22= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi22=lista22;
                            }

                            if(Global.zubi22 != null)
                                zub22.setImageResource(R.drawable.rozi22);
                            else  zub22.setImageResource(R.drawable.zub22);

                        }
                    }
                });



        zub22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic22",lista22);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,14,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista14= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi14=lista14;
                            }

                            if(Global.zubi14 != null)
                                zub14.setImageResource(R.drawable.zubplavi);
                            else  zub14.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic14",lista14);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,15,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista15= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi15=lista15;
                            }

                            if(Global.zubi15 != null)
                                zub15.setImageResource(R.drawable.zubplavi);
                            else  zub15.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic15",lista15);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,16,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista16= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi16=lista16;
                            }

                            if(Global.zubi16 != null)
                                zub16.setImageResource(R.drawable.zubplavi);
                            else  zub16.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic16",lista16);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,17,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista17= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi17=lista17;
                            }

                            if(Global.zubi17 != null)
                                zub17.setImageResource(R.drawable.zubplavi);
                            else  zub17.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic17",lista17);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,18,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista18= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi18=lista18;
                            }

                            if(Global.zubi18 != null)
                                zub18.setImageResource(R.drawable.zubplavi);
                            else  zub18.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic18",lista18);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,21,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista21= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi21=lista21;
                            }

                            if(Global.zubi21 != null)
                                zub21.setImageResource(R.drawable.rozi21);
                            else  zub21.setImageResource(R.drawable.zub21);

                        }
                    }
                });



        zub21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic21",lista21);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,23,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista23= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi23=lista23;
                            }

                            if(Global.zubi23 != null)
                                zub23.setImageResource(R.drawable.zubdesnirozi);
                            else  zub23.setImageResource(R.drawable.zubdesni);

                        }
                    }
                });



        zub23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic23",lista23);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,24,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista24= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi24=lista24;
                            }

                            if(Global.zubi24 != null)
                                zub24.setImageResource(R.drawable.zubrozi);
                            else  zub24.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic24",lista24);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,25,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista25= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi25=lista25;
                            }

                            if(Global.zubi25 != null)
                                zub25.setImageResource(R.drawable.zubrozi);
                            else  zub25.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic25",lista25);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,26,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista26= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi26=lista26;
                            }

                            if(Global.zubi26 != null)
                                zub26.setImageResource(R.drawable.zubrozi);
                            else  zub26.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic26",lista26);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,27,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista27= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi27=lista27;
                            }

                            if(Global.zubi27 != null)
                                zub27.setImageResource(R.drawable.zubrozi);
                            else  zub27.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic27",lista27);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,28,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista28= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi28=lista28;
                            }

                            if(Global.zubi28 != null)
                                zub28.setImageResource(R.drawable.zubrozi);
                            else  zub28.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic28",lista28);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,38,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista38= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi38=lista38;
                            }

                            if(Global.zubi38 != null)
                                zub38.setImageResource(R.drawable.zubrozi);
                            else  zub38.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic38",lista38);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,37,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista37= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi37=lista37;
                            }

                            if(Global.zubi37 != null)
                                zub37.setImageResource(R.drawable.zubrozi);
                            else  zub37.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic37",lista37);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,36,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista36= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi36=lista36;
                            }

                            if(Global.zubi36 != null)
                                zub36.setImageResource(R.drawable.zubrozi);
                            else  zub36.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic36",lista36);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,35,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista35= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi35=lista35;
                            }

                            if(Global.zubi35 != null)
                                zub35.setImageResource(R.drawable.zubrozi);
                            else  zub35.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic35",lista35);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,34,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista34= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi34=lista34;
                            }

                            if(Global.zubi34 != null)
                                zub34.setImageResource(R.drawable.zubrozi);
                            else  zub34.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic34",lista34);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,48,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista48= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi48=lista48;
                            }

                            if(Global.zubi48 != null)
                                zub48.setImageResource(R.drawable.zubplavi);
                            else  zub48.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic48",lista48);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,47,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista47= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi47=lista47;
                            }

                            if(Global.zubi47 != null)
                                zub47.setImageResource(R.drawable.zubplavi);
                            else  zub47.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic47",lista47);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,46,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista46= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi46=lista46;
                            }

                            if(Global.zubi46 != null)
                                zub46.setImageResource(R.drawable.zubplavi);
                            else  zub46.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic46",lista46);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,45,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista45= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi45=lista45;
                            }

                            if(Global.zubi45 != null)
                                zub45.setImageResource(R.drawable.zubplavi);
                            else  zub45.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic45",lista45);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,44,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista44= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi44=lista44;
                            }

                            if(Global.zubi44 != null)
                                zub44.setImageResource(R.drawable.zubplavi);
                            else  zub44.setImageResource(R.drawable.zub);

                        }
                    }
                });



        zub44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic44",lista44);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,33,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista33= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi33=lista33;
                            }

                            if(Global.zubi33 != null)
                                zub33.setImageResource(R.drawable.zubdesnirozi);
                            else  zub33.setImageResource(R.drawable.zubdesni);

                        }
                    }
                });



        zub33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic33",lista33);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,32,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista32= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi32=lista32;
                            }

                            if(Global.zubi32 != null)
                                zub32.setImageResource(R.drawable.zub32rozi);
                            else  zub32.setImageResource(R.drawable.zub32);

                        }
                    }
                });



        zub32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic32",lista32);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,31,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista31= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi31=lista31;
                            }

                            if(Global.zubi31 != null)
                                zub31.setImageResource(R.drawable.zub31rozi);
                            else  zub31.setImageResource(R.drawable.zub31);

                        }
                    }
                });



        zub31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic31",lista31);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,43,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista43= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi43=lista43;
                            }

                            if(Global.zubi43 != null)
                                zub43.setImageResource(R.drawable.zubicplavi);
                            else  zub43.setImageResource(R.drawable.zubic);

                        }
                    }
                });



        zub43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic43",lista43);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });

        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,42,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista42= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi42=lista42;
                            }

                            if(Global.zubi42 != null)
                                zub42.setImageResource(R.drawable.zub42plavi);
                            else  zub42.setImageResource(R.drawable.zub42);

                        }
                    }
                });



        zub42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic42",lista42);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });
        ZubApi.getDetalji(getActivity(),Sesija.getlogiraniKorisnik().Id,41,
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            lista41= ZubApi.jsonToZubList(result);


                            int id=result.length();
                            if(id!=0){
                                Global.zubi41=lista41;
                            }

                            if(Global.zubi41 != null)
                                zub41.setImageResource(R.drawable.zub41plavi);
                            else  zub41.setImageResource(R.drawable.zub41);

                        }
                    }
                });



        zub41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToothDetaljiFragment d=new ToothDetaljiFragment();
                Bundle arg=new Bundle();
                arg.putSerializable("zubic41",lista41);
                d.setArguments(arg);

                Util.otvoriFragmentKaoDialog(getActivity(), d);


            }
        });


        return view;
    }


}
