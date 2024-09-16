import java.util.Random;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswer = 0;

        for ( int i = 1; i <= 5; i++) {
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;
            int correctResult = a*b;

            System.out.printf("Sample %d: How much will it be %d * %d?", i, a, b);
            int Answer = scanner.nextInt();

            if (Answer == correctResult) {
                System.out.println("\u001B[32mCorrect!\u001B[0m");
                correctAnswer++;
            } else {
                System.out.println("\u001B[31mWrong! Correct answer: %d\u001B[0m%n" + correctResult);
            }
        }

        System.out.println("\nYour result is: " );
        switch (correctAnswer) {
            case 5:
                System.out.println("\u001B[32mGreat!\u001B[0m");
                break;
            case 3:
            case 4:
                System.out.println("\u001B[33mI would have to learn more!\u001B[0m");
                break;
            default:
                System.out.println("\u001B[31mNeed to learn the multiplication table right away!\u001B[0m");
        }
        scanner.close();
    }
}
