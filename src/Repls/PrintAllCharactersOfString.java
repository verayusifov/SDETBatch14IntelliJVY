package Repls;

import java.util.Scanner;

public class PrintAllCharactersOfString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            System.out.print(a+" ");
        }

    }
}

