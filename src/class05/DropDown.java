package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
       //  locate the WebElement
        WebElement dropDown = driver.findElement(By.xpath("//select[Aid='select-demo']"));
         // use select class because this drop down has a select tag
        WebElement DropDown = null;
        Select sel=new Select(DropDown);
        // using select class we have different methods to select the desired option
        // Select by index
        sel.selectByIndex(2);

        // select by value
        sel.selectByValue("Tuesday");

        // select by visible text
        sel.selectByVisibleText("Friday");

    }
}
