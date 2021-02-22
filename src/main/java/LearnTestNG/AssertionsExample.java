package LearnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
    String str="Check";
    Boolean booleanVal=false;
    @Test
    public void Assertions(){
        Assert.assertEquals(str,"Check");
        Assert.assertNotEquals(str,"UCheck");
        Assert.assertTrue(booleanVal,"not true");
    }
}
