package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

public class Student {

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Phone> getPh() {
        return ph;
    }
    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }
    public Address getAdd() {
        return add;
    }
    public void setAdd(Address add) {
        this.add = add;
    }

    private int id;
    private String name;
    private List<Phone> ph;
    @Autowired
    private Address add;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
