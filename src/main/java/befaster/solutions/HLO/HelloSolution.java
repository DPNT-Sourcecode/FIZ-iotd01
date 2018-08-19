package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
    	String helloString=null;
    	if(friendName!=null&&!friendName.isEmpty()){
    		helloString="Hello, "+ friendName+"!";	
    	return helloString;
    	
    	}
    	else{
        throw new SolutionNotImplementedException();
    }
}
}
