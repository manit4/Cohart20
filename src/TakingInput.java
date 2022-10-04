import java.util.Scanner;

public class TakingInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any name which you wish to print!!");
		
		String name = sc.nextLine();
		
		System.out.println("Enter any number!!");
		
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			
			System.out.println(name);
		}	
	}
}



//import java.util.Scanner;
//
//public class TakingInput {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean flag = true;
//		
//		while(flag) {
//			
//			System.out.println("Enter the name");
//			
//			String name = sc.next();
//			
//			if(name.equals("Ama")) {
//				System.out.println("You have successfully logged-in..");
//				flag = false;
//			}
//			else {
//				System.out.println("Sorry, credentials wrong..");
//			}	
//		}	
//	}
//}
