package Class23;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);
    }
}
