package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2HomeWork02 {
    /*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser

        TIP for HW2: just fill in text boxes or button, no need to deal with other webElements
        also u will need a Thread.sleep after clicking on create new account (we will discuss "WHY" in future)
         */
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Sam");
        driver.findElement(By.name("lastname")).sendKeys("Nickou");
        driver.findElement(By.name("reg_email__")).sendKeys("554-445-5548");
        driver.findElement(By.name("reg_passwd__")).sendKeys("121212121212222");
        driver.findElement(By.id("month")).sendKeys("December");
        driver.findElement(By.id("day")).sendKeys("16");
        driver.findElement(By.id("year")).sendKeys("1999");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.id("u_b_9_xA")).click();
        Thread.sleep(4000);
        driver.quit();



}
}
