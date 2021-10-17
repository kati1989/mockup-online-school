package com.company.model;

public class Matematica extends Book{
    private String tip;
    private String clasa;

    public Matematica(int id, int personId, String bookName, String createdAt, String category, boolean status, boolean cumparata, String tip, String clasa) {
        super(id, personId, bookName, createdAt, category, status, cumparata);
        this.tip = tip;
        this.clasa = clasa;
    }
    public  Matematica(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),Integer.parseInt(proprietati.split(",")[1]),proprietati.split(",")[2],proprietati.split(",")[3],proprietati.split(",")[4],Boolean.parseBoolean(proprietati.split(",")[5]),Boolean.parseBoolean(proprietati.split(",")[6]));
        this.tip=proprietati.split(",")[7];
        this.clasa=proprietati.split(",")[8];
    }

    public  String getTip(){
        return getTip();
    }

    public  void setTip(String tip){
        this.tip=tip;
    }

    public String getClasa(){
        return  clasa;
    }

    public void setClasa(String clasa){
        this.clasa=clasa;
    }

    @Override
    public  String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nPersonId: "+super.getPersonId()+"\nBookName: "+super.getBookName()+"\nCreated At: "+super.getCreatedAt()+"\nCategory: "+super.getCategory()+"\nStatus: "+super.isStatus()+"\nCumparata: "+super.isCumparata()+"\nTip: "+tip+"\nClasa: "+clasa;
   return desc;
    }

    @Override
    public String toString(){
        String text="";
        text+=getId()+","+getPersonId()+","+getBookName()+","+getCreatedAt()+","+getCategory()+","+isStatus()+","+isCumparata()+","+tip+","+clasa;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        Matematica matematica=(Matematica)obj;
        return matematica.clasa==this.clasa;
    }

}
/*
*/