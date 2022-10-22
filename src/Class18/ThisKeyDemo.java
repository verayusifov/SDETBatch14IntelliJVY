package Class18;

public class ThisKeyDemo {
    String str="Red";
    void print(){
        String str="Blue";
        System.out.println(str);
        System.out.println(this.str);
    }
    public static void main(String[] args){
        new ThisKeyDemo().print();
    }
}
