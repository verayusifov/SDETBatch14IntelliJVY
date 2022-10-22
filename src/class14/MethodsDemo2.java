package class14;

public class MethodsDemo2 {
    void printManyTimes(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java");
        }
    }
    void printCustomWordManyTimes(String word, int times){
        MethodsDemo2 md =new MethodsDemo2();
        md.printCustomWordManyTimes("Syntax Easy",2);
    }

    }

