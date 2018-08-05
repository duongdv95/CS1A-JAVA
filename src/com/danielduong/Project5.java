package com.danielduong;
import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        seating chart = new seating();
        chart.askUser();
    }
}

class seating {
    private String [] seatingAssignment = new String[20];
    int endProgram;

    public void askUser() {
        int n;
        int seatNumber = 0;
        String studentName = null;

        Scanner scanner = new Scanner( System.in );

        do {
            endProgram = 0;
            System.out.println("Enter 1 to add student, 2 to move/swap student, or 3 to check available seats: ");
            n = scanner.nextInt();
            if(n == 1) {
                System.out.println("Enter a student's name: ");
                studentName = scanner.next();
                System.out.println("Assign a seat: ");
                seatNumber = scanner.nextInt();
                addStudent(studentName, seatNumber);
            } else if (n == 2) {
                Boolean isNumeric = false;
                Boolean studentExists = false;

                System.out.println("Enter a student's name: ");
                studentName = scanner.next();

                for(String student : seatingAssignment) {
                    if(student != null) {
                        if(student.toLowerCase().equals(studentName.toLowerCase())) {
                            studentName = student;
                            studentExists = true;
                            break;
                        }
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
            } else {
                System.out.println("Invalid option, try again.");
            }
            for(String element : seatingAssignment) {
                if(element == null) {
                    endProgram ++;
                }
            }
        }
        while (endProgram != 0);
    }

    public void addStudent(String name, int seatPosition) {
        if(seatingAssignment[seatPosition] == null) {
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