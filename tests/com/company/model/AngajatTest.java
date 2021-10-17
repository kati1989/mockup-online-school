package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngajatTest {

    @Test
    void descriere() {
        Angajat angajat=new Angajat(1,"Titi","angajat",true,"contabila",5000);
        String desc="\nId: 1\nNume: Titi\nTip: angajat\nStatus: true\nOcupatie: contabila\nSalar: 5000";
        assertEquals(desc,angajat.descriere());
    }
    @Test
    void toStringAngajat(){
        Angajat angajat=new Angajat(1,"Titi","angajat",true,"contabila",5000);
        System.out.println(angajat.toString());

    }

    @Test
    void equalsAngajat(){
        Angajat angajat=new Angajat(1,"Titi","angajat",true,"contabila",5000);
        Angajat angajat2=new Angajat(2,"Vali","angajat",true,"contabila",5000);
        assertEquals(true,angajat.equals(angajat2));
    }

}