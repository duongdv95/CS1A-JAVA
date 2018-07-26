package com.danielduong;

public class LabPalindrome {
    public static void main(String[] args) {
        Palindrome program = new Palindrome();
        program.inputPal("ABBA");
        program.inputPal("racecar");
        program.inputPal("nope");
    }
}

class Palindrome
{
    private String pal;
    public boolean checkPalindrome()
    {
        int low = 0;
        int high = pal.length()-1;
        while (low < high)
        {
            if(pal.charAt(low) != pal.charAt(high))
                return false;
            low++;
            high--;

        }
        return true;
    }

    public void inputPal(String testString)
    {
        pal = testString;
        if(checkPalindrome())
            System.out.println(pal + " is a palindrome.");
        else
            System.out.println(pal + " is not a palindrome.");

    }
}