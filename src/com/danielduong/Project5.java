package com.danielduong;
import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project5 {
    // main method (5 pts)
    public static void main(String[] args) {
        seating chart = new seating();
        chart.askUser();
    }
}

class seating {
    // instance field (5 pts)
    private String [] seatingAssignment = new String[20];
    private boolean endProgram;

    public void askUser() {
        int n = 1;
        int seatNumber = 0;
        String studentName;
        Scanner scanner = new Scanner( System.in );

        do {
            endProgram = false;
            Boolean validOption = false;
            do {
                try {
                    System.out.println("Enter 1 to add student, 2 to move/swap student, 3 to check available seats, or 4 to end program: ");
                    n = scanner.nextInt();
                    validOption = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input!");
                    scanner.nextLine();
                }
            } while (!validOption);

            if(n == 1) {
                try {
                    System.out.println("Enter a student's name: ");
                    scanner.nextLine();
                    studentName = scanner.nextLine();
                    System.out.println("Assign a seat: ");
                    seatNumber = scanner.nextInt();
                    addStudent(studentName, seatNumber);
                }  catch (InputMismatchException e) {
                    System.out.println("Error! Please enter numeric seat numbers.");
                    scanner.nextLine();
                }
            } else if (n == 2) {
                Boolean isNumeric = false;
                Boolean studentExists = false;

                System.out.println("Enter a student's name: ");
                scanner.nextLine();
                studentName = scanner.nextLine();

                for(String student : seatingAssignment) {
                    if(student != null && student.toLowerCase().equals(studentName.toLowerCase())) {
                        studentName = student;
                        studentExists = true;
                        break;
                    }
                }

                if(!studentExists) System.out.println("Student does not exist!");
                if(studentExists) System.out.println("Select a seat: ");

                while(!isNumeric && studentExists) {
                    try {
                        seatNumber = scanner.nextInt();
                        if(seatNumber > 19) {
                            throw new InputMismatchException();
                        }
                        isNumeric = true;
                    } catch(InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a numeric seat between 0 and 19: ");
                        scanner.nextLine();
                    }
                }
                if(isNumeric && studentExists) {
                    moveStudent(studentName, seatNumber);
                }
            } else if (n == 3) {
                checkAvailableSeats();
            } else if (n == 4) {
                endProgram = true;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }
        while (!endProgram);
    }

    // Mutator methods (3 pts)
    public void addStudent(String name, int seatPosition) {
        if((seatPosition < 20) && (seatingAssignment[seatPosition] == null)) {
            seatingAssignment[seatPosition] = name;
        } else {
            System.out.println("Seat occupied, please pick from these available seats");
            checkAvailableSeats();
        }
    }

    public void moveStudent(String studentName, int targetPosition) {
        String targetPositionStudent = seatingAssignment[targetPosition];

        for (int i = 0; i < seatingAssignment.length; i++) {
            if (studentName.equals(seatingAssignment[i])) {
                seatingAssignment[targetPosition] = studentName;
                seatingAssignment[i] = targetPositionStudent;
                break;
            }
        }
    }

    // Instance method (5 pts) And Accessor method (2 pts)
    public void checkAvailableSeats() {
        int column = 0;
        String availableSeats = "";
        System.out.println("Available Seats:");
        for(int i = 0; i < seatingAssignment.length; i++) {
            String currentSeat = (seatingAssignment[i] == null) ? "Empty" : seatingAssignment[i];
            if(i<10) {
                availableSeats += "Seat " + i + ":  (" + currentSeat + ") ";
            } else {
                availableSeats += "Seat " + i + ": (" + currentSeat + ") ";
            }
            column ++;
            if((column%4) == 0) {
                availableSeats += "\n";
            }
        }
        System.out.println(availableSeats);
    }
}