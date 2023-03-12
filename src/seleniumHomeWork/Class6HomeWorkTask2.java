package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class6HomeWorkTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement f=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(f);
        WebElement text=driver.findElement(By.xpath("//body[@id='tinymce']"));
        text.clear();
        text.sendKeys("Hello World!");
        driver.switchTo().defaultContent();

    }
}
