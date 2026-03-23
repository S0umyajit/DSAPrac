package org.example;

public class PalinDromeCheckANother {

    public static void main(String[] args) {

        PalinDromeCheckANother a=new PalinDromeCheckANother();
        a.checkPalindrome(2.22);

    }

    public <E>void checkPalindrome(E value){

        String revVal=String.valueOf(value).toLowerCase();

        int left=0;
        int right=revVal.length()-1;

        boolean isPalindrome=true;

        while(left<right){
            if(revVal.charAt(left)!=revVal.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
            if(isPalindrome){
                System.out.println("Palindrome");
            }
        System.out.println("Not Palindrome");


    }
}
