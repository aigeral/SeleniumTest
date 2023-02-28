package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Parabank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        //fill out the form
        //click on register
        //close the browser

        driver.findElement(By.id("customer.firstName")).sendKeys("Aigerim");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kairbekova");
        driver.findElement(By.id("customer.address.street")).sendKeys("Fintas,block2");
        driver.findElement(By.id("customer.address.city")).sendKeys("Kuwait");
        driver.findElement(By.id("customer.address.state")).sendKeys("Kuwait");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("63000");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("63694995");
        driver.findElement(By.id("customer.ssn")).sendKeys("7644800885679");

        driver.findElement(By.id("customer.username")).sendKeys("aigeral");
        driver.findElement(By.id("customer.password")).sendKeys("1234567");
        driver.findElement(By.id("repeatedPassword")).sendKeys("1234567");

        Thread.sleep(3000);

        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);

        driver.quit();




    }
}