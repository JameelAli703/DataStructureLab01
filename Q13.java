package DSA_LAB_01;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");
        String s = sc.next();
        switch (s) {
            case "First":
                System.out.print("Enter the subject name :");
                String sb = sc.next();
                switch (sb) {
                    case ("programming fundamentals"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("applied calculus"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("functional english"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("applied physics"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("IICT"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("OOP"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("professional practices"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("ITS"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("LAAAG"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("islamic studies"):
                        System.out.println(sb + " exists in first year");
                        break;
                    case ("Pakistan studies"):
                        System.out.println(sb + " exists in first year");
                        break;
                    default:
                        System.out.println("invalid subject");
                }
                break;
            case ("second"):
                System.out.print("enter te subject name:");
                String sbj = sc.next();
                switch (sbj) {
                    case ("DSA"):
                        System.out.println(sbj + " exists in second year");
                        break;
                    case ("database"):
                        System.out.println(sbj + " exists in second year");
                        break;
                    case ("software echonomics"):
                        System.out.println(sbj + " exists in second year");
                        break;
                    case ("SRE"):
                        System.out.println(sbj + " exists in second year");
                        break;
                    case ("OPERATION RESEARCH"):
                        System.out.println(sbj + " exists in second year");
                        break;
                    default:
                        System.out.println("invalid subject");
                }
            default:

        }

    }
}
