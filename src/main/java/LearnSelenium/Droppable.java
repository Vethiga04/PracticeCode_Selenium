package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

    public static  void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement NavigateToDroppable= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[14]/a/img"));
        NavigateToDroppable.click();

        WebElement FromElement= driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]"));
        WebElement ToElement= driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]"));

        Actions actions=new Actions(driver);
        //Method1
        actions.clickAndHold(FromElement).moveToElement(ToElement).release(ToElement).build().perform();

        //Method2
        actions.dragAndDrop(FromElement,ToElement).build().perform();

    }
}
