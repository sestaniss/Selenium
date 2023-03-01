package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Please enter')]")).sendKeys("Hello Selenium");
        driver.findElement(By.xpath("//button[contains(@onclick,'showInput')]")).click();

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("88");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("92");
       WebElement total= driver.findElement(By.xpath("//button[text()='Get Total']"));
        total.click();
        WebElement display=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        String value=display.getText();
        System.out.println("total a+b= "+value);
    }
}
