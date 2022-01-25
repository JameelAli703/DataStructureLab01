package DSA_LAB_01;
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Value : ");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }
}
