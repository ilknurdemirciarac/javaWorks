package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//döngüler
		
		//For
		for (int i=1; i<=10;i++) {
			System.out.println(i);
			
		}
		System.out.println("For Döngüsü bitti");
		
		//While
		System.out.println("While döngüsü başladı");
		int i=1;
		while(i<10) {
			System.out.println(i);
			i=i+1;
		}
		System.out.println("While 1 döngüsü bitti");
		 i=1;
		while(i<10) {
			System.out.println(i);
			i=i+2;
		}
		i=1;
		System.out.println("While 2 döngüsü bitti");
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While 3 döngüsü bitti");
		
		
		//dowhile döngüsü
		i=1;
		System.out.println("Do While döngüsü başladı");
		do {
			System.out.println(i);
			i++;
			
		} while (i<10);

	}

}
