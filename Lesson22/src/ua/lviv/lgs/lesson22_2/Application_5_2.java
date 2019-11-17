package ua.lviv.lgs.lesson22_2;

import java.util.function.Predicate;

public class Application_5_2 {

	public static void main(String[] args) {
		 
		 int result = (int ) (Math.random() * 2);
			check(result,n -> n == 1);
			
			System.out.println(result);

	}

	public static void check (int result,Predicate<Integer> predicate) {
		if (predicate.test(result)) {
			System.out.println("RESHKA");
		} else 
			System.out.println("OREL");
		
	}
	
	
}
