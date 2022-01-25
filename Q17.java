package DSA_LAB_01;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int days = 0;
        String m_name = "Unknown";
        System.out.print("enter year : ");
        int year=sc.nextInt();
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();
        switch (month) {
            case 1 -> {
                m_name = "January";
                days = 31;
            }
            case 2 -> {
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=
                        0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                m_name = "february";
            }
            case 3 -> {
                m_name = "March";
                days = 31;
            }
            case 4 -> {
                m_name = "april";
                days = 30;
            }
            case 5 -> {
                m_name = "may";
                days = 31;
            }
            case 6 -> {
                m_name = "June";
                days = 30;
            }
            case 7 -> {
                m_name = "July";
                days = 31;
            }
            case 8 -> {
                m_name = "August";
                days = 31;
            }
            case 9 -> {
                m_name = "september";
                days = 30;
            }
            case 10 -> {
                m_name = "october";
                days = 31;
            }
            case 11 -> {
                m_name = "november";
                days = 31;
            }
            case 12 -> {
                m_name = "december";
                days = 31;
            }
        }
        System.out.print(m_name + " " + year + " has " + days + " days");
    }}