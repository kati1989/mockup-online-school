package com.company.controller;

import com.company.model.Angajat;
import com.company.model.Persoana;
import com.company.model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPersoana {
    ArrayList<Persoana> persoane;
    private String cale;

    public ControllerPersoana(String cale){
        persoane=new ArrayList<>();
        this.cale=cale;
        load();
    }
    public  void load(){
        File file=new File(cale);
        try{
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                switch(line.split(",")[2]){
                    case "angajat": persoane.add(new Angajat(line));
                    break;
                    case "student":persoane.add(new Student(line));
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void afiseaza(){
        for(int i=0;i<persoane.size();i++)
        {
            System.out.println(persoane.get(i).descriere());
        }
    }

    public void adauga(Persoana pers){
        persoane.add(pers);
    }

    public  String toSave(){
        String text="";
        for(int i=0; i< persoane.size();i++){
            text+=persoane.get(i).toString()+"\n";
        }
        return text;
    }

    public  void toSaveFisier(){
        File file=new File(cale);
        try{
            FileWriter w=new FileWriter(file);
            PrintWriter p=new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void updateStatus(String nume,boolean status){
        for(int i=0;i<persoane.size();i++){
            if(persoane.get(i).getNume().equals(nume)){
                persoane.get(i).setStatus(status);
            }
        }
    }

    public void count(){
        int counterStudent=0;
        int counterAngajat=0;
        for(int i=0;i< persoane.size();i++){
            if(persoane.get(i) instanceof  Student)
                counterStudent++;
            else if(persoane.get(i)instanceof  Angajat)
                counterAngajat++;
        }

        System.out.println("Numarul studenilor: "+counterStudent);
        System.out.println("Numarul angajatilor: "+counterAngajat);

    }
    public boolean isPersoana(String nume){
        for(Persoana pers: persoane){
            if(pers.getNume().equals(nume)){
                return true;
            }
        }
        return false;
    }
    public  void stergePersoana(String nume){
        for (int i=0;i<persoane.size();i++){
            if(persoane.get(i).getNume().equals(nume)){
                persoane.remove(persoane.get(i));
            }
        }
    }
    public void stergeTotiStudenti(){
      for(int i=0;i<persoane.size();i++){
          if(persoane.get(i)instanceof  Student) {
              persoane.remove(i);
              i--;
          }
      }
    }
}

