package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile18 {

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/upload.html");

        Actions actions=new Actions(driver);

        WebElement downloadbtn= driver.findElement(By.xpath("/html/body/div/div/div[3]/input"));
        actions.click(downloadbtn).build().perform();  //Method1

//      actions.moveToElement(downloadbtn).click().build().perform();  //Method2

        Thread.sleep(3000);
        String File="C:\\Users\\TheShy\\Downloads\\testleaf.xlsx";

        StringSelection selection=new StringSelection(File);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

}
