import java.util.Scanner;

public class IfElseIf {


	public static  void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your role by it's number \n 1.) Administrator \n 2.)Faculty \n 3.)Staff \n 4.)Student \n 5.)Guest"); {
			int role = keyboard.nextInt();
			switch(role) {
		case 1:
			System.out.println("Welcome Administrator");
			break;
		case 2:
			System.out.println("Welcome Faculty!");
			break;
		case 3:
			System.out.println("Welcome Staff");
			break;
		case 4:
			System.out.println("Welcome Student");
			break;
		case 5:
			System.out.println("Welcome Guest");
			break;
		default:
			System.out.println("Wrong role");
			break;
		
		
				
				
		
		}
		
		
		
		
 
	
		}
	
	}
	
}
		
	