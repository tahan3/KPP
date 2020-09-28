package com.company;

public class Food {
    private int amountOfFood=500;
    void takeFood(int takenFood){ amountOfFood-=takenFood;}
    int getFood(){ return amountOfFood; }
}
