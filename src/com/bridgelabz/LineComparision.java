package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {

    static double length1;
    static double length2;
    static double x1;
    static double x2;
    static double y1;
    static double y2;
    static double x3;
    static double x4;
    static double y3;
    static double y4;

    public void computeTo() {
        System.out.println("Welcome to line comparision Program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1= ");
        x1 = sc.nextDouble();
        System.out.println("Enter the value of x2= ");
        x2 = sc.nextDouble();
        System.out.println("Enter the value of y1= ");
        y1 = sc.nextDouble();
        System.out.println("Enter the value of y2= ");
        y2 = sc.nextDouble();

        System.out.println("Enter the value of x3= ");
        x3 = sc.nextDouble();
        System.out.println("Enter the value of x4= ");
        x4 = sc.nextDouble();
        System.out.println("Enter the value of y3= ");
        y3 = sc.nextDouble();
        System.out.println("Enter the value of y4= ");
        y4 = sc.nextDouble();
        length1 = (Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
        System.out.println("length if Line1 is= " + length1);
        length2 = (Math.sqrt(Math.pow((x4 - x3), 2)) + Math.pow((y4 - y3), 2));
        System.out.println("length if Line2 is= " + length2);
    }


    public void equalsTo() {
        if (length1 == length2) {
            System.out.println("Both lines are equal");

        } else if (length1 > length2) {
            System.out.println("Line 1 is greater than Line 2");

        } else {
            System.out.println("Line 2 is greater than Line 1");
        }

    }


    public static void main(String[] args) {
        LineComparision lc = new LineComparision();
        lc.computeTo();
        lc.equalsTo();
        System.out.println("Try with others values.");
    }
}
