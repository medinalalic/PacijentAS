package com.example.medina.diplomskirad.Model;

import java.io.Serializable;
import java.util.List;

public class UslugaVM implements Serializable {

    public static class UslugaInfo implements Serializable
    {  public int Id ;
        public String Vrsta ;
        public String Slika ;

        public UslugaInfo(int id, String vrsta, String slika) {
            this.Id=id;
            this.Vrsta=vrsta;
            this.Slika=slika;
        }
    }
    public List<UslugaInfo> UslugaLista ;
}
