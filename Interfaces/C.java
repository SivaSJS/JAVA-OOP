package com.company;

public class C extends B implements A ,D{


    @Override
    public void value() {
        // similar like abstract it also needs to override whats inside in interfaces
    }

    @Override
    public void dval() {
        // here we implemented dval method from interface D we can achieve multi implements from interface
    }

    // and it can also extends class B which is normal class not interface
}
