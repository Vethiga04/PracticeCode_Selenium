package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsRelated {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement NavigationWindows=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[11]/a/img"));
        NavigationWindows.click();

        //Current window identification
        String OldWindow=driver.getWindowHandle();

        WebElement Click1stFunction= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
        Click1stFunction.click();

        //after click, indicates how many windows are opened(included old and new windows)
        Set<String> handles=driver.getWindowHandles();

        for (String NewWindow:handles) {
            driver.switchTo().window(NewWindow);
        }

        WebElement EditfieldNavigation=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
        EditfieldNavigation.click();
        driver.close();

        driver.switchTo().window(OldWindow);


        WebElement ClickButton2nd=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        ClickButton2nd.click();
        int count=driver.getWindowHandles().size();
        System.out.println("Here is number of the opened windows: "+count);

        WebElement ClickButton3rd=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
        ClickButton3rd.click();

        Set<String> handler2=driver.getWindowHandles();
        for (String WindowSam:handler2) {
            if(!WindowSam.equals(OldWindow)){
                driver.switchTo().window(WindowSam);
                driver.close();
            }
        }

        driver.switchTo().window(OldWindow);

        WebElement ClickButton4th=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
        ClickButton4th.click();



    }
}
