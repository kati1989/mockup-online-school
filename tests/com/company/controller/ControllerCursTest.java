package com.company.controller;

import com.company.model.CursMatematica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCursTest {
    private ControllerCurs controllerCurs;

    public ControllerCursTest(){
        controllerCurs=new ControllerCurs("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\src\\com\\company\\resources\\cursuri.txt");
    }

    @BeforeEach

    public  void preconditie(){
        controllerCurs=new ControllerCurs("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\src\\com\\company\\resources\\cursuri.txt");

    }
    @Test
    public  void testLoad(){
        //preconditie
        CursMatematica cursMatematica1=new CursMatematica("1,Algebra,Informatica,true,admitere");
        CursMatematica cursMatematica2=new CursMatematica("2,Geometrie,Informatica,true,deAdmitere");
        CursMatematica cursMatematica3=new CursMatematica("3,Logica,Informatica,true,deAdmitere");
        //Actiune
        controllerCurs.adauga(cursMatematica1);
        controllerCurs.adauga(cursMatematica2);
        controllerCurs.adauga(cursMatematica3);
        controllerCurs.toSaveFisier();
        controllerCurs.load();
    }

}
/*
    }
        public CursMatematica(int id, String name, String department, boolean cuFrecventa, String concurs) {

        text+=getId()+","+getName()+","+getDepartment()+","+cuFrecventa+","+concurs;


    @Test
    public void testLoad1() {
        //Preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica de baza,2008,matematica,true,false,manual,V");
        Matematica matematica2 = new Matematica("5,2,Geometrie,2017,matematica,true,false,manual,VII");
        Matematica matematica3 = new Matematica("6,3,Algebra,2018,matematica,true,false,manual,VI");
        Literatura literatura1 = new Literatura("7,4,Literatura romana,2000,literatura,true,false,romana,VI");
        Literatura literatura2 = new Literatura("8,5,Literatura engleza,2010,literatura,true,false,engleza,XII");


        //Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);
        controllerBook.toSaveFisier();

        controllerBook.load();

        //Rezultat
        assertEquals(true, controllerBook.poz(4) != -1);
        assertEquals(true, controllerBook.poz(5) != -1);
        assertEquals(true, controllerBook.poz(6) != -1);
        assertEquals(true, controllerBook.poz(7) != -1);
        assertEquals(true, controllerBook.poz(8) != -1);

        //Postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();
        controllerBook.load();
        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);




    }

    @Test
    public void adauga() {
        //preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII");
        Matematica matematica2 = new Matematica("5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII");
        Matematica matematica3 = new Matematica("6,3,Exercitii de logica,2019,matematica,true,false,manual,VII");
        Literatura literatura1 = new Literatura("7,4,Literatura greaca,2000,literatura,true,false,grec,XI");
        Literatura literatura2 = new Literatura("8,5,Mitologie,2000,literatura,true,false,romana,VII");

//Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();

//rezultat
        assertEquals(true, controllerBook.isBook("Matematica pentru avansati"));
        assertEquals(true, controllerBook.isBook("Exercitii pt bacalaureat"));
        assertEquals(true, controllerBook.isBook("Exercitii de logica"));
        assertEquals(true, controllerBook.isBook("Literatura greaca"));
        assertEquals(true, controllerBook.isBook("Mitologie"));

//postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();

        controllerBook.load();

        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);


    }

    @Test
    public void toSave() {
        //preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII");
        Matematica matematica2 = new Matematica("5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII");
        Matematica matematica3 = new Matematica("6,3,Exercitii de logica,2019,matematica,true,false,manual,VII");
        Literatura literatura1 = new Literatura("7,4,Literatura greaca,2000,literatura,true,false,grec,XI");
        Literatura literatura2 = new Literatura("8,5,Mitologie,2000,literatura,true,false,romana,VII");
//Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();
        //Rezultat

        assertEquals(
                "4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII\n" +
                "5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII\n" +
                "6,3,Exercitii de logica,2019,matematica,true,false,manual,VII\n" +
                "7,4,Literatura greaca,2000,literatura,true,false,grec,XI\n" +
                "8,5,Mitologie,2000,literatura,true,false,romana,VII\n", controllerBook.toSave());

///postconditie
        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();

        controllerBook.load();

        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);

    }

    @Test
    public void afisare() {
        //Preconditie

        Matematica matematica1 = new Matematica("4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII");
        Matematica matematica2 = new Matematica("5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII");
        Matematica matematica3 = new Matematica("6,3,Exercitii de logica,2019,matematica,true,false,manual,VII");
        Literatura literatura1 = new Literatura("7,4,Literatura greaca,2000,literatura,true,false,grec,XI");
        Literatura literatura2 = new Literatura("8,5,Mitologie,2000,literatura,true,false,romana,VII");

//Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();

        controllerBook.afisare();

        //postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();

        controllerBook.load();

        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);

    }

    @Test
    public void poz() {
        //Preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica de baza,2008,matematica,true,false,manual,V");
        Matematica matematica2 = new Matematica("5,2,Geometrie,2017,matematica,true,false,manual,VII");
        Matematica matematica3 = new Matematica("6,3,Algebra,2018,matematica,true,false,manual,VI");
        Literatura literatura1 = new Literatura("7,4,Literatura romana,2000,literatura,true,false,romana,VI");
        Literatura literatura2 = new Literatura("8,5,Literatura engleza,2010,literatura,true,false,engleza,XII");


        //Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();

        controllerBook.load();




        assertEquals(0, controllerBook.poz(4));

        assertEquals(1, controllerBook.poz(5));
        assertEquals(2, controllerBook.poz(6));
        assertEquals(3, controllerBook.poz(7));
        assertEquals(4, controllerBook.poz(8));


        //Postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);
        controllerBook.toSaveFisier();
        controllerBook.load();
        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);



    }

    @Test
    public void isBook(){
        //Preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica de baza,2008,matematica,true,false,manual,V");
        Matematica matematica2 = new Matematica("5,2,Geometrie,2017,matematica,true,false,manual,VII");
        Matematica matematica3 = new Matematica("6,3,Algebra,2018,matematica,true,false,manual,VI");
        Literatura literatura1 = new Literatura("7,4,Literatura romana,2000,literatura,true,false,romana,VI");
        Literatura literatura2 = new Literatura("8,5,Literatura engleza,2010,literatura,true,false,engleza,XII");

        //actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();

        //rezultat

        assertEquals(true,controllerBook.isBook("Matematica de baza"));
        assertEquals(true,controllerBook.isBook("Geometrie"));
        assertEquals(true,controllerBook.isBook("Algebra"));
        assertEquals(true,controllerBook.isBook("Literatura romana"));
        assertEquals(true, controllerBook.isBook("Literatura engleza"));

        //Postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();

        controllerBook.load();


        assertEquals(false,controllerBook.poz(4)!=-1);
        assertEquals(false,controllerBook.poz(5)!=-1);
        assertEquals(false,controllerBook.poz(6)!=-1);
        assertEquals(false,controllerBook.poz(7)!=-1);
        assertEquals(false,controllerBook.poz(8)!=-1);


    }

*/