package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {

   static double length1;
    static double length2;
    static double x1;
    static double x2;
    static double y1;
    static double y2;
    static public void computeTo() {
        System.out.println("Welcome to line comparision Program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1= ");
        x1 = sc.nextDouble();
        System.out.println("Enter the value of x1= ");
        x2 = sc.nextDouble();
        System.out.println("Enter the value of x2= ");
        y1 = sc.nextDouble();
        System.out.println("Enter the value of y1= ");
        y2 = sc.nextDouble();
        System.out.println("Enter the value of y2= ");
        length1 = (Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2));
        length2 = (Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2));
    }


    static public void equalsTo() {
        if (length1==length2) {
            System.out.println("Both lines are equal");

        }  else if (length1>length2) {
            System.out.println("Line 1 is greater than Line 2");

        } else {
            System.out.println("Line 2 is greater than Line 1");
        }

    }


    public static void main(String[] args) {
        double lenght1, lenth2;
    }
}
