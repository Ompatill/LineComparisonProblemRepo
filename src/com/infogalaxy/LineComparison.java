package com.infogalaxy;

import java.util.Scanner;

public class LineComparison {
    public static void main (String args[]) {
        // Displaying Welcome Line To User:
        System.out.println("Welcome to Line Comparison Problem Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double length = 0;
        System.out.println("Enter the X1 Co-ordinates:");
        x1 = sc.nextDouble();
        System.out.println("Enter the X2 Co-ordinates:");
        x2 = sc.nextDouble();
        System.out.println("Enter the Y1 Co-ordinates:");
        y1 = sc.nextDouble();
        System.out.println("Enter the Y2 Co-ordinates:");
        y2 = sc.nextDouble();

        length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line is:3"+ length);



    }
}
