package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Character.getNumericValue;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner inputScanner = new Scanner(System.in);

        double input;
        int numerator = 1;
        double maxNumber = 0;

        do {
            System.out.print("Number " +  numerator + ": ");
            input = inputScanner.nextDouble();

            if(input > maxNumber)
            {
                maxNumber = input;
            }

            numerator ++;
        } while (input > 0);

        if(maxNumber == 0)
        {
            System.out.println("No number entered.");
            return;
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
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("h: ");
        int height = inputScanner.nextInt();
        System.out.print("c: ");
        //char middleChar = inputScanner.next().charAt(0);

        if (height % 2 != 0)
        {
            System.out.println("Invalid number!");
            return;
        }

        // Muss noch gemacht werden!
    }

    //todo Task 5
    public void marks() {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<Integer> markList = new ArrayList<>();
        int mark;

        do {
            int numerator = markList.size();
            numerator++;

            System.out.print("Mark " + numerator + ": ");
            mark = inputScanner.nextInt();

            if (mark > 0) {
                if (mark > 5) {
                    numerator--;
                    System.out.println("Invalid mark!");
                } else {
                    markList.add(mark);
                }
            }

        } while (mark > 0);

        double sum = 0;
        int negativeMarks = 0;
        double avg = 0;

        if (markList.size() > 0) {
            for (double d : markList) {
                sum += d;

                if (d == 5)
                    negativeMarks++;
            }

            avg = sum / markList.size();
        }

        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("Average: " + f.format(avg) + System.lineSeparator() + "Negative marks: " + negativeMarks);
    //todo
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("n: ");
        String n = inputScanner.next();

        int[] number = new int[n.length()];
        int position = 0;
        for (char c: n.toCharArray()) {
            number[position] = getNumericValue(c);
        }

        // todo
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