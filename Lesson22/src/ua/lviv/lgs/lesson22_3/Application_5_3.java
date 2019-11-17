package ua.lviv.lgs.lesson22_3;

public class Application_5_3 {

	public static void main(String[] args) {
		
	Print_Out out = mes -> System.out.println(mes);
		
		out.print_out("Double.MAX_VALUE "+Double.MAX_VALUE);
		out.print_out("Double.MIN_VALUE "+Double.MIN_VALUE);
		out.print_out("Float.MAX_VALUE "+Float.MAX_VALUE);
		out.print_out("Float.MIN_VALUE "+Float.MIN_VALUE);

	}

}

interface Print_Out {
	void print_out(String str);
}