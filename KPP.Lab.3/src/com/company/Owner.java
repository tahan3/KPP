package com.company;

public class Owner {
    Dog dog;
    Cat cat;
    Food dogFood;
    Owner(){
        dogFood = new Food();
    }
    Food feed(){
        if (Poodle.class.equals(dog.getClass())) dogFood.takeFood(10);
        if (Terrier.class.equals(dog.getClass())) dogFood.takeFood(20);
        if (ShepherdDog.class.equals(dog.getClass())) dogFood.takeFood(30);
        return dogFood;
    }
    void giveCommand(Dog dog){
        dog.getCommand();
    }
    void getCat(){
        cat = new Cat();
    }
    void getDog(String dogType){
        if(dogType=="Poodle") dog=new Poodle();
        if(dogType=="Terrier") dog=new Terrier();
        if(dogType=="Shepherd Dog") dog=new ShepherdDog();
    }
    Food walkDog(){
        if (Poodle.class.equals(dog.getClass())) dogFood.takeFood(50);
        if (Terrier.class.equals(dog.getClass())) dogFood.takeFood(70);
        if (ShepherdDog.class.equals(dog.getClass())) dogFood.takeFood(90);
        return dogFood;
    }
}