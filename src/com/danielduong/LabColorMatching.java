package com.danielduong;

public class LabColorMatching {
    public static void main(String[] args) {
        colormatch red = new colormatch();
        red.printColorUsingSwitch("red");
        red.printColorUsingIf("red");
        // switch case string is case sensitive
        red.printColorUsingSwitch("RED");
        red.printColorUsingSwitch("blue");
    }
}

class colormatch
{

    public void printColorUsingIf(String color) {
        if (color.equals("blue")) {
            System.out.println("BLUE");
        } else if (color.equals("red")) {
            System.out.println("RED");
        } else {
            System.out.println("INVALID COLOR CODE");
        }
    }

    public void printColorUsingSwitch(String color) {
        switch (color) {
            case "blue":
                System.out.println("BLUE");
                break;
            case "red":
                System.out.println("RED");
                break;
            default:
                System.out.println("INVALID COLOR CODE");
        }
    }

}