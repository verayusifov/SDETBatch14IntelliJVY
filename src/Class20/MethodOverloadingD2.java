package Class20;

public class MethodOverloadingD2 {
    private static MethodOveroading md;
    void F1 (String name, int number){
        System.out.println("String name, int number");
    }
    void F1 (String name, int number,int number2){
        System.out.println("String name, int number, int number2");
    }
    void F1 (int num1,int number){
        System.out.println("int 1, int number");
}
void F1(int number, String name){
    System.out.println("int number, String name");
}
public static void main(String[] args){
        MethodOverloadingD2 md=new MethodOverloadingD2();
        md.F1("Vera",20);
}
}
