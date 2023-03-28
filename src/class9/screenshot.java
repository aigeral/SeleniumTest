package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //        password field
        //take a screenshot
        TakesScreenshot ss=(TakesScreenshot) driver;
        //take the screenshot
        File sourceFile=ss.getScreenshotAs(OutputType.FILE);
        System.out.println(sourceFile);
        //save the file in computer
       FileUtils.copyFile(sourceFile,new File("/Users/aigerim/IdeaProjects/SeleniumTest/ss/abc.png"));


    }
}
