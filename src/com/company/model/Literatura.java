package com.company.model;

public class Literatura extends Book{
    private String limba;
    private String clasa;

    public Literatura(int id, int personId, String bookName, String createdAt, String category, boolean status, boolean cumparata,String limba,String clasa) {
        super(id, personId, bookName, createdAt, category, status, cumparata);
        this.limba=limba;
        this.clasa=clasa;

    }

    public  Literatura(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),Integer.parseInt(proprietati.split(",")[1]),proprietati.split(",")[2],proprietati.split(",")[3],proprietati.split(",")[4],Boolean.parseBoolean(proprietati.split(",")[5]),Boolean.parseBoolean(proprietati.split(",")[6]));
        this.limba=proprietati.split(",")[7];
        this.clasa=proprietati.split(",")[8];
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    @Override
    public  String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nPersonId: "+super.getPersonId()+"\nBookName: "+super.getBookName()+"\nCreated At: "+super.getCreatedAt()+"\nCategory: "+super.getCategory()+"\nStatus: "+super.isStatus()+"\nCumparata: "+super.isCumparata()+"\nLimba: "+limba+"\nClasa: "+clasa;
        return desc;
    }

    @Override
    public String toString(){
        String text="";
        text+=getId()+","+getPersonId()+","+getBookName()+","+getCreatedAt()+","+getCategory()+","+isStatus()+","+isCumparata()+","+limba+","+clasa;
        return  text;
    }

    @Override
    public  boolean equals(Object obj){
        Literatura literatura=(Literatura) obj;
        return literatura.limba==this.limba;
    }

}
