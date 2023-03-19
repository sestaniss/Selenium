package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            //        create an instance of WebDriver
            WebDriver driver = new ChromeDriver();
//        max the window
            driver.manage().window().maximize();
            //goto amazon
            driver.get("http://amazon.com");
            WebElement en = driver.findElement(By.xpath("div[text()='EN']"));
            //action class

            Actions action = new Actions(driver);

            action.moveToElement(en).perform();


        }
    }

