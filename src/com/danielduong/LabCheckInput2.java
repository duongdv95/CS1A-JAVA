package com.danielduong;
import java.sql.SQLOutput;
import java.util.*;

public class LabCheckInput2 {
    public static void main(String[] args) {
        verify test1 = new verify();
        test1.input();
        try {
            int result = test1.quotient();
            System.out.println("RESULT:" + result);
        } catch(ArithmeticException ex)
        {
            System.out.println("Exception: cannot divide by zero");
        }
    }
}

class verify
{
    private int number1;
    private int number2;

    public int quotient()
    {
        if(number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        else
        {
            int total = number1/number2;
            return total;
        }
    }

    public void input()
    {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do
        {
            try
            {
                System.out.print("Enter two numbers: ");
                number1 = input.nextInt();
                number2 = input.nextInt();
                System.out.println();
                continueInput = false;
            }
            catch(InputMismatchException ex)
            {
                System.out.println("Try again. An integer is required!");
                input.nextLine();
            }
        } while(continueInput);

    }
}