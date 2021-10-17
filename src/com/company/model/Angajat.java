package com.company.model;

public class Angajat extends Persoana{
    private String ocupatie;
    private int salar;

    public Angajat(int id, String nume, String tip, boolean status,String ocupatie,int salar) {
        super(id, nume, tip, status);
        this.ocupatie=ocupatie;
        this.salar=salar;
    }
    public Angajat(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],proprietati.split(",")[2],Boolean.parseBoolean(proprietati.split(",")[3]));
        this.ocupatie=proprietati.split(",")[4];
        this.salar=Integer.parseInt(proprietati.split(",")[5]);

    }


    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }
    @Override

    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nNume: "+getNume()+"\nTip: "+super.getTip()+"\nStatus: "+super.isStatus()+"\nOcupatie: "+ocupatie+"\nSalar: "+salar;
        return desc;
    }

    @Override
    public String toString(){
        String text="";
        text+=super.getId()+","+super.getNume()+","+super.getTip()+","+super.isStatus()+","+ocupatie+","+salar;
        return  text;
    }

    @Override
    public boolean  equals(Object obj){
        Angajat angajat=(Angajat) obj;
        return angajat.salar==this.salar;
    }
}
