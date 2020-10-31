package com.grigor.picsart;

public class HomeWork {

    public static void main(String[] args) {

        // Task 1
        // Create an array and fill it with 2 number.
        System.out.println("Task 1\n" + "" + "Create an array and fill it with 2 number.");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2;
        }

        // Task 2
        // Create an array and fill it with numbers from 1:1000.

        System.out.println("Task 2\n" + "Create an array and fill it with numbers from 1:1000.");

        int[] integersArray = new int[1000];
        for (int i = 0; i < integersArray.length; i++) {
            integersArray[i] = i + 1;
            System.out.print(integersArray[i] + " ");
        }

        // Task 3
        // Create an array and fill it with odd numbers from -20:20

        System.out.println(" Task 3\n" + "Create an array and fill it with odd numbers from -20:20");

        int[] oddNumbersArray = new int[20];
        for (int i = -19, j = 0; i <= 20 && j < oddNumbersArray.length; i += 2, j++) {
            oddNumbersArray[j] = i;
        }

        // print array elements
        for (int i = 0; i < oddNumbersArray.length; i++) {
            System.out.print(oddNumbersArray[i] + " ");
        }

        // Task 4
        // Create an array and fill it. Print all elements which can be divided by 5.

        System.out.println("Task 4\n" + "Create an array and fill it. Print all elements which can be divided by 5.");

        int[] numbersSequence = {1, 5, 18, 35, 14, -50, 27, 40, 86};
        for (int i = 0; i < numbersSequence.length; i++) {
            if (numbersSequence[i] % 5 == 0) {
                System.out.print(numbersSequence[i] + " ");
            }
        }

        // Task 5
        // Create an array and fill it. Print all elements which are between 24.12 and 467.23.

        System.out.println("Task 5\n" + "Create an array and fill it. Print all elements which are between 24.12 and 467.23.");

        int[] numbers = {45, 32, -87, 45, -113, 7891, 1, 4, 48, -856, 1203, 485, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 24.12 && numbers[i] < 467.23) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Task 6
        // Create an array and fill it. Print count of elements which can be divided by 2.

        System.out.println("Task 6\n" + "Create an array and fill it. Print count of elements which can be divided by 2.");

        int countOfElements = 0;
        int[] numbersArray = {4, 5, 14, 5, 3, 10, 51, 35, 147, 65, 89, 98, 112, 364};
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                countOfElements++;
            }
        }
        System.out.println("Count of elements which can be divided by 2: " + countOfElements);

        // Task 7
        // Given an integer, 0< N < 21 , print its first 10 multiples.
        // Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.

        System.out.println("Task 7\n" +
                "Given an integer, 0< N < 21 , print its first 10 multiples.\n" +
                "Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.");
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
