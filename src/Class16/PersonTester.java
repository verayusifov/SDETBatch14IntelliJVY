package Class16;

public class PersonTester {

    public static void main(String[] args){
        Person person=new Person();
      //  System.out.println(person.password);
        //doesn't print because password is private
        System.out.println(person.salary); //can be accessed within same package
        System.out.println(person.name);
    }}
