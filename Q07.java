package DSA_LAB_01;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float count1=0, count2=0;
        System.out.print("Enter the Max: Denominator: ");
        int max = sc.nextInt();
        for (int i =0; i<max; i++){
            if (max%2==0){
                float x =  ((2*max)+1);
                count1=count1+(1/x);
            }else {
                float x =  ((2*max)+1);
                count2=count2+(1/x);
            }
        }
        System.out.println("pi = "+4*(count1-count2));
    }
}
