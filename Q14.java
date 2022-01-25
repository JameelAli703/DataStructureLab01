package DSA_LAB_01;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the distance in meters :");
        double d=sc.nextInt();
        System.out.print("input hours : ");
        double t1= sc.nextInt();
        System.out.print("input minutes : ");
        double t2= sc.nextInt();
        System.out.print("input seconds : ");
        double t3= sc.nextInt();
        t1=t1 + (t3/(60*60))+(t2/(60));
        t3 = (t1*60*60)+t3+(t3*60);
        double f1=d/t3;
        double f2=(d/1000)/t1;
        double f3=((d/1609)/t1);
        System.out.println("speed in m/s = "+f1);
        System.out.println("speed in km/h = "+f2);
        System.out.println("speed in miles /hour = "+f3);
    }
}
