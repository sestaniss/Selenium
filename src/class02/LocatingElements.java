package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
// open up fb.com
        driver.get("https://www.facebook.com/");

        // send in the username

        driver.findElement(By.id("email")).sendKeys("sam");

        //send the password
        driver.findElement(By.name("pass")).sendKeys("abracadabra");

        //click on button create new account

       // driver.findElement(By.linkText("Create new account")).click();

       // click on forgotten password
        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();
    }
}
