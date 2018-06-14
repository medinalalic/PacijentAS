package com.example.medina.diplomskirad;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.TerminApi;
import com.example.medina.diplomskirad.Api.ZubApi;
import com.example.medina.diplomskirad.Helper.Global;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.TerminVM;
import com.example.medina.diplomskirad.Model.ZubVM;

import org.json.JSONArray;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;


public class ZauzetiTerminiDialogFragment extends DialogFragment {
    private ArrayList<TerminVM.TerminInfo> termin = new ArrayList<>();

    public ZauzetiTerminiDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_zauzeti_termini_dialog, container, false);
getDialog().setTitle("Rezervisani termini");
   final  ListView lista=view.findViewById(R.id.listazauzetih);
        TerminApi.getZauzeteTermine(getActivity(),
                new MyRunnable<JSONArray>() {
                    @Override
                    public void run(final JSONArray result) {
                        if (result == null)
                            Toast.makeText(getActivity(), "Neuspješno obavljeno", Toast.LENGTH_SHORT).show();
                        else {

                            termin= TerminApi.jsonToTerminList(result);

                            lista.setAdapter(new BaseAdapter() {
                                @Override
                                public int getCount() {
                                    return termin.size();
                                }

                                @Override
                                public Object getItem(int position) {
                                    return termin.get(position);
                                }

                                @Override
                                public long getItemId(int position) {
                                    return 0;
                                }

                                @Override
                                public View getView(int position, View view, ViewGroup parent) {
                                    if (view == null) {
                                        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                                        view = inflater.inflate(R.layout.layout_zauzeti, parent, false);
                                    }
                                    final TerminVM.TerminInfo x = termin.get(position);


                                    DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                                    DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

                                    Date date = null;
                                    try {
                                        date = inputFormat.parse(x.Datum);
                                    } catch (ParseException e) {
                                        e.printStackTrace();
                                    }
                                    String outputDateStr = outputFormat.format(date);
                                    TextView datumm = view.findViewById(R.id.datumt);
                                    datumm.setText(outputDateStr);

                                    return view;
                                }
                            });




                        }
                    }
                });

getDialog().dismiss();
        return view;
    }


}
