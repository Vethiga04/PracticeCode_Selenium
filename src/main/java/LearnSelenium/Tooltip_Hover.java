package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip_Hover {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/tooltip.html");

        WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/p/input"));
        String tooltiptext= name.getAttribute("title");
        System.out.println("Tooltip contained text is: "+tooltiptext);
    }
}
