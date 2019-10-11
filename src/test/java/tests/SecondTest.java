package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

    @Test(groups = "Primitive")
    public void testTwo() {
        Assert.assertTrue(2 < 1, "Two is less than one");
    }
}
