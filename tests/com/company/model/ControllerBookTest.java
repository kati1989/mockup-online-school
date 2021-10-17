package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerBookTest {
    @Test
    public void load() {
        ControllerBook controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\books.txt");
        //controllerBook.load();
    }

    @Test
    public void adauga() {
        ControllerBook controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\books.txt");
        Matematica matematica = new Matematica(17, 2, "test", "1998", "matematica", true, false, "manial", "V");
        controllerBook.adauga(matematica);
        //controllerBook.toSaveFisier();
    }

    @Test
    public void toSave() {
        ControllerBook controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\books.txt");

        System.out.println(controllerBook.toSave());
    }

    @Test
    public void saveFisier() {
        ControllerBook controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\books.txt");
        Matematica matematica = new Matematica(1, 2, "Bazele matematicii", "1998", "matematica", true, false, "manual", "V");

        controllerBook.adauga(matematica);
        controllerBook.toSaveFisier();
    }

    @Test
    public void updateStatus() {
        ControllerBook controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\books.txt");
        controllerBook.upateStatus("Bazele matematicii", true);
        controllerBook.toSaveFisier();
    }

    @Test
    public void afisare() {
        ControllerBook controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\books.txt");

        controllerBook.afisare();
    }

    @Test
    public void sterge() {
        ControllerBook controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Aplicatie_ScoalaOnline\\tests\\com\\company\\model\\books.txt");
        controllerBook.stergeBook("Matematica de baza");
        controllerBook.toSaveFisier();
    }
}
