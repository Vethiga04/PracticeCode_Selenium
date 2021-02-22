package LearnTestNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
    @Test(priority = 0,enabled = false)
    public void OLExamination(){
        System.out.println("O/L Exam passed");
    }
    @Test(priority = 1,dependsOnMethods = "OLExamination")
    public void ALExamination(){
        System.out.println("A/L Exam passed");
    }
    @Test(priority = 2,dependsOnMethods = "ALExamination")
    public void Engineering(){
        System.out.println("Engineering entered");
    }
}
