package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        //connect to the driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver= new ChromeDriver();

        //goto google.com
        driver.get("https://www.google.com");

        //maximize the window
        driver.manage().window().maximize();

        //full screen
        driver.manage().window().fullscreen();

        //close
        driver.close();
    }
}
