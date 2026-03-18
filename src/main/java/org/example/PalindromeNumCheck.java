package org.example;

import java.util.Scanner;

public class PalindromeNumCheck {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
       int n=sc.nextInt();

       int revNum=0;
       int temp=n;

       while(temp>0){
           int remainder=temp%10;
           System.out.println(remainder);
           revNum=(revNum*10)+remainder;
           System.out.println(revNum);
           temp=temp/10;
       }
        System.out.println(revNum);
       if(revNum==n){
           System.out.println("Number is Palindrme");
       }
       else {
           System.out.println("Not Palindrome");
       }
    }
}
