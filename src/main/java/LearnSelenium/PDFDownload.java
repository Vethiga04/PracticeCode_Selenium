package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import static java.lang.Thread.*;

public class PDFDownload {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/download.html");

        WebElement PDFButton=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/a[2]"));
        PDFButton.click();


        driver.switchTo().window("http://www.leafground.com/testleaf.pdf");

        Thread.sleep(3000);
        WebElement toolbar=driver.findElement(By.xpath("/html/body/pdf-viewer//viewer-pdf-toolbar//div"));
        Actions actions=new Actions(driver);
        actions.moveToElement(toolbar);
//        WebElement DownloadIcon= driver.findElement(By.xpath("/html/body/pdf-viewer//viewer-pdf-toolbar//div/div[1]/div[2]/viewer-download-controls//cr-icon-button//div/iron-icon"));
//        DownloadIcon.click();
    }
}