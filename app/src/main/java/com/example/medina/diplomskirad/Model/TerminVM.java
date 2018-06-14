package com.example.medina.diplomskirad.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TerminVM{
  public int Id ;
        public String Datum ;
        public String Vrijeme ;
        public boolean Odobren ;
        public int PacijentId ;
        public String RazlogPosjete ;

      public static class TerminInfo implements Serializable
      {  public int Id ;
            public String Datum ;
            public String Vrijeme ;

            public TerminInfo(int id, String datum, String vrijeme) {
                  this.Id=id;
                  this.Datum=datum;
                  this.Vrijeme=vrijeme;

            }}
}
