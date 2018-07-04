package com.danielduong;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LabVariables {
    public static void main(String[] args) {
        username newuser = new username();
        newuser.getName();
        newuser.display_usernames();
        newuser.GUIgetname();
        newuser.GUIdisplay_usernames();
    }
}

class username {
    private String first;
    private String last;

    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        first = input.next();
        System.out.print("Enter your last name: ");
        last = input.next();
        System.out.println("");
    }
    public void display_usernames() {
        System.out.println("These usernames are available for use:");
        System.out.println(first + last);
        System.out.println(last + first);
        System.out.println(first + " " + last);
        System.out.println(last + "-" + first);
    }
    public void GUIgetname() {
        first = JOptionPane.showInputDialog("Enter first name:");
        last = JOptionPane.showInputDialog("Enter last name:");
    }
    public void GUIdisplay_usernames() {
        String output = "Available usernames are: " + "\n" + first + last + "\n"
                + last + first + "\n" + first + " " + last + "\n" + last
                + "-" + first + "\n";
        JOptionPane.showMessageDialog(null, output);
    }
}
