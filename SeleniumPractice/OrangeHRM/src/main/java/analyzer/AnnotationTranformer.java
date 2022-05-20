package analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTranformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation obj1, Class obj2, Constructor obj3, Method obj4) {
		
		obj1.setRetryAnalyzer(RetryAnalyzer.class);
		
	}
	
	
	
	
}
