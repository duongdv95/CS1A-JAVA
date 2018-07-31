package com.danielduong;

import jdk.nashorn.internal.scripts.JO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

public class Project4 {
    public static void main(String[] args) throws Exception {
        webblogger program = new webblogger();
        try {
            program.chooseFile();
        } catch (Exception ex) {
            System.out.println("No File Selected");
        }
    }
}

class webblogger {
    private String [] webLogArray = new String[2990];

    public void chooseFile() throws Exception
    {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        int i = 0;
        if( result == JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileChooser.getSelectedFile();
            String filename = fileChooser.getSelectedFile().getPath();
            JOptionPane.showMessageDialog(null, "You selected " + filename);

            Scanner input = new Scanner(file);
            while(input.hasNext()) {
                String currentLine = input.nextLine();
                webLogArray[i] = currentLine;
                i++;
            }
            for(int j = 0; j<webLogArray.length; j++) {
                System.out.println(webLogArray[j]);
            }
            input.close();
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "You did not select anything!");
        }
    }

    public void storeToArray() {

    }
    public void openFile(String source, String target, String oldStr, String newStr) throws Exception
    {
//        File sourceFile = new File(source);
    }

    public void writeOutputFile(){
//        PrintWriter output = new PrintWriter(file);
//        output.println(record);
//        output.close();
    }
}
