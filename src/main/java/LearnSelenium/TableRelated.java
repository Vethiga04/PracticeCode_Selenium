package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TableRelated{

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/table.html");

        List<WebElement> Rowscount=driver.findElements(By.tagName("tr"));
        int R_Count=Rowscount.size();
        System.out.println("Rows count: "+R_Count);

        List<WebElement> Columnscount=driver.findElements(By.tagName("th"));
        int C_Count=Columnscount.size();
        System.out.println("Columns count "+C_Count);

//     //td[normalize-space()='Learn to interact with Elements']//following::td[1]

        String Xpath_Progress="//td[normalize-space()='Learn to interact with Elements']//following::td[1]";
        WebElement Percentage= driver.findElement(By.xpath(Xpath_Progress));
        String Value=Percentage.getText();
        System.out.println(Value);



        List<Integer> listofpercentage=new ArrayList<Integer>();
       List<WebElement> Elements= driver.findElements(By.xpath("//td[2]"));
        for (WebElement values:Elements) {
            String newstr=values.getText().replace("%","");
            Integer a=Integer.parseInt(newstr);
            listofpercentage.add(a);
        }
        System.out.println(listofpercentage);
        Integer minimum= Collections.min(listofpercentage);
        System.out.println(minimum);

        String finalvalue=String.valueOf(minimum+"%");

        String finalxpath="//td[normalize-space()="+"\""+finalvalue+"\""+"]//following::td[1]//input";

        System.out.println(finalxpath);
//        "//td[normalize-space()='listofpercentage']//following::td[1]"

        WebElement TickCheckbox= driver.findElement(By.xpath(finalxpath));
        TickCheckbox.click();
    }
}
