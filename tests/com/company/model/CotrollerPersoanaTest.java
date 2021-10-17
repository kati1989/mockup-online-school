package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CotrollerPersoanaTest {
    @Test
    public void load(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");
    }

    @Test
    void afiseaza(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");
        controllerPersoana.afiseaza();
    }
    @Test
    void add(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");
        Persoana persoana=new Persoana(1,"Alin","student",true);
        controllerPersoana.adauga(persoana);
        controllerPersoana.afiseaza();
    }

    @Test
    void toSave(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");
        controllerPersoana.toSave();
    }

    @Test
    void saveFisier(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");
        Angajat angajat=new Angajat(119,"Andrei","angajat",true,"bibiotecar",4000);
        controllerPersoana.adauga(angajat);
    controllerPersoana.toSaveFisier();
    }

    @Test
    void updateStatus(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");

        controllerPersoana.updateStatus("Anca",true);
        controllerPersoana.toSaveFisier();
    }

    @Test
    void count(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");

        controllerPersoana.count();

    }

    @Test
    void isPersoana(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");

      System.out.println( controllerPersoana.isPersoana("Anca"));

    }

    @Test
    void stergePersoana(){
        CotrollerPersoana controllerPersoana=new CotrollerPersoana("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\persoane.txt");

        controllerPersoana.stergePersoana("Anca");
        controllerPersoana.afiseaza();

    }
}