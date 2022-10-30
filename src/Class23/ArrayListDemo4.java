package Class23;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<>();
        names.add("Vera");
        names.add("Anar");
        names.add("Adam");
        names.add("Misa");
        names.set(2,"Anar again");
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
       numbers.add(10);
       numbers.add(15);
       numbers.add(20);
       numbers.add(25);
       numbers.add(1,100);
       System.out.println(numbers);

    }
}
