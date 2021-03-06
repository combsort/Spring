package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("#{20}")
    private int x;

    @Value("#{30}")
    private int y;


    @Value("#{alien.x+alien.y}")
    private  int z;

    @Value("#{T(org.example.Alien).hello(5.77)}")
    private double d;

    @Value("#{new java.lang.String('Genspark')}")
    private String name;

    @Value("#{'true'}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public static double hello(double a)
    {
        return a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", d=" + d +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
