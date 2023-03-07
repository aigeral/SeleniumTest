package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");


        driver.manage().window().maximize();
        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //click on sign up button
        //close the pop up
        //close the browser
        //TIP for HW2:
        //just fill in text boxes or button, no need to deal with other webElements


        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Aigerim");
        driver.findElement(By.name("lastname")).sendKeys("Kairbekova");
        driver.findElement(By.name("reg_email_")).sendKeys("676r34634750834");
        driver.findElement(By.name("reg_email_confirmation_")).sendKeys("676r34634750834");
        driver.findElement(By.name("reg_passwd_")).sendKeys("Aa3456789");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_month")).sendKeys("Jun");
        driver.findElement(By.name("birthday_year")).sendKeys("1992");
        driver.findElement(By.name("sex")).click();

        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);
        driver.quit();


    }

}
