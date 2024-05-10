package sit707_week6;

public class WeatherAndMathUtils2 {
	public WeatherAndMathUtils2() {
        // Constructor does nothing in this case
    }
	
	  public static void conditionalLoopWithSimpleInstructions(int count) {
	        for (int i = 0; i < count; i++) {
	            System.out.println("Iteration: " + i);
	        }
	    }

	    public static void conditionalLoopWithConditionalStatement(int count) {
	        int i = 0;
	        while (i < count) {
	            if (i % 2 == 0) {
	                System.out.println("Even Iteration: " + i);
	            } else {
	                System.out.println("Odd Iteration: " + i);
	            }
	            i++;
	        }
	    }
}
