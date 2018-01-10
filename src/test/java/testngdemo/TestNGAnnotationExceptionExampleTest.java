package testngdemo;

import org.testng.Assert;
import org.testng.annotations.*;
import skilledmonter.example.CalculatorService;
import skilledmonter.example.SimpleCalculator;

/**
 * Created by duongnapham on 1/10/18.
 */
public class TestNGAnnotationExceptionExampleTest {
    public CalculatorService service;

    @BeforeClass
    public void init() {
        System.out.println("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
        System.out.println("init service");
        service = new SimpleCalculator();
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDiv() {
        System.out.println("@Test : testDiv()");
        int result = service.div(1, 0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testSum() {
        System.out.println("@Test : testSum()");
        int result = service.sum(1, 0);
    }

    @Test(enabled = false)
    public void testMultiply() {
        System.out.println("@Test : testMultiple() -> enable=false");
        int result = service.multiply(10, 5);
        Assert.assertEquals(result, 50);
    }

    @Test
    public void testSub() {
        System.out.println("@Test : testSub()");
        int result = service.sub(10, 5);
        Assert.assertEquals(result, 5);
    }
}
