package com.company;

public class Food {
    private int amountOfFood=5000;
    void takeFood(int takenFood){ amountOfFood-=takenFood;}
    int getFood(){ return amountOfFood; }
}
