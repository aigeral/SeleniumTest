package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
  // initiate the instanse of Webdriver

        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://www.google.com/");
        //slow down
        Thread.sleep(2000);
        // now navigate to fb.com
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        // go back

        driver.navigate().back();
        Thread.sleep(2000);
        // go to facebook
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();
        // close the browser
        driver.close();
    }
}
