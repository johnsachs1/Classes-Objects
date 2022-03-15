package com.objects.classes;

public class Main{
    String subject;
    // Instance Variables
    String author;
    String works;
    int ageOfWorks;
    String predecessors;

    // Constructor Declaration of Class
    public Main (String subject, String author, String works, int ageOfWorks, String predecessors) {
        this.subject = subject;
        this.author = author;
        this.works = works;
        this.ageOfWorks = ageOfWorks;
        this.predecessors = predecessors;
    }

    // method 1
    private String getSubject() {
        return this.subject;
    }

    // method 2
    private String getAuthor() {
        return this.author;
    }

    //method 3
    private String getWorks() {
        return works;
    }

    //method 4
    private int getAge() {
        return ageOfWorks;
    }

    //method 5
    private String getPredecessors() {
        return predecessors;
    }

    public String toString() {
        return ("In the subject of " + this.getSubject() + ", " +
                this.getAuthor() + " is arguably one of the greatest, " +
                "if not the greatest, mathematician of all time. " +
                "His works are sporadic and expand to over 1500 collaborative" +
                " works in total. Many of his works can be found in " +
                this.getWorks() + "compiled and edited in " + this.getAge() +
                ". " + "One famous mathematician he influenced was " + this.getPredecessors()
                + ".");
    }

    public static void main(String[] args) {
        // outputs from private classes and objects
        Main Main= new Main("Mathematics", "Paul Erdos", "The Mathematics of Paul Erdos" ,
                2008, "Terance Tao");
        System.out.println (Main.toString());
    }
}
