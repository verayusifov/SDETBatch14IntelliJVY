package Class18;

public class Horse extends Animal{
    private String name;
   private String breed;
    private int age;
    private double weight;

            public Horse(String name,String breed, int age, double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
       this.weight=weight;
            }
            void printInfo(){
        System.out.println(" name:"+name+" Breed:"+breed+" age:"+age+" Weight:"+weight);
            }
            public static void main(String[] args){
        Horse horseObject=new Horse("Spirit","Stallion",20,400);
        horseObject.printInfo();
            }
}
