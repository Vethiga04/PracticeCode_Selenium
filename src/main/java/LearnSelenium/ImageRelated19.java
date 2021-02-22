package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageRelated19 {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        String Defaultwindow=("http://www.leafground.com/pages/Image.html");
        driver.get(Defaultwindow);

        WebElement Imagebtn= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img"));
        if(Imagebtn.getAttribute("naturalWidth").equals("0")){
            System.out.println("Image is broken");
        }
        else {
            System.out.println("Image is not broken");
        }
        Imagebtn.click();

        String Defaultwindow1=("http://www.leafground.com/pages/Image.html");
        driver.get(Defaultwindow1);

        WebElement image=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
        if(image.getAttribute("naturalWidth").equals("0")){
            System.out.println("Image is broken");
        }
        else {
            System.out.println("Image is not broken");
        }


    }
}
