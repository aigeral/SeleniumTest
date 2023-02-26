package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {
        //connect to the webdriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //create an instance of a webDriver
        WebDriver driver=new ChromeDriver();
        //go to google
        driver.get("https://www.google.com/");
        //Class1.maximize the window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
    }
}
