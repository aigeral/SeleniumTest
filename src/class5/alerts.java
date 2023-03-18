package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        //click on the button for simple prompt alert

        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        // use switch to

        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        // click on the prompt alert button
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        alert.sendKeys("jfherjbgelrj");
        alert.accept();



    }
}
