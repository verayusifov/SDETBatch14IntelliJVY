package Class22;

public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use the break to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("Push the start button to start me");
    }
    void stop(){
        super.stop();
        System.out.println("You can also use auto-breaking feature to stop me");
}
    }
class Toyota extends Car{
    void start(){
        System.out.println("Push me to start");
    }
}
class Tesla{
    void start(){
        System.out.println("Use the app to start me");
    }
    void stop(){
        System.out.println("Use AI and AutoBreaking to stop me");
    }
    void park(){
        System.out.println("I can auto-park myself");
    }}

