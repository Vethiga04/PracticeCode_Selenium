package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LinkRelatedRemain20 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/Link.html");

        WebElement WheretoGo= driver.findElement(By.partialLinkText("supposed to go without"));
        String s= WheretoGo.getAttribute("href");
        System.out.println("Link is navigated to: "+s);

        Actions actions=new Actions(driver);
        WebElement brokenURL=driver.findElement(By.linkText("Verify am I broken?"));
        actions.click(brokenURL).build().perform();

//        String title=
        if(driver.getTitle().contains("404")){
            System.out.println("Link is broken");
        }

        if(driver.getCurrentUrl().contains("error")){
            System.out.println("Link is broken");
        }

        driver.navigate().back();
        List<WebElement> total=driver.findElements(By.tagName("a"));
        System.out.println(total.size());


    }
}
