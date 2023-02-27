package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Sam");
        driver.findElement(By.id("customer.lastName")).sendKeys("E");
        driver.findElement(By.name("customer.address.street")).sendKeys("222 street");
        driver.findElement(By.name("customer.address.city")).sendKeys("Austin");
        driver.findElement(By.name("customer.address.state")).sendKeys("Tx");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("77858");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("555-454-8844");
        driver.findElement(By.id("customer.ssn")).sendKeys("222-222-242");
        driver.findElement(By.name("customer.username")).sendKeys("Sam E");
        driver.findElement(By.id("customer.password")).sendKeys("112244882244");
        driver.findElement(By.id("repeatedPassword")).sendKeys("112244882244");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
