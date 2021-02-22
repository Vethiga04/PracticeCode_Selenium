package LearnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DriveACar {
    @Test(priority = 1)
     void StartACar(){
        System.out.println("Start the Car");
        Assert.assertEquals(1,1);
    }
//@test annotation have priority attribute. it parses paramaters

    @Test (priority = 2) //TestCase
     void FirstGear(){ //method
        System.out.println("First Gear");
    }

    @Test//(priority = -3)
     void SecondACar(){
        System.out.println("Second Gear");
    }
}
