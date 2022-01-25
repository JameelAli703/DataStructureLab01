package DSA_LAB_01;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two +ve No: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("("+a+","+b+")");
        if (a%10==7 && a%2!=0 &&  b%10==7 && b%2!=0){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
