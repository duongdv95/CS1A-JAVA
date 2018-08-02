package com.danielduong;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;
import java.util.Arrays;

public class Project4 {
    // Create main method that creates weblogger instance and calls all methods (4pts)
    public static void main(String[] args) throws Exception {
        weblogger program = new weblogger();
        try {
            program.chooseFileAndStoreData();
            program.sortArrayAndOutputFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Create a separate class called weblogger (4pts)
class weblogger {
    private String [] webLogArray = new String[2990];

    // Create a method to read each line of the web log file. (4pts)
    public void chooseFileAndStoreData() throws FileNotFoundException {
        JFileChooser fileChooser;
        fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        int i = 0;
        if(result == JFileChooser.APPROVE_OPTION) {
            File selection = fileChooser.getSelectedFile();
            if(selection.exists()) {
                java.io.File file = fileChooser.getSelectedFile();
                String filename = fileChooser.getSelectedFile().getPath();
                JOptionPane.showMessageDialog(null, "You selected " + filename);

                Scanner input = new Scanner(file);
                // Each line should be stored in a private array (4pts)
                while(input.hasNext()) {
                    String currentLine = input.nextLine();
                    webLogArray[i] = currentLine;
                    i++;
                }
                input.close();
            }
            else {
                throw new FileNotFoundException();
            }
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "You did not select anything!");
            System.exit(0);
        }

    }

    // Create one more method that uses Arrays class sort and write content to a file (4pts)
    public void sortArrayAndOutputFile() {
        Arrays.sort(webLogArray);
        File targetFile = new File("weblog2.txt");
        try {
            PrintWriter output = new PrintWriter(targetFile);
            for(String str: webLogArray) {
                output.println(str);
            }
            output.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}