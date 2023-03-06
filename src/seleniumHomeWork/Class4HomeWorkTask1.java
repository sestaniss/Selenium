package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4HomeWorkTask1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

       WebElement checkBox= driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
       boolean checkSelectedBox= checkBox.isSelected();
        System.out.println("The Box checked is Selected: "+checkSelectedBox);
        if (!checkSelectedBox){
            checkBox.click();
            checkSelectedBox= checkBox.isSelected();
            System.out.println("The Box checked is Selected: "+checkSelectedBox);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
