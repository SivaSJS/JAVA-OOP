package com.company;

import java.util.Arrays;
import java.util.Scanner;

public interface A {

    // Every fields that's declared inside an interface is going to be static and final.
    // so we need to instanciate and need to give value at first place
    // int val; // <- This is show as error
    int val = 20;  // <- This will not
    // like abstract methods every method here is abstract method we can't explicitly say but
    // automatically it will be abstract method except static

/*   void value(){
      this is wrong it shouldn't to have method body
}*/

   //  correct one is
    void value();

}


