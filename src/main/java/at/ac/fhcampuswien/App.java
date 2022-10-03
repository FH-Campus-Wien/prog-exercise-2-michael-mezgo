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

        ArrayList<Double> numbers = new ArrayList<Double>();

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
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
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