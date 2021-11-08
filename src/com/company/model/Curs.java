package com.company.model;

public class Curs {
    private int id;
    private String name;
    private String department;


    public Curs(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Curs(String proprietati) {
        this.id = Integer.parseInt(proprietati.split(",")[0]);
        this.name = proprietati.split(",")[1];
        this.department = proprietati.split(",")[2];

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String descriere() {
        String desc = "\nId: " + id + "Nume:" + name + "Departament: " + department;
        return desc;
    }

    @Override
    public String toString() {
        String text = "";
        text += id + "," + name + "," + department;
        return text;
    }

    @Override
    public boolean equals(Object obj) {
        Curs curs = (Curs) obj;
        return curs.id == this.id;
    }

}
