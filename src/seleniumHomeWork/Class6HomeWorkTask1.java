package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class6HomeWorkTask1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("//div[@id='finish']")).click();

       WebElement text= driver.findElement(By.xpath("//h4[text()='Hello World!']"));
       Boolean displayedText=text.isDisplayed();
        System.out.println("The text displayed on the page is Hello World! "+displayedText);
    }
}
