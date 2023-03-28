package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='PIM']")).click();
        List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        boolean idfound = false;
        while (!idfound) {
            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();
                if (id.equalsIgnoreCase("52396A")) {
                    System.out.println(id);
                    System.out.println("Row of the ID is " + i + 1);
                   WebElement checkBox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                   checkBox.click();
                    idfound = true;
                    break;
                }
                //click on the next page
                if (!idfound) {
                    WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                    nextBtn.click();


                }

            }
        }
    }
}
