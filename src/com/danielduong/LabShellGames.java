package com.danielduong;

public class LabShellGames {
    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapShells(a[0], a[1]); //pass by value
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        System.out.println("Before invoking swapFirstInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapShellsFirstInArray(a); //pass by sharing
        System.out.println("After invoking swapFirstInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }
    public static void swapShells(int n1, int n2) //pass by value
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swapShellsFirstInArray(int[] array) //pass by sharing
    {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
