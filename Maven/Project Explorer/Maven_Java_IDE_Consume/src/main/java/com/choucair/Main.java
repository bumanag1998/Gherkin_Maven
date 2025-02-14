package com.choucair;

import com.choucair.model.Persona;

public class Main {
    public static void main(String[] args)
    {
        Persona per = new Persona();
        per.setId(722);
        per.setNombre("Donaldo");

        //Version 1.0-SNAPSHOT
        //System.out.println(per.getId() + ". Hola mi nombre es el Sr. Don Ing. " + per.getNombre());

        //Version 2
        System.out.println(per.toString());



    }
}