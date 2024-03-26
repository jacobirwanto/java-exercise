package com.adepuu.exercises.session6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true){
            System.out.print("Enter numbers to calculate average, enter 'q' to finish : ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")){
                break;
            }
            try {
                int num = Integer.parseInt(input);
                sum = sum + num;
                count++;
            } catch (NumberFormatException e){
                System.out.println("Invalid input, please enter a valid number or enter 'q' to finish");
            }

        }
            if (count > 0){
                double average = (double) sum / count;
                System.out.println("Average : " + average);
            } else {
                System.out.println("No valid numbers entered");
            }
    }
    }
