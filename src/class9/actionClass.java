package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.amazon.com");
        driver.findElement(By.xpath("//div[text()='EN']"));
        //action class
       // Actions action=new Actions(driver);
        //action.moveToElement(EN).perform();
    }
}
