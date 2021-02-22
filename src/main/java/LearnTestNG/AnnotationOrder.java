package LearnTestNG;

import org.testng.annotations.*;

public class AnnotationOrder {
    @BeforeSuite
    public void beforsuite(){
        System.out.println("Before Suite");
    }

    @Test
    public void Test1(){
        System.out.println("Test1");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }

    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("Before Groups");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("After Suite");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }

    @AfterGroups
    public void AfterGroups(){
        System.out.println("After Groups");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }

    @Test
    public void Test3(){
        System.out.println("Test3");
    }

    @Test
    public void Test2(){
        System.out.println("Test2");
    }


}
