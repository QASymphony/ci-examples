package testngdemo;

import org.testng.annotations.Test;

/**
 * Created by duongnapham on 1/10/18.
 */
public class MultipleDependencyTest {
    @Test
    public void start() {
        System.out.println("Starting the server");
    }

    @Test(dependsOnMethods = { "start" })
    public void init() {
        System.out.println("Initializing the data for processing!");
    }

    @Test(dependsOnMethods = { "start", "init" })
    public void process() {
        System.out.println("Processing the data!");
    }

    @Test(dependsOnMethods = { "process" })
    public void stop() {
        System.out.println("Stopping the server");
    }
}
