package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223798216";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "chandrakanth";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		 Assert.assertFalse(WeatherAndMathUtils.isEven(5));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testWeatherAdviceCancel() {
        // Test for the "CANCEL" advice
    	
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
   

    @Test
    public void testWeatherAdviceWarn() {
        // Test for the "WARN" advice
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 4.0));
    }

    @Test
    public void testWeatherAdviceAllClear() {
        // Test for the "ALL CLEAR" advice
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 2.0));
    }

    @Test
    public void testIsEvenTrue() {
        // Test for even number
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testIsEvenFalse() {
        // Test for odd number
        Assert.assertFalse(WeatherAndMathUtils.isEven(5));
    }

    @Test
    public void testIsPrimeTrue() {
        // Test for prime number
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
    }

    @Test
    public void testIsPrimeFalse() {
        // Test for non-prime number
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }
    
    @Test
    public void testIsPrimeEdgeCase() {
    	Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
    }
    @Test
    public void testConditionalLoopWithSimpleInstructions() {
        // Test the loop with count = 3
        WeatherAndMathUtils2.conditionalLoopWithSimpleInstructions(3);
        // Add assertions as needed
    }

    @Test
    public void testConditionalLoopWithConditionalStatement() {
        // Test the loop with count = 4
        WeatherAndMathUtils2.conditionalLoopWithConditionalStatement(4);
        // Add assertions as needed
    }
    @Test
    public void testConstructor() {
        // Test the constructor by creating an instance of WeatherAndMathUtils2
        WeatherAndMathUtils2 ones = new WeatherAndMathUtils2();
        // Since the constructor does nothing, there's nothing to assert
    }
    
    @Test
    public void testConstructor1() {
        // Test the constructor by creating an instance of WeatherAndMathUtils2
        WeatherAndMathUtils twos = new WeatherAndMathUtils();
        // Since the constructor does nothing, there's nothing to assert
    }
}
