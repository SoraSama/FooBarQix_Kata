package fr.extia.app;
/**
 * Author:andelai.S
 * Date:14/11/2018
 * description: Main page for FooBarQix
 */

import fr.extia.cls.FooBarQix;

public class Application {
    public static void main(String[] args) {
        FooBarQix fooBarQix = new  FooBarQix();
        //Initialization int min and max
        fooBarQix.init(1,100);
        //Output result
        fooBarQix.print();

    }
}
