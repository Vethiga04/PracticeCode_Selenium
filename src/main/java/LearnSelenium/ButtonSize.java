package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonSize {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement buttonclick=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
        buttonclick.click();

        WebElement SizeRetrieve=driver.findElement(By.xpath("//*[@id=\"size\"]"));
        int height=SizeRetrieve.getSize().getHeight();
        int width=SizeRetrieve.getSize().getWidth();
        System.out.println("Height: "+height+"\nWidth: "+width);

        //Another way to retrieve the size
       /*
       WebElement SizeRetrieve=driver.findElement(By.xpath("//*[@id=\"size\"]"));
        Dimension size=SizeRetrieve.getSize();
        int height=size.getHeight();
        int width=size.getWidth();
        System.out.println("Height: "+height+"\nWidth: "+width);
        */

    }
}
