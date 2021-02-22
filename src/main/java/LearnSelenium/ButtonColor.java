package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonColor {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement buttonclick=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
        buttonclick.click();

        WebElement Buttoncolorvisible=driver.findElement(By.xpath("//*[@id=\"color\"]"));
        String color=Buttoncolorvisible.getCssValue("background-color");
        System.out.println(color);
    }
}
