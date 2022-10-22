package Class22;

public class Animal {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals usually sleep 8-10 hours");
    }
}
class Panda extends Animal{
    void eat(){
        System.out.println("Pandas eat bamboos");
    }
    @Override
    void sleep(){
        System.out.println("Panda's sleep 14 hours");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cats like to eat Fish");
    }
}
