package ua.lviv.lgs.lesson22_1;

import ua.lviv.lgs.lesson22_1.Pet;

public class Application_5_1 {
    public static void main(String[] args) {
    	
        Pet cat = () -> System.out.println("I am cat-Miaouw-Miaouu");
        Pet cow = () -> System.out.println("I am cow-muou-muouu");
        Pet dog = () -> System.out.println("I am dog Gauuu-Gauuu");
        
        cat.voice(); cow.voice(); dog.voice(); 
	}
}

interface Pet {
    void voice();
}