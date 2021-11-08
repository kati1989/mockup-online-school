package com.company.controller;

import com.company.model.Enrolment;
import com.company.model.Persoana;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerEnrolment {
    ArrayList<Enrolment> enrolments;
    private String cale;

    public ControllerEnrolment(String cale) {
        enrolments = new ArrayList<>();
        this.cale = cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                enrolments.add(new Enrolment(line));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < enrolments.size(); i++) {
            System.out.println(enrolments.get(i).descriere());
        }
    }

    public void adauga(Enrolment enrolment) {
        enrolments.add(enrolment);

    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < enrolments.size(); i++) {
            text += enrolments.get(i).toSave() + "\n";
        }
        return text;
    }


    public void saveFiser() {
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

    public void updateCreatedAt(int studentId,String createdAt){
        for(int i=0;i<enrolments.size();i++){
            if(enrolments.get(i).getStudentId()==studentId){
                enrolments.get(i).setCreatedAt(createdAt);
            }
        }
    }

    public ArrayList<Enrolment> getEnrolments() {
        return enrolments;
    }

    public ArrayList<Enrolment> returnLista(int studentId){
        ArrayList<Enrolment>enrolmetPerStudent=new ArrayList<>();
        for(int i=0;i<enrolments.size();i++){
            if(enrolments.get(i).getStudentId()==studentId){
                enrolmetPerStudent.add(enrolments.get(i));
            }

        }
        return enrolmetPerStudent;
    }
    public int poz(int enrolmentId){
        for(int i=0;i< enrolments.size();i++){
            if (enrolments.get(i).getStudentId() == enrolmentId) {

                return i;
            }
        }
        return -1;
    }

    public void sterge(int id){
        for(int i=0;i< enrolments.size();i++){
            if(enrolments.get(i).getId()==id){
                enrolments.remove(i);
            }
        }
    }
    public void stergeDupaStCurs(int studentId,int cursId){
        for (int i=0;i<enrolments.size();i++){
            if(enrolments.get(i).getStudentId()==studentId&&enrolments.get(i).getCourseId()==cursId)
                    enrolments.remove(i);
        }
    }
}
/*


		if ((*it)->getStudentId()==studentId) {

			enrolmentPerStudent->push_back(*it);
		}
	}

	return enrolmentPerStudent;
}*/