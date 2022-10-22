package Class15;

public class Task3 {
    void printPalindrome(String str){
        str=str.toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("The String is not Palindrome");
        }
    }
    public static void main(String[] args){
        Task3 task=new Task3();
        task.printPalindrome("Dad");
        task.printPalindrome("Thor");
    }

}
