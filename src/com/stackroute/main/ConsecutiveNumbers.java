package com.stackroute.main;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumbers {
    public void checkConsecutive(){
        System.out.println("Enter 7 digits : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputArray[]=input.split(",");
        if(inputArray.length != 7)
            System.out.println("7 digits are not provided");
        else {
            Arrays.sort(inputArray);
            boolean check = true;
            for (int i = 0, j = 1; i < inputArray.length - 1; i++, j++) {
                if (Integer.valueOf(inputArray[j]) - Integer.valueOf(inputArray[i]) == 1) {
                    continue;
                }
                check = false;
            }
            if (check)
                System.out.println(input + " are consecutive numbers");
            else
                System.out.println(input + " are non consecutive numbers");
        }
    }

    public static void main(String[] args) {
        ConsecutiveNumbers consecutiveNumbers = new ConsecutiveNumbers();
        consecutiveNumbers.checkConsecutive();
    }
}
