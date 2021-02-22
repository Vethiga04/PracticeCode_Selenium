package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButonGetPosition {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement buttonclick=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
        buttonclick.click();

        WebElement getposition=driver.findElement(By.xpath("//*[@id=\"position\"]"));
        Point xypoint=getposition.getLocation();
        int X=xypoint.getX();
        int Y=xypoint.getY();
        System.out.println("X-axis value is: "+X+"\nY-axis value is: "+Y);


    }
}
