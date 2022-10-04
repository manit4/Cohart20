class Human1 {

	int i = 4;
	int j = 5;
	static int k;
	
	public static void main(String[] args) {
		
		Human h1 = new Human();
		
		Human h2 = new Human();
		
		add();
			
	}	
	
	static void add() {
		
		System.out.println(k);
		
		//Static as well as non-static variables can be accessed inside non-static methods
		//non-static variables cannot be accessed into static methods..
		//static members do not any object to be called upon...
		//only global variables can be declared static not local variables... 
	}
}






//class Human {
//
//	int i = 4;
//	int j = 5;
//	static int k;
//	
//	public static void main(String[] args) {
//		
//		Human h1 = new Human();
//		Human h2 = new Human();
//		
//		System.out.println(h1.i);
//		System.out.println(h1.j);
//		
//		System.out.println(h2.i);
//		System.out.println(h2.j);
//		
//		System.out.println(k);
//		
//	}		
//}



//class Human {
//
//	int i = 4;
//	int j = 5;
//	static int k;
//	
//	public static void main(String[] args) {
//		
//		Human h1 = new Human();
//		
//		Human h2 = new Human();
//		
//		h1.add();
//		
//		h2.add();
//		
//		System.out.println(h1.k);
//		
//	}	
//	
//	void add() {
//		
//		k = i + j + k;
//	}
//}


























//class Human {
//
//	static int i = 4;
//	
//	public static void main(String[] args) {
//		
//		System.out.println(i);
//	}			
//}
















//class Human {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	public static void main(String[] args) {
//		
//		Human h1 = new Human();
//		
//		int value = 10;
//		
//		h1.print(value);
//		
//		System.out.println(h1.k);
//	
//	}	
//	
//	void print(int value1) {
//		
//		k = i + j+ value1;
//	}
//		
//}

//class Human {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	public static void main(String[] args) {
//		
//		Human h1 = new Human();
//		
//		int value = 10;
//		
//		h1.print(value);
//	
//	}	
//	
//	void print(int value1) {
//		
//		k = i + j+ value1;
//		
//		System.out.println(k);
//	}
//		
//}























//class Human {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	
//	public static void main(String[] args) {
//	
//		Human h1 = new Human();
//		Human h2 = new Human();
//		
//		h1.j = 100;
//		
//		int returnedValue = h1.add();
//		System.out.println("the returned value is "+returnedValue);
//		
//		int returnedValue2 = h2.add();
//		System.out.println("The retrurned value on h2 is "+returnedValue2);	
//	}	
//	
//	int add() {
//				
//		return i + j+ k;	
//	}
//		
//}





//class Human {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	
//	public static void main(String[] args) {
//	
//		Human h1 = new Human();
//		
//		
//		int returnedValue = h1.add();
//		
//		System.out.println("the returned value is "+returnedValue);
//		
//	}	
//	
//	int add() {
//				
//		return i + j+ k;	
//	}
//		
//}


//class Human {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	
//	public static void main(String[] args) {
//	
//		Human h1 = new Human();
//		
//		
//		int returnedValue = h1.add();
//		
//		System.out.println("the returned value is "+returnedValue);
//		
//	}	
//	
//	int add() {
//		
//		int l = 50;
//		
//		l = i + j+ k;
//		
//		return l;
//		
//	}
//		
//}

//class Human {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	
//	public static void main(String[] args) {
//	
//		Human h1 = new Human();
//		
//		
//		h1.add();
//		
//	}	
//	
//	void add() {
//		
//		int l = 50;
//		
//		l = i + j+ k;
//		
//		System.out.println(l);
//		
//	}
//		
//}











//class Human {
//
//	int iq = 10;
//	int height = 1;
//	int mascularStrength = 23; 
//	
//	
//	public static void main(String[] args) {
//	
//		Human manit = new Human();
//		Human ali = new Human();
//		
//		System.out.println(manit.iq);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.height);
//		
//		System.out.println(ali.iq);
//		System.out.println(ali.mascularStrength);
//		System.out.println(ali.height);
//		
//		manit.playing();
//		
//		ali.gyming();
//		ali.studying();
//		
//		System.out.println(manit.iq);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.height);
//		
//		System.out.println(ali.iq);
//		System.out.println(ali.mascularStrength);
//		System.out.println(ali.height);
//		
//	}	
//	
//	void studying() {
//		
//		iq = iq + 1;
//	}
//	
//	void playing() {
//		
//		height = height + 1;
//		mascularStrength++;
//	}
//	
//	void gyming() {
//		
//		mascularStrength++;
//		
//	}	
//}



















//public class FirstOOPS {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	public static void main(String[] args) {
//		
//		FirstOOPS f1 = new FirstOOPS();
//		
//		FirstOOPS f2 = new FirstOOPS();
//		
//		f1.print();
//		
//		f2.print();
//		
//	}	
//	
//	void print() {
//		
//		System.out.println(i);
//	}
//}













//public class FirstOOPS {
//
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	public static void main(String[] args) {
//		
//		FirstOOPS f1 = new FirstOOPS();
//		
//		f1.k = f1.i + f1.j;
//		
//		
//		System.out.println(f1.k);
//		
//		
//	}	
//}




//public class FirstOOPS {
//
//	int i = 4;
//	int j = 5;
//	
//	public static void main(String[] args) {
//		
//		FirstOOPS f1 = new FirstOOPS();
//		FirstOOPS f2 = new FirstOOPS();
//		
//		f2.j = 70;
//		
//		
//		System.out.println(f1.i);
//		System.out.println(f1.j);
//		
//		System.out.println(f2.i);
//		System.out.println(f2.j);
//		
//		f1.i = 10;
//		
//		System.out.println(f1.i);
//		
//	}
//}

