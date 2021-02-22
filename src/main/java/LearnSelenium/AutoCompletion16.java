package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoCompletion16 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/autoComplete.html");

        WebElement input= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div/div/div[2]/input"));
        input.sendKeys("s");
        Thread.sleep(3000); //Explicit wait //implicit wait

        List <WebElement> options= driver.findElements(By.xpath("/html/body/ul/li"));

        System.out.println(options.size());

        for (WebElement a:options) {
            if(a.getText().equals("Selenium")){
                a.click();
                break; // used for the efficiency
            }
        }

    }
}
