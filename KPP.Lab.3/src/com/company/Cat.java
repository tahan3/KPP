package com.company;

public class Cat extends Pet {
    Cat(){
        age=1;
        name="Vasya";
    }
    boolean sleeping=false;
    void sleep(){
        if(sleeping) sleeping=false;
        else sleeping=true;
    }
}
