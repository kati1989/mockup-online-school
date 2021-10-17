package com.company.model;

public class Persoana {
   private int id;
   private String nume;
   private String tip;
   private boolean status;

    public Persoana(int id, String nume, String tip, boolean status) {
        this.id = id;
        this.nume = nume;
        this.tip = tip;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public  String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nNume: "+nume+"\nTip: "+tip+"\nStatus: "+status;
        return desc;
    }


    @Override
    public String toString(){
        String text="";
        text+=id+","+nume+","+tip+","+status;
        return text;
    }

    @Override
    public boolean equals(Object obj){
        Persoana pers=(Persoana) obj;
        return  pers.id==this.id;
    }

}
