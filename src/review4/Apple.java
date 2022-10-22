package review4;

public class Apple extends Fruit {
String size;
String taste;
double price;

    Apple(String name, String shape, String color,String size) {
        super(name,shape, color);
        this.size=size;
    }
    Apple(String name, String shape, String color, String taste,double price){
        super(name,shape,color);
        this.taste=taste;
        this.price=price;
    }
    void makeJuice(){
        System.out.println("from "+name+" we can make "+name+" juice");
    }
    //overloading
    void makeJuice(String fruit){
        System.out.println("We can have Juice from "+name+" mixed with orange");
    }
    public static void main(String[] args){

        Apple app=new Apple("apple","circle","red","big");
        System.out.println(app.name);
        System.out.println(app.shape);
        app.grow();
        app.haveBenefits();

app.makeJuice();
    }
}
