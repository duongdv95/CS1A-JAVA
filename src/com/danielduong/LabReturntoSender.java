package com.danielduong;

public class LabReturntoSender {
    public static void main(String[] args) {
        nonmember();
    }

    static void nonmember() {
        myclass foo = new myclass();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int total = 0;
        total = foo.addition(num1, num2);
        System.out.print("total: ");
        System.out.println(total);
        foo.addition(num1, num2, num3);
    }
}

class myclass
{
    int addition (int a, int b) //method overloading
    {
        int r;
        r= a + b;
        return r;
    }

    void addition (int a, int b, int c)
    {
        System.out.print("Total is now: ");
        System.out.println(a + b + c);
    }
}