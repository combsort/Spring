package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle {

    @Autowired
    public Tyre ty;

    public Car(Tyre ty){
        this.ty = ty;
    }

//    public Tyre getTy() {
//        return ty;
//    }
//
//    public void setTy(Tyre ty) {
//        this.ty = ty;
//    }

    public void drive()
    {
        System.out.println("Driving car..." + ty);
    }

}
