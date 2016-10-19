package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter something like 8 + 33 + 1345 - 137 : ");
        String s = kb.nextLine();

        Scanner sc = new Scanner(s);
        int sum = 0;

        if (s.contains("+")) {
            sc.useDelimiter("\\s*\\+\\s*");
            while (sc.hasNextInt()) {
                sum = sum + sc.nextInt();
            }
        }

        if (s.contains("-")) {
            sc.useDelimiter("\\s*\\-\\s*");
            while (sc.hasNextInt()) {
                sum = sum - sc.nextInt() * 2;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}