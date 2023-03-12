package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

        driver.switchTo().alert();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

        alert.sendKeys("Shazam");
        alert.accept();

    }
}
