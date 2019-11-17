package ua.lviv.lgs.lesson22_5;

public class Application_5_5 {

	public static void main(String[] args) {
	
		Print_Out eat = () -> System.out.println("eat");		
	
		Print_Out sleep = () -> System.out.println("sleep");		
		
		Print_Out swim = () -> System.out.println("swim");		
		
		Print_Out walk = () -> System.out.println("walk");		
			
	    eat.print_out();
	    sleep.print_out();
	    swim.print_out();
	    walk.print_out();
			
			
		
		
	}

}

interface Print_Out {
	void print_out();
}