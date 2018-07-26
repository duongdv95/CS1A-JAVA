package com.danielduong;
import javax.swing.JOptionPane;

public class LabPeteAndRepeat3 {
    public static void main(String[] args) {
        scores3 program = new scores3();
        program.loadScores();
//        program.displayScores();
        program.quickDisplay();
        program.sort();
        program.quickDisplay();
    }
}

class scores3 {
    int total;

    int stats[] = new int[10];

    public void loadScores() {
        int option = JOptionPane.YES_OPTION;
        int n = 0;

        while(option == JOptionPane.YES_OPTION && n < stats.length)
        {

            String dataString = JOptionPane.showInputDialog("Enter score for player: ");
            int data = Integer.parseInt(dataString);

            stats[n] = data;
            if(n < stats.length -1)
                option = JOptionPane.showConfirmDialog(null, "Continue?");

            n++;

        }
    }

    void displayScores() {
        int total = 0;
        String output = "";
        for (int i = 0; i < stats.length; i++)
        {

            total = total + stats[i];
            output = output + stats[i] + "\n";
        }
        output = output + "Team Total: " + total;
        JOptionPane.showMessageDialog(null, output);
    }

    void quickDisplay() {
        String output = java.util.Arrays.toString(stats);
        JOptionPane.showMessageDialog(null, output);
    }

    void sort() {
        java.util.Arrays.sort(stats);
    }
}