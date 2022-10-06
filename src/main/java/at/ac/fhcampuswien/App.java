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
        int rows = inputScanner.nextInt();

        System.out.print("c: ");
        char alphabet = inputScanner.next().charAt(0);

        if (rows % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }

        rows = rows / 2 + 1;

        for (int i = 1; i <= rows; i++) //obere Hälfte
        {
            printRhombusLines(rows, alphabet, i);
        }

        for (int i = rows - 1; i > 0; i--) //untere Hälfte
        {
            printRhombusLines(rows, alphabet, i);
        }
    }

    private void printRhombusLines(int rows, char alphabet, int i) {
        /*
        The following function lines of Code have been taken from the Internet | https://www.tutorialgateway.org/java-program-to-print-diamond-alphabets-pattern/, last visit: 06.10.2022

        Kleine Änderungen durchgeführt.
         */

        // Ausgabe der Leerzeilen
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }

        //  Herunterzählen der linken Seite bis zum Zeichen
        for (int k = i; k >= 1; k--) {
            System.out.print((char) (alphabet - k + 1));
        }

        // Hochzählen auf der rechte Seite bis zum Zeichen
        for (int l = 2; l <= i; l++) {
            System.out.print((char) (alphabet - l + 1));
        }

        // Zeilenumbruch
        System.out.println();
    }

    //todo Task 5
    public void marks() {
        Scanner inputScanner = new Scanner(System.in);

        int markCounter = 0;
        int negativeMarkCounter = 0;
        double avg = 0;
        int input;
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
        do {
            currentNumber = 0;
            for (int i = 0; i < n.length(); i++) {
                int num = getNumericValue(n.charAt(i));
                currentNumber += Math.pow(num, 2);
            }

            n = currentNumber + "";
        } while (currentNumber != 1 && currentNumber != 4);

        // Output
        if (currentNumber == 4) {
            System.out.println("Sad number!");
        } else {
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