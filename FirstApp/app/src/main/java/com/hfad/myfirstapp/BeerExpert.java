package com.hfad.myfirstapp;
import java.util.List;
import  java.util.ArrayList;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else{
            brands.add("jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
