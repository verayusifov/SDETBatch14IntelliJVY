package review4;

public class Banana extends Fruit{
    String origin;
    Banana(String name, String shape, String color, String origin) {
        super(name, shape, color);
        this.origin=origin;
    }
    void makeSmoothie(){
        System.out.println("From "+name+" we get tasty smoothie");
    }
    void grow(){
        System.out.println(name+" grows on palm trees");
    }
    public static void havePeel(){
        System.out.println("Banana is very easy to peel");
    }
    public static void main(String[] args){
        Banana ban=new Banana("banana","banana shape", "yellow","Equador");
        ban.haveBenefits();
        ban.makeSmoothie();
        ban.grow();
        Banana.havePeel();

        Fruit fruit=new Banana("banana","banana shape","yellow","Africa");
        fruit.grow();
        fruit.haveBenefits();
    }
}
