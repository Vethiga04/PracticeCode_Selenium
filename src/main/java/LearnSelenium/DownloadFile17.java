package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadFile17 {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/download.html");

        WebElement downloadlink= driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/a[1]"));
        downloadlink.click();

//        C:\\Users\\TheShy\\Downloads
        File filelocation=new File("C:\\Users\\TheShy\\Downloads");
        File[] Allfiles=filelocation.listFiles();
        for (File element:Allfiles) {
            if(element.getName().equals("testleaf.xlsx")){
                System.out.println("File is downloaded successfully");
                break;
            }
        }


    }
}
