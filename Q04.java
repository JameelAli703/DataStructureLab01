package DSA_LAB_01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First Integer : ");
        int a = sc.nextInt();
        System.out.print("Input Second Integer : ");
        int b = sc.nextInt();
        if (a!=b){
            System.out.println(a+"!="+b);
            System.out.println(a+"<"+b);
            System.out.println(a+"<="+b);
        }
    }
}
