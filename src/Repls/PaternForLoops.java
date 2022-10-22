package Repls;

import java.util.Scanner;

public class PaternForLoops {
    public static void main(String[] args) {

        int number = 4;
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 3) {
                for (int j = 0; j < number; j++) {
                    System.out.print("$");
                }
                System.out.println();
            }
            if (i >= 1 && i <= 2) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == 2) {
                        System.out.print("$ ");
                    } else if (j >= 1 && j <= 5) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}