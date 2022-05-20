package analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int maxTry = 3;
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(count<maxTry) {
				count++;
				result.setStatus(result.FAILURE);
				return true;
			}
			else {
				result.setStatus(result.FAILURE);
			}
		}
		else {
			result.setStatus(result.SUCCESS);
		}
		
		
		return false;
	}
	
	 
	

}
