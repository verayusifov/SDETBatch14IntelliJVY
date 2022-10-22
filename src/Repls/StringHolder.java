package Repls;

public class StringHolder {

        public static void main(String[] args) {


            System.out.println(alphabetical("hello"));
            System.out.println(alphabetical("software"));
            System.out.println(alphabetical("language"));

        }

        static String alphabetical  (String a){

            String holder=""+a.charAt(0);
            for(int i =1;i<a.length();i++){

                if(a.charAt(i-1)<a.charAt(i)){
                    holder+=a.charAt(i);
                }

            }
            return holder;

        }
    }

