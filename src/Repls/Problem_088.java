package Repls;


/*
Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and
following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes
and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */
public class Problem_088 {
    String breed, name, color;
    public static void main(String[] args) {
        Problem_088 b = new Problem_088();
        b.breed = "Bulldog";
        Problem_088 l = new Problem_088();
        l.breed = "Labrador";
        Problem_088 h = new Problem_088();
        h.breed = "Husky";
        h.bark();
        h.run();
        h.play();
        b.bark();
        b.run();
        b.play();
        l.bark();
        l.run();
        l.play();
    }
    void bark() {
        System.out.println(breed + " can bark");
    }
    void run() {
        System.out.println(breed + " can run");
    }
    void play() {
        System.out.println(breed + " can play");
    }
}
