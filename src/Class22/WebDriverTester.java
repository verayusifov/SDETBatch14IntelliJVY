package Class22;

public class WebDriverTester {
    public static void main(String[] args){
       /* Safari safari=new Safari();
        safari.startBrowser();
       safari.test();
       safari.CloseBrowser();

        Chrome chrome=new Chrome();
       chrome.startBrowser();
      chrome.test();
        chrome.CloseBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.CloseBrowser();*/

        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.test();
            browser.CloseBrowser();
        }
        for (int i=0; i<browsers.length;i++){
    browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].CloseBrowser();
        }
}}
