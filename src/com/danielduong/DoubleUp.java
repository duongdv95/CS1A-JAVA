package com.danielduong;

import java.util.Scanner;

public class DoubleUp {
    public static void main(String[] args) {
        DoubleupUtils program = new DoubleupUtils();
        program.askUser();
        program.calculate();
        program.displayTotal();
    }
}

class DoubleupUtils {
    private int n;
    private int total = 0;

    // Mutator method
    void askUser() {
        Scanner scanner = new Scanner( System.in );
        do {
            System.out.print("Enter a positive integer less than 20: ");
            n = scanner.nextInt();
            if(n>20) {
                System.out.println("Error! Number over 20");
            }
        }
        while (n > 20);
    }

    // Calculation method
    void calculate() {
        for(int i=1;i<=n;i++){
            System.out.println("Double up " + i + " = " + i*2);
            total += i*2;
        }
    }

    // Accessor method
    void displayTotal() {
        System.out.println("Total = " + total);
    }
}

