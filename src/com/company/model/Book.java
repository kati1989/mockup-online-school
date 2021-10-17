package com.company.model;

public class Book {
    private int id;
    private int personId;
    private String bookName;
    private String createdAt;
    private  String category;
    private  boolean status;
    private boolean cumparata;

    public Book(int id, int personId, String bookName, String createdAt, String category, boolean status, boolean cumparata) {
         this.id = id;
        this.personId = personId;
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.category = category;
        this.status = status;
        this.cumparata = cumparata;
    }

    public Book(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.personId=Integer.parseInt(proprietati.split(",")[1]);
        this.bookName=proprietati.split(",")[2];
        this.createdAt=proprietati.split(",")[3];
        this.category=proprietati.split(",")[4];
        this.status=Boolean.parseBoolean(proprietati.split(",")[5]);
        this.cumparata=Boolean.parseBoolean(proprietati.split(",")[6]);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isCumparata() {
        return cumparata;
    }

    public void setCumparata(boolean cumparata) {
        this.cumparata = cumparata;
    }

    public String descriere(){
        String desc="\nId: "+id+"\nPersonId: "+personId+"\nBook name: "+bookName+"\nCreated At:"+createdAt+"\nCategorie: "+category+"\nStatus:"+status+"\nCumparata: "+cumparata;
        return  desc;
    }

    @Override
    public String toString(){
        String text="";
        text+=id+","+personId+","+bookName+","+createdAt+","+category+","+status+","+cumparata;
        return text;
    }

    @Override
    public boolean equals(Object obj){
        Book book=(Book)obj;
        return  book.id==this.id;
    }

}
