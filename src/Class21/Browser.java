package Class21;

public class Browser {
    void openBrowser() {
        System.out.println("Opening a browser");
    }

    void navigate() {
        System.out.println("Opening the url");
    }

    void test() {
        System.out.println("Opening the webpage");
    }

    void closeBrowser() {
        System.out.println("Closing the webpage");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser in less than 1 sec");
    }
}
class FireFox extends Browser{

     void openBrowser(){
        System.out.println("Opening the browser in less than 2 sec");
    }
}