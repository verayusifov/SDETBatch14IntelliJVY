package Class23;

public class Dog {
    private String name;
    private String breed;
   private int age;
   private double weight;
    public Dog(String name, String breed, int age, double weight) {
   setName(name);
   setBreed(breed);
   setAge(age);
   setWeight(weight);
    }
void setName(String name){
        if(name.length()>30){
    System.out.println("Name can not be more than 30 characters");
}else if(name.isEmpty()){
    System.out.println("Name can not be empty, please try again");
}else {
            this.name = name;
        }}
    void setBreed(String breed){
        if(breed.length()>30){
            System.out.println("Breed can not be more than 30 characters");
        }else if(breed.isEmpty()){
            System.out.println("Breed can not be empty, please try again");
        }else {
            this.breed = breed;
        }
}
void setAge(int age){
        if(age >20){
            System.out.println("Are you sure it's a proper dog?");
        }else if(age <0){
            System.out.println("Age can not be negative");
        }else{
            this.age= age;
        }
}
void setWeight (double weight){
    if(weight >100){
        System.out.println("Your dog needs to lose weight?");
    }else if(weight <0){
        System.out.println("Weight can not be negative");
    }else {
        this.weight = weight;
    }
}
String GetName(){
        return name;
}
String getBreed(){
        return breed;
}
int getAge(){
        return age;
}
double getWeight(){
        return weight;
}
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);
    }
}
class Test{
    public static void main(String[] args){
        Dog tommy=new Dog("Tommy", "German Shepard" , 15, 20);
tommy.printInfo();
//System.out.println(tommy.name);
System.out.println(tommy.GetName());
        System.out.println(tommy.getBreed());
        System.out.println(tommy.getAge());
        System.out.println(tommy.getWeight());
    }
}