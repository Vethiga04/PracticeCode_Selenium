package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextfieldRelated {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement TextfieldNavigation=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
        TextfieldNavigation.click();

        WebElement ElementTypeText=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        ElementTypeText.sendKeys("Learn_Text");

        WebElement AppendText=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
        AppendText.sendKeys("Text Field");

        WebElement GetText=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
        String TextRetreieve= GetText.getAttribute("value");
        System.out.println("Retrieved Text is: "+TextRetreieve);

        //clear texts
        WebElement ClearText=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
        ClearText.clear();

        //Enabled or disabled verification
        WebElement DisabledVerify=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
        boolean enabled=DisabledVerify.isEnabled();

        //printing result using if condition
        if(enabled==false){
            System.out.println("Text field is Disabled");
        }
        else {
            System.out.println("Text field is not Disabled");
        }


    }
}
