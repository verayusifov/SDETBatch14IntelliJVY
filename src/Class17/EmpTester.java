package Class17;

import java.util.Scanner;

public class EmpTester {
    public static void main(String[] args){
        Employee josh=new Employee("Josh","IT",120000,25);
        josh.printSalary();
        josh.calculatePrintTax();

        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Str");
        String str=new String("value");
    }
}
