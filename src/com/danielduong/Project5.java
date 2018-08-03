package com.danielduong;
import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        seating chart = new seating();
        chart.askUser();
    }
}

class seating {
    private String [] seatingAssignment = new String[20];

    public void askUser() {
        int n;
        int seatNumber;
        String studentName;
        int emptySeats = 20;
        Scanner scanner = new Scanner( System.in );

        do {
            emptySeats = 20;
            System.out.println("Enter 1 to add student, 2 to move/swap student, or 3 to check available seats: ");
            n = scanner.nextInt();
            if(n == 1) {
                System.out.println("Enter a student's name: ");
                studentName = scanner.next();
                System.out.println("Assign a seat: ");
                seatNumber = scanner.nextInt();
                addStudent(studentName, seatNumber);
            } else if (n == 2) {
                System.out.println("Enter a student's name: ");
                studentName = scanner.next();
                System.out.println("Select a seat: ");
                seatNumber = scanner.nextInt();
                moveStudent(studentName, seatNumber);
            } else if (n == 3) {
                checkAvailableSeats();
            } else {
                System.out.println("Invalid option, try again.");
            }
            for(String element : seatingAssignment) {
                if(element == null) {
                    emptySeats--;
                }
            }
        }
        while (emptySeats > 0);
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
            }
        }
    }

    public void checkAvailableSeats() {
        String availableSeatsList = "Available Seats: ";
        for(int i = 0; i < seatingAssignment.length; i++) {
            if(seatingAssignment[i] == null) {
                availableSeatsList += i + " ";
            }
        }
        System.out.println(availableSeatsList);
    }

    public void printSeats() {
        int position = 0;
        for(String element : seatingAssignment) {
            System.out.println(position + " " + element);
            position++;
        }
    }
}