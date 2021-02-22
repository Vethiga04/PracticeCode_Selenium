package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/checkbox.html");

        WebElement CheckboxSelectionJava=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
        CheckboxSelectionJava.click();

        WebElement CheckboxSecond=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
        boolean value=CheckboxSecond.isSelected();

        if(value==true){
            System.out.println("Checkbox:Selenium is selected");
        }
        else{
            System.out.println("Not selected");
        }


        WebElement Selection1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));

        WebElement Selection2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));

        if(Selection1.isSelected()){
            Selection1.click();
        }
        else {
            Selection2.click();
        }

    }
}
