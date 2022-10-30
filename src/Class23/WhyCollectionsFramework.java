package Class23;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args){
String[] name={"Vera","Jan","Adam","Anar","Misa"};
String[] breeds=new String[10];
breeds[0]="Bulldog";
System.out.println(Arrays.toString(breeds));
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors);
    }
}
