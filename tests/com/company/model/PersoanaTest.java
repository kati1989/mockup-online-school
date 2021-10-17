package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {
    @Test
    public  void descriere(){
        Persoana pers=new Persoana(1,"Alin","student",true);
        String desc="\nId: 1\nNume: Alin\nTip: student\nStatus: true";
        assertEquals(desc,pers.descriere());
    }

    @Test
    public void toStringPersoana(){
        Persoana pers=new Persoana(1,"Alin","student",true);
        System.out.println(pers.toString());
    }

    @Test
    public  void equlsPersoana(){
        Persoana pers=new Persoana(1,"Alin","student",true);
        Persoana pers2=new Persoana(1,"Alin","student",true);
        assertEquals(true,pers.equals(pers2));
    }

}
