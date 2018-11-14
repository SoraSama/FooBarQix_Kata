package fr.extia.cls;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * Author:andelai.S
 * Date:14/11/2018
 */

@RunWith(Parameterized.class)
public class FooBarQixTest {
@Parameters
    public static Collection<Object[]> getParams() {
        return Arrays.asList(new Object[][] {
                { 51, "FooBar", "Test number 51 is false. pls check code " },
                { 53, "BarFoo", "Test number 53 is false. pls check code " },
                { 13, "Foo", "Test number 13 is false. pls check code " },
                { 15, "FooBarBar", "Test number 15 is false. pls check code " },
                { 33, "FooFooFoo", "Test number 33 is false. pls check code " },
                { 27, "FooQix", "Test number 27 is false. pls check code  " }

        });
    }
    // setup object under test
    private FooBarQix test;
    @Before
    public void setUp() throws Exception {
        test = new FooBarQix();
        test.init(1,100);

    }
    // parameters
    private int number;
    private String expected;
    private String error;
    public FooBarQixTest(int number, String expected, String error) {
        this.number = number;
        this.expected = expected;
        this.error = error;
    }

    @Test
    public void testFoobarqix() {
        Assert.assertTrue(error, expected.equals(test.replace(number)));

    }
}