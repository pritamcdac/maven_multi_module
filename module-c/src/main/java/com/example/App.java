package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();

        System.out.println(moduleA.getMessageFromA());
        System.out.println(moduleB.getMessageFromB());
    }
}
