package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner inputScanner = new Scanner(System.in);
        double input;
        double maxNumber = 0;

        ArrayList<Double> numbers = new ArrayList<>();

        do {
            int numerator = numbers.size();
            numerator ++;

            System.out.print("Number " +  numerator + ": ");
            input = inputScanner.nextDouble();

            if (input < 0)
            {
                break;
            }

            numbers.add(input);
        } while (input > 0);

        if(numbers.size() == 0)
        {
            System.out.println("No number entered.");
            return;
        }

        for (double d : numbers) {
            if (maxNumber < d)
                maxNumber = d;
        }

        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("The largest number is " +  f.format(maxNumber));
    }

    //todo Task 2
    public void stairs(){
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = inputScanner.nextInt();

        if (n <= 0)
        {
            System.out.println("Invalid number!");
            return;
        }

        int currentNumber = 1;

        for (int currentLine = 0; currentLine < n; currentLine++)
        {
            for (int currentNumberInLine = 0; currentNumberInLine <= currentLine; currentNumberInLine++)
            {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.print(System.lineSeparator());
        }
    }

    //todo Task 3
    public void printPyramid(){
        int rows = 6;
        int stars = 1;

        for(int line = 0; line < rows; line++)
        {
            int spaces = rows - line - 1;

            while (spaces > 0)
            {
                System.out.print(" ");
                spaces --;
            }

            for (int starsInLine = 0; starsInLine < stars; starsInLine++)
            {
                System.out.print("*");
            }

            // line break
            System.out.print(System.lineSeparator());
            stars += 2;
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}