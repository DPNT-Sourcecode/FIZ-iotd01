package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	if((number%3==0)&&(number%5!=0)){
    	 return "fizz";
    		
    	}else if((number%3!=0)&&(number%5==0)){
    		return "buzz";
    		
    	}else if((number%3==0)&&(number%5==0)){
    		return "fizz buzz";
    		
    	}else{
    		return number.toString();
    		
    	}
        
    }

    
    public String fizz_buzz(Integer number) {
    	if((number%3==0)&&(number%5!=0)){
    	 return "fizz";
    		
    	}else if((number%3!=0)&&(number%5==0)){
    		return "buzz";
    		
    	}else if((number%3==0)&&(number%5==0)){
    		return "fizz buzz";
    		
    	}else{
    		return number.toString();
    		
    	}
        
    }

}
