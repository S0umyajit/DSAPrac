package org.example;

import java.util.Scanner;

public class CuboidEx {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int height=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println("Area of Cuboid ");
        int area=2*((length*height)+(length*breadth)+(breadth*height));
        System.out.println(area);
        System.out.println("Volume: ");
        int volume=length*height*breadth;
        System.out.println(volume);


    }
}
