package org.example;

import java.util.Scanner;

public class AreaOfAtriangleThreeGivenSides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data for three sides: ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float s=(a+b+c)/2;
        System.out.println("Semi Perimeter: "+s);
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+ area);
    }
}
