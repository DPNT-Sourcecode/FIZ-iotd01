package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

   
    
    public String fizzBuzz(Integer number) {
    	StringBuilder sb = new StringBuilder();
    	if((number%3==0)||(number.toString().indexOf("3")!=-1)){
    		sb.append("fizz");
    	}
    	if((number%5==0)||(number.toString().indexOf("5")!=-1)){
    		if(sb.length()!=0){    			
    		sb.append(" buzz");
    		}else{
    			sb.append("buzz");
    	    }  		
    	
    	}
    	if((number>10 && hasSameDigits(number.toString()))){
    		
    		if(sb.length()!=0 && sb.toString().contains("fizz buzz")){    			
        		sb.append(" deluxe");       		
    		
    	    }
    	}
    	if(sb.length()==0){
    		return number.toString();
    	}
    	
    	
       return sb.toString(); 
    }
    
    private boolean hasSameDigits(String number){
		int result=0;
    	for (int i=1 ; i<=number.length();i++){
    		int currentChar=number.charAt(i);
    		if((result&(1<<currentChar))>0){
    			return true;
    		}
    		result = result|(1<<currentChar);
    	}
    	return false;
    	
    }

}
