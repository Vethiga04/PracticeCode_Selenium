package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableRetest {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/table.html");

        driver.navigate().refresh();
        List<WebElement> Row=driver.findElements(By.tagName("tr"));
        System.out.println(Row.size());

        List<WebElement> Column=driver.findElements(By.tagName("th"));
        System.out.println(Column.size());

//     //td[normalize-space()='Learn to interact with Elements']//following::td
//     //td[normalize-space()='Learn Locators']//th[Progress[text()]]

        String Xpath_Percentage="//td[normalize-space()='Learn to interact with Elements']//following::td";
        WebElement SelectPercentage= driver.findElement(By.xpath(Xpath_Percentage));
        System.out.println("Progress value of 'Learn to interact with Elements' is: "+SelectPercentage.getText());

        List<Integer> IntegerList=new ArrayList<Integer>();

        List<WebElement> Percentage_cells=driver.findElements(By.xpath("//td[2]"));
        for (WebElement Takenvalue:Percentage_cells) {
            String listvalue=Takenvalue.getText().replace("%","");
            Integer Intvalue=Integer.parseInt(listvalue);
            IntegerList.add(Intvalue);
        }
        System.out.println(IntegerList);
        Integer MinimumValue=Collections.min(IntegerList);
        System.out.println("Minimum Value is: "+MinimumValue);
        String MinimumValuetoString=String.valueOf(MinimumValue+"%");

        String xpath_Checkbox="//td[normalize-space()=" + "\""+ MinimumValuetoString + "\"" + "]//following::td[1]//input";

        WebElement TickCheckBox=driver.findElement(By.xpath(xpath_Checkbox));
        TickCheckBox.click();

    }
}
