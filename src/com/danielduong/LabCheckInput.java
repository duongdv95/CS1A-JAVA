package com.danielduong;
import java.util.Scanner;

public class LabCheckInput {
    public static void main(String[] args) {
        InputChecker program = new InputChecker();
        program.input();
        program.quotient();
    }
}

class InputChecker {
    private int number1, number2;
    public void quotient()
    {
        if(number2 == 0)
        {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        else
        {
            int total = number1/number2;
            System.out.println(total);
        }
    }
    public void input()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        System.out.println();


    }
}