package de.pta.test.example;

import clinic.programming.training.Application;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Application app = new Application();
        app.countWords("Hello World");
    }
}
