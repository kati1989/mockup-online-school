package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
   public void descriere() {
        Student  student=new Student(1,"Anca","student",true,"informatica",8.9);
        String desc="\nId: 1\nNume: Anca\nTip: student\nStatus: true\nDepartament: informatica\nMedie: 8.9";
        assertEquals(desc,student.descriere());
    }

    @Test
    public void toStringStudent(){
        Student  student=new Student(1,"Anca","student",true,"informatica",8.9);
        System.out.println(student.toString());
    }

    @Test
    public  void equalsStudent(){
        Student  student=new Student(1,"Anca","student",true,"informatica",8.9);
        Student  student2=new Student(1,"Vali","student",true,"informatica",8.9);
        assertEquals(true,student.equals(student2));
    }
}
