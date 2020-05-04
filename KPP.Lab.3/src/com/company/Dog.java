package com.company;

abstract class Dog extends Pet {
    {
        age = 1;
        name = "Chappie";
    }

    Dog() {
    }

    Dog(byte dogAge, String dogName) {
        age = dogAge;
        name = dogName;
    }

    private boolean executeCommand() {
        double rand = Math.random() * 5;
        if (this.age > 2) {
            return rand > 1;
        } else {
            return rand > 2;
        }
    }

    boolean getCommand() {
        return executeCommand();
    }

    void wantEat(Owner owner) {
        owner.feed();
    }

    String getInfo() {
        return name + " " + String.valueOf(age) + " years";
    }
}

class Poodle extends Dog {
    Poodle() {
    }

    Poodle(byte dogAge, String dogName) {
        super(dogAge, dogName);
    }
}

class Terrier extends Dog {
    Terrier() {
    }

    Terrier(byte dogAge, String dogName) {
        super(dogAge, dogName);
    }
}

class ShepherdDog extends Dog {
    ShepherdDog() {
    }

    ShepherdDog(byte dogAge, String dogName) {
        super(dogAge, dogName);
    }
}