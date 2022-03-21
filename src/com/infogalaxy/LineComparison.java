package com.infogalaxy;

import java.util.Scanner;

public class LineComparison {
    public static void equals(double lengthofline1, double lengthofline2) {
        if (lengthofline1 == lengthofline2) {
            System.out.println("Both Lines are Same. ");
        } else {
            System.out.println("Lines are Not Same. ");
        }
    }
    public static void main (String args[]) {
        // Displaying Welcome Line To User:
        System.out.println("Welcome to Line Comparison Problem Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        //UC-1 Calculating Length of Line 1:
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double lengthofline1 = 0;
        //UC-2 Calculating Length of Line 2:
        double a1 ;
        double a2 ;
        double b1 ;
        double b2 ;
        double lengthofline2=0;

        System.out.println("Enter the X1 Co-ordinates:");
        x1 = sc.nextDouble();
        System.out.println("Enter the X2 Co-ordinates:");
        x2 = sc.nextDouble();
        System.out.println("Enter the Y1 Co-ordinates:");
        y1 = sc.nextDouble();
        System.out.println("Enter the Y2 Co-ordinates:");
        y2 = sc.nextDouble();
        lengthofline1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line is"+ lengthofline1);


        System.out.println("Enter the A1 Co-ordinates:");
        a1 = sc.nextDouble();
        System.out.println("Enter the A2 Co-ordinates:");
        a2 = sc.nextDouble();
        System.out.println("Enter the B1 Co-ordinates:");
        b1 = sc.nextDouble();
        System.out.println("Enter the B2 Co-ordinates:");
        b2 = sc.nextDouble();

        lengthofline2 = Math.sqrt(Math.pow((a2 - a1) , 2) + Math.pow((b2 - b1) , 2));
        System.out.println("Length of Line 2 : " +lengthofline2);

        equals(lengthofline1,lengthofline2);



    }
}
