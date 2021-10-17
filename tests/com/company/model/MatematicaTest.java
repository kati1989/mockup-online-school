package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematicaTest {
    @Test
    public   void descriere(){
    Matematica matematica=new Matematica(1,2,"Manual de matematica","2007","matematica",true,false,"manual","VI-a");
        String desc = "\nId: 1\nPersonId: 2\nBookName: Manual de matematica\nCreated At: 2007\nCategory: matematica\nStatus: true\nCumparata: false\nTip: manual\nClasa: VI-a";
        assertEquals(desc, matematica.descriere());
    }

    @Test
    public void toStringMatematica() {
        Matematica matematica=new Matematica (1, 2, "Bazele matematicii", "1998", "matematica", true, false,"manial","V");

    }
    @Test

    public void toEqualsMatematica(){
        Matematica mat1=new Matematica(1, 2, "Bazele matematicii", "1998", "matematica", true, false,"manial","V");
        Matematica mat2=new Matematica(1,2,"Manual de matematica","2007","matematica",true,false,"manual","VI-a");
        assertEquals(false,mat1.equals(mat2));
    }
}
