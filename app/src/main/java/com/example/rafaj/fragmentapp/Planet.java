package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by Edward on 2018-04-14.
 */

public class Planet implements Serializable{

    private String name;
    private int imageID;

    public Planet(String name, int index){
        this.name = name;

        switch (index){
            case 0:
                imageID = R.drawable.sun;
                break;
            case 1:
                imageID = R.drawable.mercury;
                break;
            case 2:
                imageID = R.drawable.venus;
                break;
            case 3:
                imageID = R.drawable.earth;
                break;
            case 4:
                imageID = R.drawable.mars;
                break;
            case 5:
                imageID = R.drawable.jupiter;
                break;
            case 6:
                imageID = R.drawable.saturn;
                break;
            case 7:
                imageID = R.drawable.uranus;
                break;
            case 8:
                imageID = R.drawable.neptune;
                break;
        }
    }

    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }
}