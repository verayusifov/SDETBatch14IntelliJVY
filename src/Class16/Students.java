package Class16;

public class Students {
    //create class Students with 3 variables - Name, ID and Number of Students
    // Set value of studentName, studentID and increment the numberOfStudents for each object
    //each object.Prnt out total number fo students
    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args){
        Students roman=new Students();
        roman.id="1";
        roman.name="Roman";
        Students.numberOfStudent++;

            Students sonamKapor=new Students();
            sonamKapor.id="2";
            sonamKapor.name="Sonam";
            Students.numberOfStudent++;

        System.out.println(numberOfStudent);

    }
}
