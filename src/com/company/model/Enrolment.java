package com.company.model;

public class Enrolment {



    private int id;
    private int studentId;
    private int courseId;
    private String createdAt;

    public Enrolment(int id,int studentId,int courseId,String createdAt){
        this.id=id;
        this.studentId=studentId;
        this.courseId=courseId;
        this.createdAt=createdAt;
    }
    public Enrolment(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.studentId=Integer.parseInt(proprietati.split(",")[1]);
        this.courseId=Integer.parseInt(proprietati.split(",")[2]);
        this.createdAt=proprietati.split(",")[3];

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

        public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }


    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nStudent Id: "+studentId+"\nCourese Id: "+courseId+"\nCreated At:"+createdAt;
        return  desc;
    }


    public String toSave(){
        String text="";
        text+=id+","+studentId+","+courseId+","+createdAt;
        return text;
    }
}
