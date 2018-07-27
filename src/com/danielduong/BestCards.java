package com.danielduong;

public class BestCards {
    public static void main(String[] args) {
        // Default constructor using Instance method & Mutator method & Accessor Method
        System.out.println("=========DEFAULT CONSTRUCTOR GREETING CARD=========");
        Greeting defaultGreeting = new Greeting();
        defaultGreeting.displayGreetingCard();
        defaultGreeting.setMessage("Merry Christmas and a Happy New Year!");
        System.out.println("Updated Message: " + defaultGreeting.getMessage());

        // Constructor with set parameters using Instance method & Mutator method & Accessor Method
        System.out.println("=========VALENTINES GREETING CARD=========");
        Greeting valentines = new Greeting("Bob", "Jen", "You sweep me off my feet and make me feel special. You have my heart.", "Valentines");
        valentines.displayGreetingCard();
        valentines.setSender("Megan");
        System.out.println("Updated Sender: " + valentines.getSender());

        // Static Method (works using either class or instance)
        System.out.println("=========STATIC METHOD=========");
        System.out.println("Total Number of Greetings: " + Greeting.getNumberOfGreetings());
    }
}

class Greeting {
    // Instance fields
    private String receiver;
    private String sender;
    private String message;
    private String occasion;
    private int greetingCardNumber;

    // Static field
    private static int numberOfGreetings = 0;

    // Constructors
    public Greeting(String startReceiver, String startSender, String startMessage, String startOccasion) {
        receiver = startReceiver;
        sender = startSender;
        message = startMessage;
        occasion = startOccasion;

        greetingCardNumber = ++numberOfGreetings;
    }

    public Greeting() {
        // Default constructor if no parameters provided
        receiver = "John Doe";
        sender = "Jane Doe";
        message = "We’re wishing you a Christmas filled with the warmth of family, friends, and fun.";
        occasion = "Christmas";

        greetingCardNumber = ++numberOfGreetings;
    }

    public static int getNumberOfGreetings() {
        return numberOfGreetings;
    }

    // Accessor Methods
    public String getReceiver() {
        return receiver;
    }
    public String getSender() {
        return sender;
    }
    public String getMessage() {
        return message;
    }
    public String getOccasion() {
        return occasion;
    }

    // Mutator Methods
    public void setReceiver(String newReceiver) {
        receiver = newReceiver;
    }
    public void setSender(String newSender) {
        sender = newSender;
    }
    public void setMessage(String newMessage) {
        message = newMessage;
    }
    public void setOccasion(String newOccasion) {
        occasion = newOccasion;
    }

    // Instance Method
    public void displayGreetingCard() {
        System.out.println("Receiver: " + receiver);
        System.out.println("Sender: " + sender);
        System.out.println("Greeting card number: " + greetingCardNumber);
        System.out.println("Occasion: " + occasion);
        System.out.println("Message: " + message);
    }
}
