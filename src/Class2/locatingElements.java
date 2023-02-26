package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        // tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        //open up fb.com
        driver.get("https://www.facebook.com/");
        //send  int the username
        driver.findElement(By.id("email")).sendKeys("moazzam");
        //send the password
        driver.findElement(By.name("pass")).sendKeys("Abracadabra");
        // click on the button create a new account
       // driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password?")).click();
        driver.quit();
    }
}
