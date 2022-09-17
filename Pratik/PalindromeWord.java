package Pratik;

import java.util.Scanner;

public class PalindromeWord {

    static boolean isPalindrom(String word)
    {
        String str = "";
        for (int i = word.length()-1; i >= 0; i--) {
            str += word.charAt(i);
        }
        if(word.equals(str))
        {
            System.out.println("The word is a palindromic word.");
            return true;
        }
        else{
            System.out.println("The word is not a palindromic word.");
            return false;
        }
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word;

        while(true){
            System.out.println("Enter a word :");
            word = input.nextLine();
            System.out.println(isPalindrom(word));
        }

    }
}
