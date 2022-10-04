class Human {
	
	int mascularStrength = 50;
	
	int gyming() {
		mascularStrength++;

		if(mascularStrength > 55) {
			return 40;
		}
		else {
			return 50;
		}
	}		
}

class Society {
	
	int fund;
	String name;
	String secretaryName;
}

public class SecondOOPS {
	
	public static void main(String[] args) {
		
		Human inan = new Human();
		
		int gymFee = inan.gyming();
	
		Society sf = new Society();
		
		System.out.println("The Society Fund righjt after innaugration "+sf.fund);
		sf.fund = gymFee;
		
		System.out.println("The Society fund after Inan' gym fee computation "+sf.fund);
		
		System.out.println("After calling method "+inan.mascularStrength);
		
		Human stephen = new Human();
		
		int gymFee2 = stephen.gyming();
		
		sf.fund = sf.fund + gymFee2;
		
		System.out.println("The society fund after Stephen' fee calculated "+sf.fund);	
	}	
}




//class Human {
//	
//	int iq = 12;
//	int mascularStrength = 50;
//	
//	int studying() {
//		iq++;
//		return 100;
//	}
//	
//	void gyming() {
//		mascularStrength++;
//	}		
//}
//
//public class SecondOOPS {
//	
//	public static void main(String[] args) {
//		
//		Human inan = new Human();
//		
//		System.out.println(inan.iq);
//		System.out.println(inan.mascularStrength);
//		
//		inan.gyming();
//		int tuitionFee = inan.studying();
//		
//		System.out.println("The Tuition Fee is "+tuitionFee);
//		
//		System.out.println("After calling respective methods on different objects...");
//		
//		System.out.println(inan.iq);
//		System.out.println(inan.mascularStrength);
//	}	
//}


//class Human {
//	
//	int iq = 12;
//	int height = 1;
//	int mascularStrength = 50;
//	
//	void studying() {
//		iq++;
//	}
//	
//	void gyming() {
//		mascularStrength++;
//	}
//	
//	void playingBasketBall() {
//		height++;
//	}	
//}
//
//
//public class SecondOOPS {
//	
//	public static void main(String[] args) {
//		
//		Human inan = new Human();
//		Human ali = new Human();
//		Human david = new Human();
//		
//		System.out.println(inan.iq);
//		System.out.println(inan.mascularStrength);
//		System.out.println(inan.height);
//		System.out.println(ali.iq);
//		System.out.println(ali.mascularStrength);
//		System.out.println(ali.height);
//		System.out.println(david.iq);
//		System.out.println(david.mascularStrength);
//		System.out.println(david.height);
//		
//		david.studying();
//		david.gyming();
//		
//		ali.playingBasketBall();
//		
//		inan.gyming();
//		
//		System.out.println("After calling respective methods on different objects...");
//		
//		System.out.println(inan.iq);
//		System.out.println(inan.mascularStrength);
//		System.out.println(inan.height);
//		System.out.println(ali.iq);
//		System.out.println(ali.mascularStrength);
//		System.out.println(ali.height);
//		System.out.println(david.iq);
//		System.out.println(david.mascularStrength);
//		System.out.println(david.height);
//	}	
//}









//public class SecondOOPS {
//	
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	public static void main(String[] args) {
//		
//		SecondOOPS s1 = new SecondOOPS();
//		
//		s1.add();
//	}
//
//	void add() {
//		System.out.println(i);
//	}
//	
//}
