package sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sample.junit.*;

/**
 * Created by duongnapham on 8/26/15.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorFuncTest.class
})
public class SuitTest {
}
