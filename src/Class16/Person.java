package Class16;

public class Person {
    private String password="Pass123";
    double salary=1000;
    public String name="Roman";

    public static void main(String[] args){
       Person person1=new Person();
       System.out.println(person1.password);
        System.out.println(person1.salary);
    }
}
