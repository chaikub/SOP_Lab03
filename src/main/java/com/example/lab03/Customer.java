package com.example.lab03;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer() {
        this.ID = "";
        this.name = null;
        this.sex = false;
        this.age = 0;
    }
    public Customer(String ID, String name, boolean s, int age) {
        this.ID = ID;
        this.name = name;
        this.sex = s;
        this.age = age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        boolean s = false;
        if(sex == "Male" ^ sex == "male"){
            s = true;
        } else if (sex == "femail" ^ sex == "Female") {
            s = false;
        }
        this.sex = s;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
