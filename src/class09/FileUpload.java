package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile= driver.findElement(By.xpath("//input[@id='file-upload']"));
        chooseFile.sendKeys("C:\\Users\\Sam Estaniss\\Desktop\\Test.txt");
    }
}
