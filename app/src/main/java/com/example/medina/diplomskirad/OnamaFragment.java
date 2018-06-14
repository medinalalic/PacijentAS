package com.example.medina.diplomskirad;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class OnamaFragment extends Fragment {

    public OnamaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_onama, container, false);
        Button usluge=(Button)view.findViewById(R.id.btnUsluge);
        usluge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Util.otvoriFragmentKaoReplace(getActivity(),R.id.mjestoFragmenta,new UslugeFragment());

            }
        });
        return view;
    }

}
