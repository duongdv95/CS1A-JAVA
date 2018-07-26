package com.danielduong;

public class LabSubstrings {
    public static void main(String[] args) {
        String x="FROM:meadeladawn@foothill.edu";
        Email inbox = new Email();
        inbox.addEmail("FROM:", x);
        System.out.println(inbox.getEmail(0));
        System.out.println(inbox.getName(0));
        inbox.domain(0);
        inbox.addEmail("FROM:", "FROM:123@gmail.com");
        inbox.addEmail("FROM:", "FROM:apple@gmail.com");
        System.out.println(inbox.getEmail(1));
        System.out.println(inbox.getName(1));
        inbox.domain(1);
        System.out.println("--Print all emails--");
        inbox.getAllEmails();
    }
}

class Email
{
    private int numUsed;
    private String bin[] = new String[10];

    void addEmail(String sub, String s)
    {
        int found = s.indexOf(sub);
        if (found != -1)
        {

            bin[numUsed] = s.substring(found + sub.length(), s.length());
            numUsed ++;
        }

    }

    String getEmail(int i)
    {
        return bin[i];
    }

    String getName(int i)
    {

        int domainlength = bin[i].length() - bin[i].indexOf('@');
        return bin[i].substring(0, bin[i].length()-domainlength);
//        return bin[i].substring(0, bin[i].indexOf('@'));
    }

    void domain(int i)
    {
        String dot = bin[i].substring(bin[i].indexOf('.'), bin[i].length());
        if(dot.equals(".com"))
            System.out.println( "Commercial domain");
        else if(dot.equals(".edu"))
            System.out.println( "Education domain");

    }

    void getAllEmails()
    {
        for (int i=0; i<numUsed; i++)
            System.out.println( bin[i] );
    }
}