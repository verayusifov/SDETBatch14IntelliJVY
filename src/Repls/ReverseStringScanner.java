package Repls;

import java.util.Scanner;

public class ReverseStringScanner {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String s = inp.nextLine();
            //write your code below
            char[] ch=s.toCharArray();

            int j=ch.length;
            for(int i=j;i>0;i--)
            {
                System.out.print(ch[i-1]);
            }
        }
    }

