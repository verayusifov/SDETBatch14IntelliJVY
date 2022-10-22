package Class15;

public class Dog {
    String name;
    static int noOfLegs=4;
    String color;
    void bark(){
        int i=10;//local variable
        for (int j=0;j<i;j++){
            //int j is also local variable
            System.out.println("Barking.....");
        }}
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.bark();

    }
}
