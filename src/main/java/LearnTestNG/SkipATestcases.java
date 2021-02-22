package LearnTestNG;

import org.testng.annotations.Test;

public class SkipATestcases {
    @Test(priority = 2)
    void FirstGear(){ //method
        System.out.println("First Gear");
    }

    @Test (priority = 1)
    void SecondACar(){
        System.out.println("Second Gear");
    }

    @Test (priority = 0,enabled = false)
    void MusicOn(){
        System.out.println("Start Music");
    }
}
