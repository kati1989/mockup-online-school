package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiteraturaTest {

    @Test
    void descriere() {
        Literatura literatura=new Literatura(1,2,"Manual de literatura","2007","literatura",true,false,"romana","VIII");
        String desc = "\nId: 1\nPersonId: 2\nBookName: Manual de literatura\nCreated At: 2007\nCategory: literatura\nStatus: true\nCumparata: false\nLimba: romana\nClasa: VIII";
        assertEquals(desc, literatura.descriere());
    }

    @Test
    void testToString() {
        Literatura literatura=new Literatura(1,2,"Manual de literatura","2007","literatura",true,false,"romana","VIII");

    }

    @Test
    void testEquals() {
        Literatura literatura=new Literatura(1,2,"Manual de literatura","2007","literatura",true,false,"romana","VIII");
        Literatura literatura2=new Literatura(1,2,"Manual de literatura","2007","literatura",true,false,"romana","VIII");
        assertEquals(true,literatura.equals(literatura2));
    }
}