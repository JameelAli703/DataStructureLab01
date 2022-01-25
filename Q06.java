package DSA_LAB_01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //(n / 2)(first number + last number) = sum
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int firstNumber= sc.nextInt();
        System.out.print("Enter Last Number : ");
        int lastNumber = sc.nextInt();
        System.out.print("Number of Terms : ");
        int nT = sc.nextInt();
        int sum = (nT/2)*(firstNumber+lastNumber);
        System.out.println("Sum of Numbers : "+sum);
        double average  = sum/nT;
        System.out.println("Average of Numbers : "+average);
    }
}
