package LearnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest {
    @Test
    public static void Test (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/");

        WebElement NavigateAlert=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/img"));
        NavigateAlert.click();

        WebElement AlertBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
        AlertBox.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement AlertConfirm= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
        AlertConfirm.click();

        Alert ConAlert=driver.switchTo().alert();
        alert.dismiss();

        WebElement AlertPrompt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        AlertPrompt.click();

        Alert PromAlert=driver.switchTo().alert();
        PromAlert.sendKeys("It's prompt alert");
        PromAlert.accept();





    }
}
