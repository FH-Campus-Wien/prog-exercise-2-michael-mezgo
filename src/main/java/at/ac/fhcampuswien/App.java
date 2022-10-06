package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner inputScanner = new Scanner(System.in);

        double input;
        int numerator = 1;
        double maxNumber = 0;

        do {
            System.out.print("Number " + numerator + ": ");
            input = inputScanner.nextDouble();

            if (input > maxNumber) {
                maxNumber = input;
            }

            numerator++;
        } while (input > 0);

        if (maxNumber == 0) {
            System.out.println("No number entered.");
            return;
        }

        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("The largest number is " + f.format(maxNumber));
    }

    //todo Task 2
    public void stairs() {
        Scanner inputScanner = new Scanner(System.in);
        int currentNumber = 1;

        // Output n: for User-Input
        System.out.print("n: ");
        int n = inputScanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number!");
            return;
        }

        for (int currentLine = 0; currentLine < n; currentLine++) {
            for (int currentNumberInLine = 0; currentNumberInLine <= currentLine; currentNumberInLine++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.print(System.lineSeparator());
        }
    }

    //todo Task 3
    public void printPyramid() {
        final int ROWS = 6;

        int stars = 1;
        int spaces;

        for (int line = 0; line < ROWS; line++) {
            spaces = ROWS - line - 1;

            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            for (int starsInLine = 0; starsInLine < stars; starsInLine++) {
                System.out.print("*");
            }

            // line break
            System.out.print(System.lineSeparator());
            stars += 2; //Each line has 2 more stars than the previous one
        }
    }

    //todo Task 4
    public void printRhombus() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("h: ");
        int h = inputScanner.nextInt();

        System.out.print("c: ");
        char c = inputScanner.next().charAt(0);

        if (h % 2 == 0)
        {
            System.out.println("Invalid number!");
            return;
        }

        int charsInLongestLine = h*2 - 1;
        StringBuilder secondHalfLine = new StringBuilder();

        for (int i = 0; i < charsInLongestLine / 2 - 1; i++)
        {
            secondHalfLine.append((char) ((int) c - i));
        }

        StringBuilder firstHalfLine = new StringBuilder();
        for (int i = secondHalfLine.length() - 1; i > 0; i--)
        {
            firstHalfLine.append(secondHalfLine.charAt(i));
        }

        String longestLine = firstHalfLine + secondHalfLine.toString();

        System.out.println(longestLine);
    }

    //todo Task 5
    public void marks() {
        Scanner inputScanner = new Scanner(System.in);

        int markCounter = 0;
        int negativeMarkCounter = 0;
        double avg = 0;
        int input = 0;
        int displayMarkCounter;

        do {
            displayMarkCounter = markCounter + 1;
            System.out.print("Mark " + displayMarkCounter + ": ");
            input = inputScanner.nextInt();

            if (input >= 1 && input <= 5) {
                avg = (avg * markCounter + input) / displayMarkCounter;
                markCounter++;

                if (input == 5)
                    negativeMarkCounter++;
            } else if (input != 0) {
                System.out.println("Invalid mark!");
            }
        } while (input != 0); //Exercise: ... bis die Zahl 0 eingegeben wird.

        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("Average: " + f.format(avg) + System.lineSeparator() + "Negative marks: " + negativeMarkCounter);
    }

    //todo Task 6
    public void happyNumbers() {
        Scanner inputScanner = new Scanner(System.in);

        // Input
        System.out.print("n: ");
        String n = inputScanner.next();

        // Calculate number
        int currentNumber;
        do
        {
            currentNumber = 0;
            for (int i = 0; i < n.length(); i++)
            {
                int num = getNumericValue(n.charAt(i));
                currentNumber += Math.pow(num, 2);
            }

            n = currentNumber + "";
        } while (currentNumber != 1 && currentNumber != 4);

        // Output
        if (currentNumber == 4)
        {
            System.out.println("Sad number!");
        }
        else
        {
            System.out.println("Happy number!");
        }
    }

    public static void main(String[] args) {
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