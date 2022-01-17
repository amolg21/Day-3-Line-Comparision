package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {

    static public void computeTo() {
        System.out.println("Welcome to line comparision Program");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1= ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of x1= ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of x2= ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of y1= ");
        double y2 = sc.nextDouble();
        System.out.println("Enter the value of y2= ");
        double length = (Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2));

    }
    public static void main(String[] args) {

    }
}
