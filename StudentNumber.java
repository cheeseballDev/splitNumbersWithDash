package javaActivities;

import java.util.Scanner;

public class StudentNumber {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        clearScreen();
        while(true) {
            System.out.printf("Enter your student number: ");
            try {
                String studentNumber = userInput.nextLine();
                if (studentNumber.length() != 9) {
                    throw new Exception("Invalid number of digits");
                }
                changeFormatOfStudentNumber(studentNumber);
                break;
            } catch (Exception e) {
                System.out.println("Invalid number! Please try again! Error code: " + e);
                Thread.sleep(1000);
                continue;
            }
            
        }
    }

    public static void changeFormatOfStudentNumber(String studentNumber) {
        String formattedNumber = studentNumber.replaceAll("(.{4})(.{2})","$1-$2-");
        System.out.printf(formattedNumber);
        System.out.printf("\nSuccessfully converted your student number!");
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
