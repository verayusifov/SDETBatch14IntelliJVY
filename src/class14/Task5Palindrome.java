package class14;

public class Task5Palindrome {
    public static void main(String[] args){
        //
        String str="abc";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The String is Palindrome");
        }else{
            System.out.println("The String is not Palindrome");
        }
        }
    }

