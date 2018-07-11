package com.danielduong;

import static javax.swing.JOptionPane.*;

public class LoopAccumulatorExercise {
    public static void main(String[] args) {
        exercise run = new exercise();
//        run.one();
//        run.two(4);
//        run.three();
//        run.four();
        run.five();
    }
}

class exercise {
    void one() {
        for(int i=10; i>1; i--) {
            System.out.println("There were " + i + " in the bed");
            System.out.println("And the little one said");
            System.out.println("Roll over, roll over");
            System.out.println("So they all rolled over");
            System.out.println("And one fell out");
        }
        System.out.println("There was 1 in the bed");
        System.out.println("And the little one said");
        System.out.println("Good Night!");
    }

    void two(int n) {
        int sum = 0;
        String sumString = "";
        for(int i=1;i<=n;i++){
            sum += i*i;
            sumString += "+" + i*i;
        }
        System.out.println(sumString + " = " + sum);
    }

    void three() {
        String prompt = "Enter n: ";
        String input = showInputDialog(prompt);
        int n = Integer.parseInt(input);
        String output = "";
        int initial = 1;
        int sum = 0;
        for(int i=0; i<n;i++){
            output += "+" + initial;
            sum += initial;
            initial += 2;
        }
        output += " = " + sum;
        showMessageDialog(null, output);
    }

    void four() {
        String prompt = "Enter an integer (over 0): ";
        String input = showInputDialog(prompt);
        int n = Integer.parseInt(input);
        String output = "";
        int sum = 1;
        for(int i=1; i<=n;i++){
            sum *= i;
            output += "*" + i;
        }
        output += " = " + sum;
        showMessageDialog(null, output);
    }

    void five() {
        String prompt = "Enter an integer (over 0): ";
        String input = showInputDialog(prompt);
        int n = Integer.parseInt(input);
        String output = "";
        double sum = 0;
        for(int i=1; i<=n;i++){
            sum += Math.pow(0.5,i);
            output += "+" + "(1/2)^" + i;
        }
        output += " = " + sum;
        showMessageDialog(null, output);
    }
}
