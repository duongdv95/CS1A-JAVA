package com.danielduong;

import java.util.Scanner;

public class LabSimpleNumberSort {
    public static void main(String[] args) {
        comparison2 run = new comparison2();
        run.compare_values();
        run.display_values();
    }
}

class comparison2 {
    private double smallest;
    private double middle;
    private double largest;

    void compare_values() {
        double val1, val2, val3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        val1 = input.nextDouble();
        System.out.print("Enter a number: ");
        val2 = input.nextDouble();
        System.out.print("Enter a number: ");
        val3 = input.nextDouble();
        if (val1<=val2 && val1<=val3) {
            smallest = val1;
            if (val2<=val3) {
                middle = val2;
                largest = val3;
            }
            else {
                middle = val3;
                largest = val2;
            }
        }
    }
    public void display_values() {
        System.out.println("Smallest: " + smallest + " Middle: " + middle + " Largest: " + largest);
    }
}

