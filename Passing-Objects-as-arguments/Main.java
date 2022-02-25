package com.company;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c= new Child("Eren");
        p.childName(c);
    }
}