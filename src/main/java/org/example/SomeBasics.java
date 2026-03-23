package org.example;

import java.util.Scanner;

public class SomeBasics {
    public static void main(String[] args) {
        //Area of a triangle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of triangle: ");
        float base=sc.nextFloat();
        System.out.println("Enter height of a triangle ");
        float height=sc.nextFloat();

        float area= (float) ((1.0/2.0)*(base*height));

        System.out.println("Area of a triangle: "+area);
    }
}
