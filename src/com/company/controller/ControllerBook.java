package com.company.controller;

import com.company.model.Book;
import com.company.model.Literatura;
import com.company.model.Matematica;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBook {
    ArrayList<Book>books;
    private  String cale;

    public ControllerBook(String cale){
       books=new ArrayList<>();
       this.cale=cale;
       load();
    }

    public void load(){
        File file=new File(cale);
        try{
            books.clear();
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line= scanner.nextLine();
                switch(line.split(",")[4]){
                    case"matematica":books.add(new Matematica(line));
                    break;
                    case "literatura":books.add(new Literatura(line));
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void adauga(Book book){
        books.add(book);
    }

    public  String toSave(){
        String text="";
        for(int i=0; i< books.size();i++){
            text+=books.get(i).toString()+"\n";
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
    public void upateStatus(String nume,boolean status){
        for(int i=0;i<books.size();i++){
            if(books.get(i).getBookName().equals(nume)){
                books.get(i).setStatus(status);
            }
        }
    }

    public void  afisare(){
        for(int i=0;i< books.size();i++){
            System.out.println(books.get(i).descriere());
        }
    }

    public void stergeBook(int id){
        for(int i=0;i< books.size();i++){
            if(books.get(i).getId()==id)
            {
                books.remove(i);
            }
        }
    }

    //returneaza poz cartii dupa id
    public  int poz(int id){
        for(int i=0;i< books.size();i++){
            if(books.get(i).getId()==id){
                return  i;
            }
        }
        return -1;
    }

    public boolean isBook(String bookName ){
        for(int i=0;i< books.size();i++){
            if(books.get(i).getBookName().equals(bookName))
                return true;
        }

        return  false;
    }
}



