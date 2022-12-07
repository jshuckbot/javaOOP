package ru.gb;


import java.io.IOException;
import java.util.Arrays; /**
 * lesson_5
 *
 */
public class Program
{
    public static void main( String[] args ) {
        try {
            Controller Calculator = new Controller();
            Calculator.run();
        } catch (IOException ie) {
            System.out.println(ie);
        }
    }
}
