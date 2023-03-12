package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        //get the dropdown
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(DD);

        sel.deselectByValue("New Jersey");
        sel.selectByVisibleText("Ohio");
        Thread.sleep(3000);

        sel.deselectByValue("New Jersey");
        sel.selectByVisibleText("Ohio");

        System.out.println("The DropDown is Multiple "+sel.isMultiple());
    }
}
