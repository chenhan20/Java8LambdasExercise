package steve;                                                                                                                                                            
                                                                                                                                                                          
import java.util.function.Predicate;                                                                                                                                      
                                                                                                                                                                          
public class lambdaTest {                                                                                                                                                 
                                                                                                                                                                          
	public static void main(String[] args) {      
		String testString = "Steve老大";
		Predicate<String> testPredicate = x -> x.length()>=5;                                                                                                      
		                      
		if(testPredicate.test(testString))
			System.out.println(testString +"---五個字以上");                                                                                                                    
		                                                                                                                                                                  
		                                                                                                                                                                  
	}                                                                                                                                                                     
                                                                                                                                                                          
}                                                                                                                                                                         
                                                                                                                                                                          