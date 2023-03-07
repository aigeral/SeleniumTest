package hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
           //goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
          //check if the check box    "click on this check box" is Selected
         //if no  Select the check box
        //check gain if the checkbox is Selected or not
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement checkBox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));

        boolean isSelected = checkBox.isSelected();

        System.out.println("The check button "+ isSelected);


        if(!isSelected) {
            checkBox.click();
        }
        Thread.sleep(2000);

        isSelected = checkBox.isSelected();

        System.out.println("the status of selection is "+ isSelected);
        driver.quit();
    }
}








