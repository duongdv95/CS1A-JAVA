package com.danielduong;
import java.util.Scanner;

public class LabNoMoreMembersOnly {
    public static void main(String[] args) {
        nonmember_get_values();
    }

    public static void nonmember_get_values() {
        double val1, val2, val3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        val1 = input.nextDouble();
        System.out.print("Enter a number: ");
        val2 = input.nextDouble();
        System.out.print("Enter a number: ");
        val3 = input.nextDouble();

        compare2 sortme = new compare2();
        sortme.compare_values(val1, val2, val3);
        sortme.display_values();
    }
}

class compare2
{
    private double smallest;
    private double middle;
    private double largest;

    void compare_values(double val1, double val2, double val3)
    {
        if (val1<=val2 && val1<=val3) { // && means and
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
        else if (val2<=val1 && val2<=val3)
        {
            smallest = val2;
            if(val1 <= val3)
            {
                middle = val1;
                largest = val3;

            }
            else
            {
                middle = val3;
                largest = val1;
            }

        }
        else
        {  // since neither val1 nor val2 was smaller than val3, val3 must be the smallest
            smallest = val3;
            if (val1<=val2) {
                middle = val1;
                largest = val2;
            }
            else {
                middle = val2;
                largest = val1;
            }
        }
    }

    public void display_values()
    {

        System.out.print("Here is your sort: ");
        System.out.print(smallest);
        System.out.print(" ");
        System.out.print(middle);
        System.out.print(" ");
        System.out.println(largest);
        System.out.println();

    }
}