package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class4HomeWorkTask2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

      List <WebElement> checkBoxes= driver.findElements(By.cssSelector("input[class='cb1-element']"));
      for (WebElement checkBox:checkBoxes){
          String option=checkBox.getAttribute("value");
          if (option.equalsIgnoreCase("Option-2")){
              checkBox.click();
          }
      }
        Thread.sleep(3000);
        driver.close();
    }
    }

