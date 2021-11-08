package com.company.model;

public class CursMatematica extends Curs{
    private boolean cuFrecventa;
    private  String concurs;

    public CursMatematica(int id, String name, String department, boolean cuFrecventa, String concurs) {
        super(id, name, department);
        this.cuFrecventa = cuFrecventa;
        this.concurs = concurs;
    }

    public CursMatematica(String proprietati) {
        super(Integer.parseInt(proprietati.split("")[0]),proprietati.split(",")[1],proprietati.split(",")[2]);
        this.cuFrecventa=Boolean.parseBoolean(proprietati.split(",")[3]);
        this.concurs=proprietati.split(",")[4];

    }

    public boolean isCuFrecventa() {
        return cuFrecventa;
    }

    public void setCuFrecventa(boolean cuFrecventa) {
        this.cuFrecventa = cuFrecventa;
    }

    public String getConcurs() {
        return concurs;
    }

    public void setConcurs(String concurs) {
        this.concurs = concurs;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nName: "+super.getName()+"\nDepartment: "+getDepartment()+"\nCu frecventa: "+cuFrecventa+"\nConcurs: "+concurs;
        return desc;
    }
    public String toSave(){
        String text="";
        text+=getId()+","+getName()+","+getDepartment()+","+cuFrecventa+","+concurs;
        return  text;
    }
}
/* */