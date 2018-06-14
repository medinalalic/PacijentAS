package com.example.medina.diplomskirad.Model;

import java.io.Serializable;
import java.util.Date;

public class ZubVM implements Serializable {
    public static class ZubInfo implements Serializable
    {  public int Id ;
        public String DatumPregleda ;
        public String VrijemePregleda ;
        public String Vrsta;
        public String Cijena;
        public String Naziv;
        public String Napomena;
        public int BrojZuba;
        public String NazivZuba;






        public ZubInfo(int id, String datum, String vrijeme, String usluga, String cijena, String dijagnoza, String napomena,int brojZuba,String nazivZuba) {
            this.Id=id;
            this.DatumPregleda=datum;
            this.VrijemePregleda=vrijeme;
            this.Vrsta=usluga;
            this.Cijena=cijena;
            this.Naziv=dijagnoza;
            this.Napomena=napomena;

           this.BrojZuba=brojZuba;
           this.NazivZuba=nazivZuba;

        }

    }


}
