package steve;                                                                                                                                                            
                                                                                                                                                                          
import java.util.function.Predicate;                                                                                                                                      
                                                                                                                                                                          
public class lambdaTest {                                                                                                                                                 
                                                                                                                                                                          
	public static void main(String[] args) {      
		String testString = "Steve�Ѥj";
		Predicate<String> testPredicate = x -> x.length()>=5;                                                                                                      
		                      
		if(testPredicate.test(testString))
			System.out.println(testString +"---���Ӧr�H�W");                                                                                                                    
		                                                                                                                                                                  
		                                                                                                                                                                  
	}                                                                                                                                                                     
                                                                                                                                                                          
}                                                                                                                                                                         
                                                                                                                                                                          