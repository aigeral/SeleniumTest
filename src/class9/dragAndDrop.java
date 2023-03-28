package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class dragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/%22");

        driver.switchTo().frame(0);
        //get the element which u want to drag


        WebElement draggable=driver.findElement(By.id("draggable"));
        //get the draggable element

        WebElement dropable=driver.findElement(By.id("droppable"));

        //action class
       Actions action= new Actions(driver);
        action.dragAndDrop(draggable,dropable).perform();

    }
}



