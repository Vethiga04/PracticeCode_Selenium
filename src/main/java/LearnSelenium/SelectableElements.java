package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectableElements {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/selectable.html");

        List<WebElement> Values = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/ol/li"));
        System.out.println(Values.size());


        Actions action=new Actions(driver);
        action.keyDown(Keys.CONTROL).click(Values.get(0)).
                click(Values.get(1)).click(Values.get(2)).build().perform();



    }
}
