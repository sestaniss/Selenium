package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calender {
    public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // got to syntax HRMS application and login and go to the pim option
        driver.get("https://www.delta.com/");
        //click on the calender
        WebElement calender = driver.findElement(By.xpath("//span[text()='Depart']"));
        calender.click();

        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        //get the next button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

        //click on next button until you find the right month
        boolean isFound=false;
        while (!isFound) {

            String month_ = month.getText();
            if (month_.equalsIgnoreCase("December")) {
                //select the day
            List<WebElement> days =  driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                    for(WebElement day:days){
                        String day_text = day.getText();
                        if (day_text.equalsIgnoreCase("20")){
                            day.click();
                            isFound=true;
                            break;
                        }
                    }

            } else {
                next.click();
            }
        }

        }
    }

