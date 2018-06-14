package com.example.medina.diplomskirad.Model;

import java.io.Serializable;
import java.util.Date;

public class PacijentVM implements Serializable {
    public int Id;
    public String Slika;

    public static class PacijentInfo implements Serializable {
        public int Id;
        public String Slika;
        public PacijentInfo(int id, String slika) {
            this.Id=id;
            this.Slika=slika;

        }
    }
}
