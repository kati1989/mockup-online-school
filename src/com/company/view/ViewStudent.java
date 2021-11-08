package com.company.view;

import com.company.controller.ControllerBook;
import com.company.controller.ControllerCurs;
import com.company.controller.ControllerEnrolment;
import com.company.controller.ControllerPersoana;
import com.company.model.Enrolment;
import com.company.model.Persoana;

import javax.swing.text.View;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewStudent {
    ControllerPersoana cotrollerPersoana;
    ControllerBook controllerBook;
    ControllerEnrolment controllerEnrolment;
    ControllerCurs controllerCurs;

    public ViewStudent() {
        cotrollerPersoana = new ControllerPersoana(Path.of("src", "com", "company", "resources", "persoane.txt").toString());
        controllerBook = new ControllerBook(Path.of("src", "com", "company", "resources", "books.txt").toString());
        controllerEnrolment = new ControllerEnrolment(Path.of("src", "com", "company", "resources", "enrolments.txt").toString());
        controllerCurs = new ControllerCurs(Path.of("src", "com", "company", "resources", "cursuri.txt").toString());
    }


    public void meniu() {
        System.out.println("Apasa tasta 1 pentru a afisa cursurile ");
        System.out.println("Apasa tasta 2 pentru a afisa toate cursurile la care este inscris studentul");
        System.out.println("Apasa tasta 3 pentru a inscrie la un curs");
        System.out.println("Apasa tasta 4 pentru unscribe curs");

    }

    public void play() {
        Scanner citeste = new Scanner(System.in);//System in = ami a  billentyuzetrol jon
        boolean run = true;
        int alegere = 0;
        meniu();
        cotrollerPersoana.load();
        while (run = true) {
            alegere = Integer.parseInt(citeste.nextLine());//Beolvassa amit en irok(1,2),a citeste objektummal olvasok be
            switch (alegere) {
                case 1:
                    controllerCurs.afiseaza();
                    break;
                case 2:
                    cursurileStudentului();
                    break;
                case 3:
                    inscrieLaCurs();
                    break;

                case 4:
                    unscribeCurs();
                    break;
                default:
            }
        }
    }

    public void cursurileStudentului() {
        System.out.println("Introduceti id ul studentului: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();//beolvass egy beutott integert enterig

        System.out.println("urmatoarele cursuri are studentul cu id introdus");
        ArrayList<Enrolment> studentEnrolments = controllerEnrolment.returnLista(id);
        for (Enrolment enrolment : studentEnrolments) {
            System.out.println(enrolment.descriere());
        }
    }

    public void inscrieLaCurs() {
        System.out.println("Adaugare curs nou pt student");
        Enrolment enrolment = new Enrolment("1,1,2,2021");
        controllerEnrolment.adauga(enrolment);
        //


        System.out.println("Returneaza lista cursurilor inscrise");
        controllerEnrolment.returnLista(1);
        for (int i = 0; i < controllerEnrolment.returnLista(1).size(); i++) {
            System.out.println(controllerEnrolment.returnLista(1).get(i).descriere());
        }
    }

    public void unscribeCurs() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce id ul studentului");
        int studentId=scanner.nextInt();
        System.out.println("Introduce id ul cursului");

        int cursId = scanner.nextInt();
        System.out.println("Cursul introdus a fot sters");
        controllerEnrolment.stergeDupaStCurs(studentId,cursId);
        controllerEnrolment.saveFiser();



    }
}


