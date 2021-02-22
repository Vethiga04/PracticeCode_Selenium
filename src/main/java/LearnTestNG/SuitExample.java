package LearnTestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExample {
    WebDriver driver;
    long StartTime2;
    long EndTime2;


  /*  ExtentReports extentReports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest testcase;*/


    @Test
    public void OpenGoogle(){
//        testcase=extentReports.createTest("Verify Google Page");
        driver.navigate().to("https://www.google.com/");

    }

    @Test
    public void OpenGmail(){
//        testcase=extentReports.createTest("Verify Email Page");
        driver.navigate().to("https://www.google.com/");
        String XpathVal="//a[@class='gb_g']|//a[@data-pid='23']";
        WebElement GmailNavigation=driver.findElement(By.xpath(XpathVal));
        GmailNavigation.click();
    }


    @BeforeSuite
    public void BrowserLaunch(){
       /* ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("emailable-report.html");
        extentReports.attachReporter(extentSparkReporter);*/
        StartTime2= System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\Selenium\\chromedriver.exe");
        driver=new ChromeDriver();
    }


    @AfterSuite
    public void BrowserClose(){
        EndTime2= System.currentTimeMillis();
        long ExecutedTime=EndTime2-StartTime2;
        System.out.println("Execution Time: "+ExecutedTime);
        driver.quit();
//        extentReports.flush();
    }


}
