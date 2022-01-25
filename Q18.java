package DSA_LAB_01;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the character : ");
        String ch=sc.next();
        boolean uppercase = ch.charAt(0) >= 65 && ch.charAt(0) <= 90;
        boolean lowercase = ch.charAt(0) >= 97 && ch.charAt(0) <= 122;
        boolean vowels = ch.equals("a") || ch.equals("e") ||ch.equals("i")
                || ch.equals("o") || ch.equals("u") || ch.equals("A") ||
                ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U") ;
        if (ch.length()>1){
            System.out.println("sorry its not a character");
        }
        else if (!(uppercase || lowercase)){
            System.out.println("invalid input");
        }
        else if (vowels){
            System.out.println("the entered character is vowel");
        }
        else {
            System.out.println("the entered character is consonant");
        }

    }
}
