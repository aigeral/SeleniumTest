package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delta.com");
        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();
        //1st - Get the month from the calendar.
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        //2nd - Get the next button.
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
        //3rd - Click on next button until we find the right month.
        boolean isFound = false;
        while (!isFound) {
            String month_ = month.getText();
            if (month_.equalsIgnoreCase("January")) {
                //4th - Select the day.
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String day_text = day.getText();
                    if(day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }
            } else {
                // Else block of code is for if it did not find the right month.
                next.click();
            }
        }

    }
}

