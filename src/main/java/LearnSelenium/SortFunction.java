package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class SortFunction {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/sortable.html");


        for(int a=0;a<=5;a++){
            List<WebElement> Items=driver.findElements(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));

               WebElement FromElement=Items.get(6);
               WebElement ToElement=Items.get(a);

               Actions actions=new Actions(driver);
               actions.clickAndHold(FromElement).moveToElement(ToElement).release(ToElement).build().perform();


        }

    }
}
