package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkRelated {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.leafground.com/");

        WebElement NavigationLink=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a"));
        NavigationLink.click();

        WebElement Clicklink1st=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
        Clicklink1st.click();

    }
}
