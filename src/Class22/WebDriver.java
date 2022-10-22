package Class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void test(){
        System.out.println("Perform testing");
}
    public void CloseBrowser() {
        System.out.println("Close Browser");
    }}
class  Chrome extends WebDriver{
public void startBrowser(){
        System.out.println("Starting Google Chrome");
        }
public void test(){
        System.out.println("Perform testing on Google Chrome");
        }
public void CloseBrowser() {
        System.out.println("Close Google Chrome Browser");
        }}
class  FireFox extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting FireFox");
    }
    public void test(){
        System.out.println("Perform testing on Firefox");
    }
    public void CloseBrowser() {
        System.out.println("Close Firefox Browser");
    }}
   class Safari extends WebDriver{
public void startBrowser(){
        System.out.println("Starting Safari");
        }
public void test(){
        System.out.println("Perform testing on Safari");
        }
public void CloseBrowser() {
        System.out.println("Close Safari Browser");
        }}