package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //find the username

        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");
        //find the password
        driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("test");

        //clear the username text box using method clear()

        username.clear();

        //clear the password

       // to get the text username which is beside test box

        WebElement usernameText= driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        //get the text password which is beside the password  text box
         WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
         String PassText=passwordText.getText();
        System.out.println(PassText);

    }
}
