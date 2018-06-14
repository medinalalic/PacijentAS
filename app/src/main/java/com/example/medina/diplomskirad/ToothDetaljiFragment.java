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

import com.example.medina.diplomskirad.Model.PregledVM;
import com.example.medina.diplomskirad.Model.ZubVM;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ToothDetaljiFragment extends DialogFragment {
    private ArrayList<ZubVM.ZubInfo> zubic = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic11 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic12 = new ArrayList<>();

    private ArrayList<ZubVM.ZubInfo> zubic14 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic15 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic16 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic17 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic18 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic21 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic22 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic23 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic24 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic25 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic26 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic27 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic28 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic31 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic32 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic33 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic34 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic35 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic36 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic37 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic38 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic41 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic42 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic43 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic44 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic45 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic46 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic47 = new ArrayList<>();
    private ArrayList<ZubVM.ZubInfo> zubic48 = new ArrayList<>();

    public ToothDetaljiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_tooth_detalji, container, false);
        Bundle args=getArguments();
        if(args!=null) {



            zubic = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic");
            zubic11 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic11");
            zubic12 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic12");
            zubic14 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic14");
            zubic15 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic15");
            zubic16 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic16");
            zubic17 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic17");
            zubic18 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic18");
            zubic21 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic21");
            zubic23 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic23");
            zubic24 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic24");
            zubic26 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic26");
            zubic27 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic27");
            zubic28 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic28");
            zubic22 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic22");
            zubic31 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic31");
            zubic32 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic32");
            zubic33 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic33");
            zubic34 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic34");
            zubic35 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic35");
            zubic36 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic36");
            zubic37 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic37");
            zubic38 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic38");
            zubic41 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic41");
            zubic42 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic42");
            zubic43 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic43");
            zubic44 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic44");
            zubic45 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic45");
            zubic46 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic46");
            zubic47 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic47");
            zubic48 = (ArrayList<ZubVM.ZubInfo>) args.getSerializable("zubic48");


            ListView lista11 = view.findViewById(R.id.listaPregledaZub11);
            ListView lista12 = view.findViewById(R.id.listaPregledaZub12);
            ListView lista13 = view.findViewById(R.id.listaPregledaZub13);
            ListView lista14 = view.findViewById(R.id.listaPregledaZub14);
            ListView lista15 = view.findViewById(R.id.listaPregledaZub15);
            ListView lista16 = view.findViewById(R.id.listaPregledaZub16);
            ListView lista17 = view.findViewById(R.id.listaPregledaZub17);
            ListView lista18 = view.findViewById(R.id.listaPregledaZub18);



            ListView lista21 = view.findViewById(R.id.listaPregledaZub21);
            ListView lista22 = view.findViewById(R.id.listaPregledaZub22);
            ListView lista23 = view.findViewById(R.id.listaPregledaZub23);
            ListView lista24 = view.findViewById(R.id.listaPregledaZub24);
            ListView lista25 = view.findViewById(R.id.listaPregledaZub25);
            ListView lista26 = view.findViewById(R.id.listaPregledaZub26);
            ListView lista27 = view.findViewById(R.id.listaPregledaZub27);
            ListView lista28 = view.findViewById(R.id.listaPregledaZub28);


            ListView lista31 = view.findViewById(R.id.listaPregledaZub31);
            ListView lista32 = view.findViewById(R.id.listaPregledaZub32);
            ListView lista33 = view.findViewById(R.id.listaPregledaZub33);
            ListView lista34 = view.findViewById(R.id.listaPregledaZub34);
            ListView lista35 = view.findViewById(R.id.listaPregledaZub35);
            ListView lista36 = view.findViewById(R.id.listaPregledaZub36);
            ListView lista37 = view.findViewById(R.id.listaPregledaZub37);
            ListView lista38 = view.findViewById(R.id.listaPregledaZub38);

            ListView lista41 = view.findViewById(R.id.listaPregledaZub41);
            ListView lista42 = view.findViewById(R.id.listaPregledaZub42);
            ListView lista43 = view.findViewById(R.id.listaPregledaZub43);
            ListView lista44 = view.findViewById(R.id.listaPregledaZub44);
            ListView lista45 = view.findViewById(R.id.listaPregledaZub45);
            ListView lista46 = view.findViewById(R.id.listaPregledaZub46);
            ListView lista47 = view.findViewById(R.id.listaPregledaZub47);
            ListView lista48 = view.findViewById(R.id.listaPregledaZub48);


            getDialog().setTitle("Detalji pregleda");
            if (zubic41 != null) {

                lista41.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic41.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic41.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic41.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista41.getAdapter()).notifyDataSetChanged();
            }
            if (zubic42 != null) {
                lista42.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic42.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic42.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic42.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista42.getAdapter()).notifyDataSetChanged();
            }
            if (zubic43 != null) {
                lista43.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic43.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic43.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic43.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista43.getAdapter()).notifyDataSetChanged();
            }
            if (zubic44 != null) {
                lista44.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic44.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic44.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic44.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista44.getAdapter()).notifyDataSetChanged();
            }
            if (zubic45 != null) {
                lista45.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic45.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic45.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic45.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista45.getAdapter()).notifyDataSetChanged();
            }

            if (zubic46 != null) {
                lista46.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic46.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic46.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic46.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista46.getAdapter()).notifyDataSetChanged();
            }
            if (zubic47 != null) {
                lista47.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic47.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic47.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic47.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista47.getAdapter()).notifyDataSetChanged();
            }
            if (zubic48 != null) {
                lista48.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic48.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic48.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic48.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista48.getAdapter()).notifyDataSetChanged();
            }
            if (zubic31 != null) {
                lista31.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic31.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic31.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic31.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista31.getAdapter()).notifyDataSetChanged();
            }

            if (zubic32 != null) {
                lista32.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic32.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic32.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic32.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista32.getAdapter()).notifyDataSetChanged();
            }

            if (zubic33 != null) {
                lista33.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic33.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic33.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic33.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista33.getAdapter()).notifyDataSetChanged();
            }

            if (zubic34 != null) {
                lista34.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic34.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic34.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic34.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista34.getAdapter()).notifyDataSetChanged();
            }

            if (zubic35 != null) {
                lista35.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic35.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic35.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic35.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista35.getAdapter()).notifyDataSetChanged();
            }
            if (zubic36 != null) {
                lista36.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic36.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic36.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic36.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista36.getAdapter()).notifyDataSetChanged();
            }
            if (zubic37 != null) {
                lista37.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic37.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic37.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic37.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista37.getAdapter()).notifyDataSetChanged();
            }

            if (zubic38 != null) {
                lista38.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic38.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic38.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic38.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista38.getAdapter()).notifyDataSetChanged();
            }


            if (zubic22 != null) {
                lista22.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic22.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic22.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic22.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista22.getAdapter()).notifyDataSetChanged();
            }
            if (zubic21 != null) {
                lista21.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic21.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic21.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic21.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista21.getAdapter()).notifyDataSetChanged();
            }

            if (zubic23 != null) {
                lista23.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic23.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic23.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic23.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista23.getAdapter()).notifyDataSetChanged();
            }
            if (zubic24 != null) {
                lista24.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic24.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic24.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic24.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista24.getAdapter()).notifyDataSetChanged();
            }
            if (zubic25 != null) {
                lista25.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic25.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic25.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic25.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista25.getAdapter()).notifyDataSetChanged();
            }

            if (zubic26 != null) {
                lista26.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic26.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic26.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic26.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista26.getAdapter()).notifyDataSetChanged();
            }

            if (zubic27 != null) {
                lista27.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic27.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic27.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic27.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista27.getAdapter()).notifyDataSetChanged();
            }

            if (zubic28 != null) {
                lista28.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic28.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic28.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic28.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista28.getAdapter()).notifyDataSetChanged();
            }

            if (zubic != null) {
                lista13.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista13.getAdapter()).notifyDataSetChanged();
            }

            if (zubic11 != null) {
                lista11.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic11.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic11.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic11.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista11.getAdapter()).notifyDataSetChanged();
            }

            if (zubic12 != null) {
                lista12.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic12.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic12.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic12.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista12.getAdapter()).notifyDataSetChanged();
            }

            if (zubic14 != null) {
                lista14.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic14.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic14.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic14.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista14.getAdapter()).notifyDataSetChanged();
            }

            if (zubic15 != null) {
                lista15.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic15.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic15.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic15.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista15.getAdapter()).notifyDataSetChanged();
            }


            if (zubic16 != null) {
                lista16.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic16.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic16.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic16.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista16.getAdapter()).notifyDataSetChanged();
            }
            if (zubic17 != null) {
                lista17.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic17.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic17.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic17.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista17.getAdapter()).notifyDataSetChanged();
            }
            if (zubic18 != null) {
                lista18.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return zubic18.size();
                    }

                    @Override
                    public Object getItem(int position) {
                        return zubic18.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View view, ViewGroup parent) {
                        if (view == null) {
                            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            view = inflater.inflate(R.layout.layout_historijapregleda_item, parent, false);
                        }
                        final ZubVM.ZubInfo x = zubic18.get(position);


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");

                        Date date = null;
                        try {
                            date = inputFormat.parse(x.DatumPregleda);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        String outputDateStr = outputFormat.format(date);
                        TextView datumm = view.findViewById(R.id.txtDatum);
                        datumm.setText(outputDateStr);


                        // ((TextView) view.findViewById(R.id.txtVrijeme)).setText(formatted);
                        ((TextView) view.findViewById(R.id.txtUsluga)).setText(x.Vrsta);
                        ((TextView) view.findViewById(R.id.txtDijagnoza)).setText(x.Naziv);
                        ((TextView) view.findViewById(R.id.txtZub)).setText(x.NazivZuba);
                        return view;
                    }
                });
                ((BaseAdapter) lista18.getAdapter()).notifyDataSetChanged();
            }


        }
getDialog().dismiss();
        return view;
    }




}
