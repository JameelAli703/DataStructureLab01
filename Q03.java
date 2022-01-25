package DSA_LAB_01;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary No: ");
        String Binary = sc.next();
        int Deci = Integer.parseInt(Binary,2);
        System.out.println("Decimal No: "+Deci);
    }
}
