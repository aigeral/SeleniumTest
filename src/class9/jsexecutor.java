package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsexecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");

                WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid black'", userName);
        //click the login button

        js.executeScript("arguments[0].style.border='5px dotted blue'",userName);


//        find the WebElement
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        click the login button
        js.executeScript("arguments[0].click();",loginBtn);


    }
}


