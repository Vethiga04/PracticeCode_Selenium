package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownRelated {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement DropdownpageNavigation=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/h5"));
        DropdownpageNavigation.click();

        WebElement Dropdownselection=driver.findElement(By.xpath("//*[@id=\"dropdown1\"]"));
        Select select=new Select(Dropdownselection);
        //select.selectByIndex(3);
       // don't add thread. we're using automation for rapid automate execution Thread.sleep(3000);

        //select.selectByValue("4");

//        select.selectByVisibleText("Appium");

        List<WebElement> Options = select.getOptions();
        System.out.println(Options.size());

        Dropdownselection.sendKeys("Loadrunner");

        WebElement SelectionMultiple=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        Select SelectBox=new Select(SelectionMultiple);
        SelectBox.selectByIndex(1);
        SelectBox.selectByIndex(2);
        SelectBox.selectByIndex(3);
    }
}
