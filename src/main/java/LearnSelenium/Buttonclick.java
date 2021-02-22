package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Buttonclick {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        //Navigate to button related page
        WebElement ButtonClick= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
        ButtonClick.click();

        WebElement buttonclick1st= driver.findElement(By.xpath("//*[@id=\"home\"]"));
        buttonclick1st.click();

        driver.get("http://www.leafground.com/pages/Button.html");
        WebElement Getposition= driver.findElement(By.xpath("//*[@id=\"position\"]"));
        Point xypoint=Getposition.getLocation();
        double x=xypoint.getX();
        double y=xypoint.getY();

        System.out.println("X axis value is: "+x+"\nY axis value is: "+y);

    }
}
