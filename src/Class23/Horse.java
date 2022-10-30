package Class23;

public class Horse {
/*create a horse class, have 5 fields of your choice
create constructor and getter setter methods for his class. Write at least one
condition inside setter class
 */
    private String name;
    private String breed;
    private int age;
    private double weight;
    private double height;

    public Horse(String name, String breed, int age, double weight, double height) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Please enter name");
        } else {
            this.name = name;
        }
    }
    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("Please enter breed");
        } else {
            this.breed = breed;
        }
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0&&age>20){
            System.out.println("Please enter correct age");
        }else{
        this.age = age;
    }}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight+" height "+height);
    }
}
class TestHorse{
    public static void main(String[] args) {
        Horse brad = new Horse("Brad", "Arabian", 5, 90,89);
        brad.printInfo();
//System.out.println(tommy.name);
        System.out.println(brad.getName());
        System.out.println(brad.getBreed());
        System.out.println(brad.getAge());
    }}