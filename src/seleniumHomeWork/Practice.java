package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.switchTo().frame("iframeResult");
        WebElement f1 =  driver.findElement(By.xpath("//input[@id='field1']"));
        f1.clear();
        f1.sendKeys("Hello Sam");
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
        Actions act=new Actions(driver);
        act.doubleClick(doubleClickBtn).perform();
    }
}
