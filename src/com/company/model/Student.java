package com.company.model;

public class Student extends Persoana {
    private String departament;
    private double medie;

    public Student(int id, String nume, String tip, boolean status,String departament,double medie) {
        super(id, nume, tip, status);
        this.departament=departament;
        this.medie=medie;
    }
    public Student(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],proprietati.split(",")[2],Boolean.parseBoolean(proprietati.split(",")[3]));
        this.departament=proprietati.split(",")[4];
        this.medie=Double.parseDouble(proprietati.split(",")[5]);

    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    @Override
    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nNume: "+super.getNume()+"\nTip: "+super.getTip()+"\nStatus: "+super.isStatus()+"\nDepartament: "+departament+"\nMedie: "+medie;
    return  desc;
    }

    @Override
    public String  toString(){
        String text="";
        text+=super.getId()+","+super.getNume()+","+super.getTip()+","+super.isStatus()+","+departament+","+medie;
        return  text;
    }
    @Override
    public  boolean equals(Object obj){
        Student student=(Student)obj;
        return student.medie==this.medie;

    }


}
