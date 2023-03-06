package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntaxproject.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
      WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
      //Check if the radio button is enabled
     boolean  isEnabledMale = maleBtn.isEnabled();
        System.out.println("The radio button Male is enabled "+isEnabledMale);

        // check is the radio button is displayed
        boolean  isDisplayedMale = maleBtn.isDisplayed();
        System.out.println("The radio button Male is Displayed "+isDisplayedMale);

        // check if radio button is selected
        boolean isSelectedmale = maleBtn.isSelected();
        System.out.println("the male button is selected "+isSelectedmale);

        // if the radio button is not selected click on it
        if (!isSelectedmale){
            maleBtn.click();
        }

        // checl is the radio button is selected after the click
       isSelectedmale = maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedmale);

    }
}
