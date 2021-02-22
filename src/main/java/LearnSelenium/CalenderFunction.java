package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderFunction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/Calendar.html");

        WebElement TextFiledClick=driver.findElement(By.xpath("//input[@type='text']"));
        TextFiledClick.click();

        WebElement NextArrowIcon=driver.findElement(By.xpath("//a/span[@class='ui-icon ui-icon-circle-triangle-e']"));
        NextArrowIcon.click();

        WebElement DatePick= driver.findElement(By.xpath("//a[contains(text(),'10')]"));
        DatePick.click();



    }
}
