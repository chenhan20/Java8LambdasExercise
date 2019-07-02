package steve;

import java.util.function.Predicate;

public class lambdaTest {

	public static void main(String[] args) {
		String testString = "SteveChuangTest";
		Predicate<String> testPredicate = x -> x.length() >= 5;

		if (testPredicate.test(testString))
			System.out.println(testString + "length>5");

	}

}
