package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement maleBTn = driver.findElement(By.cssSelector("input[value='Male']"));

        boolean isEnabledMale = maleBTn.isEnabled();
        System.out.println("the radio button male is enabled " + isEnabledMale);

        boolean isDisplayedName = maleBTn.isDisplayed();
        System.out.println(isDisplayedName);

        boolean isSelectedmale = maleBTn.isSelected();
        System.out.println("the male button is selected " + isSelectedmale);
        //if the radio button is not selected click on it
        if (isSelectedmale) {
            maleBTn.click();
        }
        //check if the radio button is selected after the click

        isSelectedmale = maleBTn.isSelected();
        System.out.println("the status of selection is " + isSelectedmale);
    }
}
