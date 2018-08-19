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
    	StringBuilder sb = new StringBuilder();
    	if((number%3==0)&&(number.toString().indexOf("3")!=-1)){
    		sb.append("fizz");
    	}
    	if((number%5==0)&&(number.toString().indexOf("5")!=-1)){
    		if(sb.length()!=0){
    			
    		sb.append(" buzz");
    		}else{
    			sb.append("buzz");
    	    }   	
    		
    	
    	}
       return sb.toString(); 
    }

}
