package LearnTestNG;

import org.testng.annotations.Test;

public class SampleTestCase {

    @Test(priority = 1)
    public void FirstTestCase(){
        System.out.println("It's the First Testcase");
    }
    @Test(priority = 2)
    public void SecondTestCase(){
        System.out.println("It's the Second Testcase");
    }

    @Test(priority = 3)
    public void ThirdTestCase(){
        System.out.println("It's the Third Testcase");
    }

    @Test(priority = 4)
    public void FourthTestCase(){
        System.out.println("It's the Fourth Testcase");
    }

}
