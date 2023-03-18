package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;
import java.util.List;

public class tableDynamic {
    public static void main(String[] args) {
        //tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        WebElement username = driver.findElement(By.name("ctl00$MainContent$username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();


        List<WebElement> column = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
//iterate through each to see if it conatins screen saver
        for (int i = 0; i < column.size(); i++) {
//            extract the text
            String text = column.get(i).getText();
            if (text.equalsIgnoreCase("ScreenSaver")) {
                System.out.println(text);
                System.out.println("the screensaver is located at row number "+(i+2));
                System.out.println("check the check box");
            }
        }
    }
}
