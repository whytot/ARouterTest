package com.bill.librarybase;

import java.io.Serializable;

public class Person implements Serializable {
    private String mName;
    private int mAge;

    public Person(String name, int age) {
        this.mName = name;
        this.mAge = age;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        this.mAge = age;
    }

    @Override
    public String toString() {
        return "[ name = " + mName + ", age = " + mAge + " ]";
    }
}
