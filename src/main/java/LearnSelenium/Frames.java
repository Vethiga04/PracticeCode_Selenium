package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class Frames {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement ClickonFrames=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[10]/a/img"));
        ClickonFrames.click();

        driver.switchTo().frame(0);
        WebElement ClickOn1stButton=driver.findElement(By.xpath("/html/body/button"));
        ClickOn1stButton.click();

        String value=ClickOn1stButton.getText();
        System.out.println(value);

        driver.switchTo().defaultContent(); //defaultcontent is used only in frames
        driver.switchTo().frame(1).switchTo().frame(0);
        WebElement ClickOn2ndButton= driver.findElement(By.xpath("/html/body/button"));
        ClickOn2ndButton.click();

        driver.switchTo().defaultContent();
        List<WebElement> framestotal=driver.findElements(By.tagName("iframe"));
        int size=framestotal.size();

        System.out.println("Frame count is: "+size);
        }
    }
