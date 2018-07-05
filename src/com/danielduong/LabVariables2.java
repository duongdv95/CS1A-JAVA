package com.danielduong;

import java.util.Scanner;

public class LabVariables2 {
    public static void main(String[] args) {
        myvariables test = new myvariables();
        test.getValues();
        test.displayValues();
    }
}

class myvariables {
    private double totalcount;
    private double n;
    private String finalstring;

    public void getValues() {
        double count = 0;
        String first, last;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        count = input.nextDouble();
        System.out.print("Enter another number: ");
        n = input.nextDouble();
        System.out.print("Enter a name: ");
        first = input.next();
        System.out.print("Enter a name: ");
        last = input.next();

        n++;
        totalcount = count + n;

        finalstring = first + " " + last;
    }

    public void displayValues() {
        System.out.println(" ");
        System.out.println("Total Count: " + totalcount);
        System.out.println("Total Count * 5 = " + (totalcount*5));
        System.out.println("Total Count/2 = " + (totalcount/2));
        System.out.println("Final String: " + finalstring);
    }
}

