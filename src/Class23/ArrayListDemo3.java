package Class23;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args){
        ArrayList<Character> chars=new ArrayList<Character>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(12.5f);
        floats.add(13f);
        System.out.println(floats);

    }
}
