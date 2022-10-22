package Class21;

public class Animal {
    String name;
    String color;
    String breed;

    void sleep(){
        System.out.println("Animals usually sleep 12 hours");
    }
    void eat(){
        System.out.println("Grass and meat");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("Animals usually sleep 14 hours");
    }
    void eat(){
        System.out.println("I only like fish");
}}
class Dog extends Animal{
        void sleep(){
      System.out.println("Animals usually sleep 16 hours");
}
    void eat() {
        System.out.println("I only like meat");
    }}