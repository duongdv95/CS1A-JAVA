package com.danielduong;
import javax.swing.JOptionPane;

public class LabPeteAndRepeat2 {
    public static void main(String[] args) {
        scores start = new scores();
        start.loadScores();
        start.displayScores();
    }
}

class scores
{
    int total;

    int[] stats = new int[10];

    void loadScores()
    {
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

    void displayScores()
    {
        int total = 0;
        String output = "";
        for (int i = 0; i < stats.length; i++)
        {

            total = total + stats[i];
            output = output + stats[i] + "\n";
        }
        System.out.println(total);
        System.out.println(output);
    }
}