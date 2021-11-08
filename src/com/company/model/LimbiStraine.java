package com.company.model;

public class LimbiStraine extends Curs{
    private int nrDeSala;
    private int nrDeOre;

    public LimbiStraine(int id, String name, String department, int nrDeSala, int nrDeOre) {
        super(id, name, department);
        this.nrDeSala = nrDeSala;
        this.nrDeOre = nrDeOre;
    }
    public LimbiStraine(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],proprietati.split(",")[2]);
        this.nrDeSala=Integer.parseInt(proprietati.split(",")[3]);
        this.nrDeOre=Integer.parseInt(proprietati.split(",")[4]);
    }

    public int getNrDeSala() {
        return nrDeSala;
    }

    public void setNrDeSala(int nrDeSala) {
        this.nrDeSala = nrDeSala;
    }

    public int getNrDeOre() {
        return nrDeOre;
    }

    public void setNrDeOre(int nrDeOre) {
        this.nrDeOre = nrDeOre;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nName: "+getName()+"\nDepartment: "+getDepartment()+"\nNr de sala: "+nrDeSala+"\nNr de ore: "+nrDeOre;
        return  desc;
    }

    public String toSave(){
        String text="";
        text+=super.getId()+","+super.getName()+","+super.getDepartment()+","+nrDeSala+","+nrDeOre;
        return  text;
    }
}
