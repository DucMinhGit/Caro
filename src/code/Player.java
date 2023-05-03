package code;

import java.util.Scanner;

class Player {

	String name;
	
	String type;
	
	Player(String type) {
		
		this.type = type;
		
		Scanner input = new Scanner(System.in);
		if(type == "X") {
			System.out.println("Player selecting X, enter your name: ");
			name = input.nextLine();
		} else {
			System.out.println("Player selecting Y, enter your name: ");
			name = input.nextLine();
		}
	}
}
