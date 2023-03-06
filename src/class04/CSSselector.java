package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to facebook.com
        driver.get("https://www.facebook.com/");
      WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']\n"));

      //click on the button
        createNewBtn.click();

        //sleep
        Thread.sleep(2000);

        //fill in firstname
     WebElement  firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
     firstName.sendKeys("AbraCadabra");
    }
}
