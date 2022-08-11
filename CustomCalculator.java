package com.JAVA_DSA;
import java.util.Scanner;
public class CustomCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        System.out.println("Now Enter The Operation (+ , - , * , /)");
        char Operator = sc.next().charAt(0);
        switch (Operator){
            case '+':
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " Is " + sum);
                break;
            case '-':
                int Subtraction = num1 - num2;
                System.out.println(num1 + " - " + num2 + " Is " + Subtraction);
                break;
            case '*':
                int Multiplication = num1 * num2;
                System.out.println(num1 + " X " + num2 + " Is " + Multiplication);
                break;
            case '/':
                int Division = num1 + num2;
                System.out.println(num1 + " / " + num2 + " Is " + Division);
                break;
            default:
                System.out.println("**** Invalid Character ****");
        }
    }
}
