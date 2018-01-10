package testngdemo;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by duongnapham on 1/10/18.
 */
public class TestNGAnnotationBeforeMethodExample {
    @BeforeMethod
    public void setUp() {
        System.out.println("@BeforeMethod: The annotated method will be run before each test method.");
    }
    @Test
    public void validateSum() {
        System.out.println("@Test : validateSum()");
        int a = 5;
        int b = 10;
        Assert.assertEquals(a + b, 15);
    }
    @Test
    public void validateDifference() {
        System.out.println("@Test : validateDifference()");
        int a = 5;
        int b = 10;
        Assert.assertEquals(b - a, 5);
    }

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }

}
