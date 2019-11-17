package ua.lviv.lgs.lesson22_4;

import java.util.function.Consumer;

public class Application_5_4  {
		 
		private String name;
		private int width;
		private int height;
		
		Application_5_4 (){
			name="Square";
			width=5;
			height=10;
		}
		
		Application_5_4 (String name){
			this();
			this.name=name;
		}
		Application_5_4 (int width, int height){
			this();
			this.width=width;
			this.height=height;
			
		}

		@Override
		public String toString() {
			return "Application [name=" + name + ", width=" + width + ", height=" + height + "]";
		}
	
	
	
	public static void main(String[] args) {
		Application_5_4 app = new  Application_5_4(20, 20);
	        Consumer<Application_5_4> consumer = x ->System.out.println(x.toString());
	        consumer.accept(app);

	}

}

