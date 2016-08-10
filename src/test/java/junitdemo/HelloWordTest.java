package junitdemo;

import org.junit.*;

/**
 * Created by duongnapham on 3/5/15.
 */
public class HelloWordTest {

    @Before
    public void beforeEachTest() {
        System.out.println("......Waiting.... .. ");
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is executed after each Test");
        System.out.println("......END --- Waiting.... .. " );
    }

    @Test
    public void sayHello() {
        System.out.println("----- START OF Verify function sayHello in HelloWord class -------------");
        String str = "Hello";
        Assert.assertEquals(str, "Hello");
        System.out.println("Hello");
        System.out.println("----- END OF Verify function sayHello in HelloWord class -------------");
    }

    @Test
    public void testTimeOut() {
        System.out.println("----- START OF Verify function testTimeOut in HelloWord class -------------");
        try{
            System.out.println("Waiting..............");
            Thread.sleep(10000);
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("----- END OF Verify function testTimeOut in HelloWord class -------------");
    }

    @Test
    public void test() {
        System.out.println("----- START OF Verify function test in HelloWord class -------------");
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = { 1, 2, 3 };
        int[] arithmetic2 = { 1, 2, 3 };

        Assert.assertEquals(obj1, obj2);

        Assert.assertSame(obj3, obj4);

        Assert.assertNotSame(obj2, obj4);

        Assert.assertNotNull(obj1);

        Assert.assertNull(obj5);

        Assert.assertTrue(var1 < var2);

        Assert.assertArrayEquals(arithmetic1, arithmetic2);
        System.out.println("----- END OF Verify function test in HelloWord class -------------");
    }

    @Ignore
    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }
}