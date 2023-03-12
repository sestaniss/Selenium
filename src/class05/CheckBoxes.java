package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        // get all the checkboxes
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        // iterate through the list
        for (int i = 0; i < checkboxes.size(); i++) {
            String value=checkboxes.get(i).getAttribute("value");
            // check if this is rhe desired one
            // if yes click it
            // if no continue to iterate
            if(value.equalsIgnoreCase("Option-2")){
                checkboxes.get(i).click();
            }
        }
    }

}
