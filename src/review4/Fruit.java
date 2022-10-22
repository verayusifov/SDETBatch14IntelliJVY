package review4;

public class Fruit {
    protected String name;
    String shape;
    private String color;


    public Fruit(String name){
        this.name=name;
    }
    Fruit(String name, String shape, String color){
        this (name);
        this.shape=shape;
        this.color=color;
    }
    void grow() {
        System.out.println("Apples grow on trees");
    }
public static void havePeel(){
    System.out.println("All fruit needs to be peeled");
        }
    public void haveBenefits(){
        System.out.println("All fruit is good for your health");
    }
}
