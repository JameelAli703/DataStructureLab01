package DSA_LAB_01;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter te string : ");
        String s= sc.next();
        int position;
        int length;
        if (s.length()%2==0) {
            position = s.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = s.length() / 2;
            length = 1;
        }
        System.out.println("Middle character = "+s.substring(position,position+length));
    }
}
