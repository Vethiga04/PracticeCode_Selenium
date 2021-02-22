package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/radio.html");

        WebElement radiobtn1stOpt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
        WebElement radiobtn2ndOpt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));

        boolean UncheckedOption=radiobtn1stOpt.isSelected();
        boolean CheckedOption=radiobtn2ndOpt.isSelected();

        if(UncheckedOption==true){
            System.out.println("Default selected option : Unchecked");
        }
        else {
            System.out.println("Default selected option : Checked");
        }

        WebElement SelectionBtn=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
        SelectionBtn.click();

    }
}
