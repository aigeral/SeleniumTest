package HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        //use xpath to complete this
        //        enter the message in the text box
        //        click on show message
        //        Enter value of a
        //        Enter value of B
        //        click on the button get total
        //        also please print the value of the attribute type of the button GET TOTAL
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter your')]")).sendKeys("Have a great day");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();

        WebElement valueA=driver.findElement(By.xpath("//input[@id='sum1']"));
        valueA.sendKeys("7");
        WebElement valueB=driver.findElement(By.xpath("//input[@id='sum2']"));
        valueB.sendKeys("9");

        WebElement total =driver.findElement(By.xpath("//button[text()='Get Total']"));
        Thread.sleep(3000);
        total.click();
        WebElement sum= driver.findElement(By.xpath("//span[@id='displayvalue']"));

        System.out.println(sum.getText());



    }
}
