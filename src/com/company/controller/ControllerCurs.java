package com.company.controller;

import com.company.model.Curs;
import com.company.model.CursMatematica;
import com.company.model.LimbiStraine;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCurs {
    ArrayList<Curs> cursuri;
    String cale;

    public ArrayList<Curs> getCursuri() {
        return cursuri;
    }

    public void setCursuri(ArrayList<Curs> cursuri) {
        this.cursuri = cursuri;
    }

    public ControllerCurs(String cale) {
        cursuri = new ArrayList<>();
        this.cale = cale;
        load();

    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                switch (line.split(",")[2]) {
                    case "cursMatematica":
                        cursuri.add(new CursMatematica(line));
                        break;
                    case "limbiStraine":
                        cursuri.add(new LimbiStraine(line));
                        break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < cursuri.size(); i++) {
            System.out.println(cursuri.get(i).descriere());
        }
    }

    public void adauga(Curs curs) {
        cursuri.add(curs);
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < cursuri.size(); i++) {
            text += cursuri.get(i).toString() + "\n";
        }
        return text;
    }

    public void toSaveFisier() {
        File file = new File(cale);
        try {
            FileWriter w = new FileWriter(file);
            PrintWriter p = new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateName(String departament, String name) {
        for (int i = 0; i < cursuri.size(); i++) {
            if (cursuri.get(i).getDepartment().equals(departament)) {
                cursuri.get(i).setName(name);
            }
        }
    }

    public boolean isCurs(String name) {
        for (Curs c : cursuri) {
            if (c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void stergeCurs(String name) {
        for (int i = 0; i < cursuri.size(); i++) {
            if (cursuri.get(i).getName().equals(name)) {
                cursuri.remove(cursuri.get(i));
            }
        }
    }

    public int poz(int id) {
        for (int i = 0; i < cursuri.size(); i++) {
            if (cursuri.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    public void sterge(int id){
        for(int i=0;i< cursuri.size();i++){
            if(cursuri.get(i).getId()==id)
            {
                cursuri.remove(i);
            }
        }
    }
}
