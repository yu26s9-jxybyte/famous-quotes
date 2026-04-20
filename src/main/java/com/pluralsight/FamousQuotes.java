package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] quotes = {
                "The future belongs to those who prepare for it today. Malcolm X", "",
                "The most courageous act is still to think for yourself aloud. Coco Chanel", "",
                "A great man is always willing to be little. Ralph Waldo Emerson", "",
                "Family is the most important thing in the world. Diana (Princess of Wales)", "",
                "I came, I saw, I conquered. Julius Caesar", "",
                "To be, or not to be, that is the question. William Shakespeare.", "",
                "Keep calm and carry on. Winston Churchill", "",
                "It is what it is Joffre V", "",
                "Those who dare to fail miserably can achieve greatly. John F Kennedy","",
                "A great man is always willing to be little. Ralph Waldo Emerson","",

        };
        System.out.print("Enter a number between 1 and 10: ");
        int choice = scanner.nextInt();

        try{
        System.out.println("Your quote: ");
        System.out.println(quotes[choice]);
    } catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
}}