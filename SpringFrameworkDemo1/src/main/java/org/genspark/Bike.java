package org.genspark;

public class Bike implements Vehicle{

    public Tyre ty;

    public Bike(Tyre ty) {
        this.ty = ty;
    }

    public void drive(){

        System.out.println("Driving bike.."+ty);
    }
}
