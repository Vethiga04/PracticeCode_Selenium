package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class OpenDriver {

    public static void main(String[] args){
        //Initialize chromedriver
        WebDriver driver=new ChromeDriver();

        //navigate to google chrome
        driver.get("https://www.google.com/");

        //search for element
        WebElement searchelement=driver.findElement(By.name("q"));
        searchelement.sendKeys("Selenium"+Keys.ENTER);

        driver.findElement(By.className("wp-categories-icon svg-image")).click();



    }
}
