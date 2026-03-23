package org.example;

import java.util.Scanner;

public class QuadraticEq {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println();
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();

        double root1=(-b+(Math.sqrt((b*b)-(4*a*c))))/2*a;
        System.out.println("root1: "+root1);
        double root2=(-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("root2: "+root2);
    }
}
