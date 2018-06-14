package com.example.medina.diplomskirad;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medina.diplomskirad.Api.PacijentApi;
import com.example.medina.diplomskirad.Api.PorukaApi;
import com.example.medina.diplomskirad.Api.ZubApi;
import com.example.medina.diplomskirad.Helper.Global;
import com.example.medina.diplomskirad.Helper.MyRunnable;
import com.example.medina.diplomskirad.Helper.Sesija;
import com.example.medina.diplomskirad.Model.PacijentVM;
import com.example.medina.diplomskirad.Model.PorukaVM;
import com.example.medina.diplomskirad.Model.ZubVM;

import org.json.JSONArray;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class UrediProfilActivity extends AppCompatActivity {
Button profil;
    public static ArrayList<PacijentVM.PacijentInfo> lista = new ArrayList<>();
    private static final int PICK_IMAGE=100;
   ImageView photo;
    Uri imageURI;
    private static ImageView slikaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uredi_profil);
        profil=(Button)findViewById(R.id.btnProfil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UrediProfilActivity.this, ProfilActivity.class));

            }
        });

      slikaj = findViewById(R.id.slikaj);
        TextView email=findViewById(R.id.email);
        email.setText(Sesija.getlogiraniKorisnik().Email);
        TextView adresa=findViewById(R.id.adresa);
        adresa.setText(Sesija.getlogiraniKorisnik().Adresa);
        TextView telefon=findViewById(R.id.telefon);
        telefon.setText(Sesija.getlogiraniKorisnik().Mobitel);
        TextView ip=findViewById(R.id.imeprezime);
        ip.setText(Sesija.getlogiraniKorisnik().Ime+" "+Sesija.getlogiraniKorisnik().Prezime);
        photo=(ImageView) findViewById(R.id.slikaprofila);


    PacijentApi.getSlika(getApplicationContext(), new MyRunnable<PacijentVM>() {
        @Override
        public void run(PacijentVM result) {
            if (result.Slika != null) {
                byte[] decodedBytes = Base64.decode(result.Slika, Base64.DEFAULT);
                Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);

                photo.setImageBitmap(bitmap);
                photo.setRotation(photo.getRotation() + 90);
            } else
              Toast.makeText(getApplicationContext(), "Unesite sliku profila ", Toast.LENGTH_SHORT).show();
        }
    }, Sesija.getlogiraniKorisnik().Id);
if(photo.getDrawable() ==null){
    slikaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,100);

        }
    });
}



    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        PacijentVM p = new PacijentVM();
        p.Id = Sesija.getlogiraniKorisnik().Id;
       /* if (resultCode == RESULT_OK && requestCode == PICK_IMAGE) {
            imageURI = data.getData();
            photo.setImageURI(imageURI);
            photo.setRotation(photo.getRotation() + 90);
        }*/
        if (resultCode == RESULT_OK && requestCode == 100) {
            Bundle extras = data.getExtras();
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            photo.setImageBitmap(null);
            photo.setImageBitmap(bitmap);
            photo.setRotation(photo.getRotation() + 90);

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
            byte[] img = stream.toByteArray();
            String result=Base64.encodeToString(img, Base64.DEFAULT);
            p.Slika = result;

        }



            PacijentApi.IzmjenaPodataka(getApplicationContext(), new MyRunnable<PacijentVM>() {
                @Override
                public void run(PacijentVM result) {

                    AlertDialog.Builder b = new AlertDialog.Builder(UrediProfilActivity.this);
                    b = new AlertDialog.Builder(UrediProfilActivity.this);

                    b.setMessage("Uspješno ste izvrišili izmjene, morate se ponovo logirati na aplikaciju!");
                    b.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {

                            yes();
                        }
                    });
                    b.show();
                }
            }, p);




    }

    private void yes() {
        Intent intent = new Intent(UrediProfilActivity.this, MainActivity.class);
        intent.putExtra("finish", true);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    }

