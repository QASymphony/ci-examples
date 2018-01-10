package testngdemo;

import org.testng.annotations.Test;

/**
 * Created by duongnapham on 1/10/18.
 */
public class TestNGAnnotationTestMethodTimeOutExampleTest {
    @Test(timeOut = 2000)
    public void timeOutTestMethodOne() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("TimeOut Test Method One!!");
    }

    @Test(timeOut = 5000)
    public void timeOutTestMethodTwo() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("TimeOut Test Method Two!!");
    }

    @Test(timeOut = 2000)
    public void timeOutTestMethodRunForEver() {
        while (true) {
            // Do nothing
        }
    }
}
