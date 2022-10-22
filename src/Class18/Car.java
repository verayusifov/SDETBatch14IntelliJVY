package Class18;

public class Car{
    String model;
    String make;
    String color;
    int year;
    int topSpeed;
    double price;
    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" color "+color);
    }
}
class BMW extends Car {
    double engineCC;
}
class Tesla extends Car{
}
class Toyota extends Car{
    double engineCC;
}
class CarTester{
    public static void main(String[] args){
    BMW bmw=new BMW();
    bmw.make="BMW";
    bmw.model="x5M";
    bmw.color="black";
    bmw.price=90000;
    bmw.engineCC=500;
    bmw.printCarDetails();
}}