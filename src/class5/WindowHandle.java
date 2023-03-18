package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S973739284%3A1678243155984235&continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dgo-to-account-button&ifkv=AWnogHcHKTyyY4plVa4AzUOszfiNeLFiTujogmUDKR7_kbrB9P3YaPwSfB380N9mwx7V47M7zF9kig&service=accountsettings&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.findElement(By.xpath("//a[@class='NUwdAb TrZEUc'][1]")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
  // get the window handle of the parent window
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);


// get window handles of all the windows that have been opened up
       Set<String> windowHandles = driver.getWindowHandles();
       // print all the window handles
       for(String wh:windowHandles) {
           driver.switchTo().window(wh);

           String title = driver.getTitle();
           if (title.equalsIgnoreCase("Privacy Policy - Privacy & Terms - Google")) {
               break;
           }
       }
       //to verify we switched to the right window;
        System.out.println(driver.getTitle());
               driver.switchTo().window(parentWindowHandle);
           }
       }



