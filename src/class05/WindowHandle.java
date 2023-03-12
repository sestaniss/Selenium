package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1409567013%3A1678243099833037&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfBT01cQB8_eyv1NU6H53y32xh63kKWhruqgz5CWgch5fn2CIq2KdxfWKnXd2QghEvw7WAq3A");

        driver.findElement(By.xpath("//a[text()='Help'])")).click();
        driver.findElement(By.xpath("//a[text()='Privacy'])")).click();
        driver.getWindowHandle();

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

      Set<String> windowHandles = driver.getWindowHandles();

      for (String wh:windowHandles){
         driver.switchTo().window(wh);

        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Google Account Help")){
            break;
          }
      }
        System.out.println(driver.getTitle());

      driver.switchTo().window(parentWindowHandle);
    }
}
