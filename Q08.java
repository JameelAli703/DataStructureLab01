package DSA_LAB_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Income : $");
        double i = sc.nextFloat();
        double tax = 0f;
        if (i<=20000){
            tax = 0;
        }else if (i<=40000){
            tax = ((2000)+(i-20000)*0.1);
        }else if (i<=60000){
            tax = ((2000)+(40000*0.1)+((i-40000-20000)*0.2));
        }else if (i>60000){
            tax = (8000)+(40000*0.1)+(60000*0.2)+((i-60000-40000-20000)*0.3);
        }
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Tax = $"+f.format(tax));
    }
}
