package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(groups = "Primitive")
    public void testOne() {
        Assert.assertTrue("Fruits".toLowerCase().equals("fruits"));
    }
}
