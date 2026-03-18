package org.example;

public class PalinDromeCheckANother {

    public static void main(String[] args) {

        PalinDromeCheckANother a=new PalinDromeCheckANother();
        a.checkPalindrome("soumya");

    }

    public <E>void checkPalindrome(E value){

        String revVal=String.valueOf(value).toLowerCase();

        int left=0;
        int right=revVal.length()-1;

        while(left<right){
            if(revVal.charAt(left)!=revVal.charAt(right)){
                System.out.println("Not Palindrome");
                break;
            }else {
                System.out.println("Value is Palindrome");
            }
            left++;
            right--;
        }


    }
}
