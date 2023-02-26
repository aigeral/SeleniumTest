package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.security.auth.login.LoginContext;

public class WebOrderTask2 {
    public static void main(String[] args) {
        //Task
        //navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
        //Login
        //Get title and verify
        //logout
        //close the browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize it
        driver.manage().window().maximize();
        //username
       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       //password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click on login
        driver.findElement(By.className("button")).click();
        //verify that the title is "web orders"
        String title=driver.getTitle();
       // System.out.println(title);
        if(title.equalsIgnoreCase("Web orders")){
            System.out.println("the title is correct");
        }else {
            System.out.println("the rtitle is not correct");
        }
        driver.findElement(By.linkText("Logout")).click();
        //close the browser
        driver.quit();



    }
}
