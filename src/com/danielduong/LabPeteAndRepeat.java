package com.danielduong;

public class LabPeteAndRepeat {
    public static void main(String[] args) {
        repeat wells = new repeat();
        wells.setHour(9); //argument
        wells.setMinute(20);
        wells.shiftBy(2, 10);

        wells.getTime();
        wells.countDown(10);
    }
}

class repeat {
    int hour, minute;
    void setHour(int newValue) //mutator method
    {

        hour = newValue;
    }

    void setMinute(int newValue)
    {
        minute = newValue % 60;
    }

    void shiftBy(int dh, int dm)
    {

        hour += dh;
        minute += dm;
    }
    void countDown(int timer) //parameter
    {

        for(int i = timer; i >0; i--)
            System.out.println(i);

        System.out.println("Goodbye to Now");
    }

    void getTime() //accessor method
    {
        String message = "The target time is:  " + hour + ":" + minute;

        System.out.println(message);
    }
}