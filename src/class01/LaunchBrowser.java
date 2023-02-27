package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webdriver is located.

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

      //create an instance of webdrivers
   WebDriver driver = new ChromeDriver();
   // open the website facebook.com
        driver.get("https://www.facebook.com/");

        //get the current url that is there in the browser

        String URL = driver.getCurrentUrl();
        // print out the url
        System.out.println(URL);

        //get the title of the webpage
       String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        //slow down for 3 seconds and why 3000 because it is Milliseconds
        Thread.sleep(3000);

        // close the browser
        driver.quit();

    }
}
