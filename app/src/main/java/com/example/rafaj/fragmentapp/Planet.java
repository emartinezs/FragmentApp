package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by Edward on 2018-04-14.
 */

public class Planet implements Serializable{

    private String name;

    public Planet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}