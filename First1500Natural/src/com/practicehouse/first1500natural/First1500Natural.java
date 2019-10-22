package com.practicehouse.first1500natural;

import java.util.ArrayList;

/**
 *
 * @author arifur.rahman
 */
public class First1500Natural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int index = 1;

        for (int i = 2; index <= 1500; i++) {
            ArrayList<Integer> remainder = new ArrayList<>();
            int number = i;
            while (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                if (number % 2 == 0) {
                    number = number / 2;
                    remainder.add(2);
                } else if (number % 3 == 0) {
                    number = number / 3;
                    remainder.add(3);
                } else if (number % 5 == 0) {
                    number = number / 5;
                    remainder.add(5);
                }
            }

            if (number != 1) {
                remainder.add(10);
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                // do nothing
            } else if (remainder.contains(10)) {
                // do nothing
            } else {
                System.out.println("No. " + index + " -> " + i + ":" + remainder);
                index++;
            }
        }

    }// Main Method
}
