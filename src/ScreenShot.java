import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // got to syntax HRMS application and login and go to the pim option
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //        password field

        //take screenshot
        TakesScreenshot ss= (TakesScreenshot) driver;
        //take the screenshot as file
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        //save the files in computer
        FileUtils.copyFile(sourceFile, new File("C:/Users/Sam Estaniss/IdeaProjects/Seleinum/src/screenshot/abc.png"));
    }
}
