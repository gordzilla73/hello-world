

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFizzBuzz {
    
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_number() {
        Assert.assertEquals("1", fizzBuzz.valueOf(1));
        Assert.assertEquals("2", fizzBuzz.valueOf(2));
        Assert.assertEquals("13", fizzBuzz.valueOf(13));
        Assert.assertEquals("28", fizzBuzz.valueOf(28));
    }

    @Test
    public void test_Fizz() {
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(3));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(6));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(54));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(333));
    }

    @Test
    public void testBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.valueOf(5));
        Assert.assertEquals("Buzz", fizzBuzz.valueOf(10));
        Assert.assertEquals("Buzz", fizzBuzz.valueOf(80));
        Assert.assertEquals("Buzz", fizzBuzz.valueOf(1555));
    }

    @Test
    public void test_FizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.valueOf(15));
        Assert.assertEquals("FizzBuzz", fizzBuzz.valueOf(30));
        Assert.assertEquals("FizzBuzz", fizzBuzz.valueOf(90));
        Assert.assertEquals("FizzBuzz", fizzBuzz.valueOf(300));
    }

    @Test
    public void test_consecutive_values() {
        Assert.assertEquals("1", fizzBuzz.valueOf(1));
        Assert.assertEquals("2", fizzBuzz.valueOf(2));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(3));
        Assert.assertEquals("4", fizzBuzz.valueOf(4));
        Assert.assertEquals("Buzz", fizzBuzz.valueOf(5));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(6));
        Assert.assertEquals("7", fizzBuzz.valueOf(7));
        Assert.assertEquals("8", fizzBuzz.valueOf(8));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(9));
        Assert.assertEquals("Buzz", fizzBuzz.valueOf(10));
        Assert.assertEquals("11", fizzBuzz.valueOf(11));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(12));
        Assert.assertEquals("13", fizzBuzz.valueOf(13));
        Assert.assertEquals("14", fizzBuzz.valueOf(14));
        Assert.assertEquals("FizzBuzz", fizzBuzz.valueOf(15));
        Assert.assertEquals("16", fizzBuzz.valueOf(16));
        Assert.assertEquals("17", fizzBuzz.valueOf(17));
        Assert.assertEquals("Fizz", fizzBuzz.valueOf(18));
        Assert.assertEquals("19", fizzBuzz.valueOf(19));
        Assert.assertEquals("Buzz", fizzBuzz.valueOf(20));
    }

}
