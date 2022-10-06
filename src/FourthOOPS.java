//===================constructor starts from here===================
//if You notice, method and constructor will look same however, there is one point makes them different from
//each other which is constructor does not have return type but method has. In addition to this, 
//constructor name must be as same as the class name but methods name are not as class name...

class Human {//This Human class shows by how many ways I can create an object of Human class which is
				//based upon-- how many types of constructor class has. This Human class has 3 types of
				//constructors which are 1 no-arg and 2 parameterized constructor...
	
	int iq = 4;
	int mascularStrength = 20;
	
	Human(int value1, int value2) {
		
		iq = value1;
		mascularStrength = value2;
	}
	
	Human() {
		
	}
	
	Human(int value1) {
		iq = value1;
	}
	
}

class Main2 {
	
	public static void main(String[] args) {
		
		Human h1 = new Human(15, 35);//creating object with parameterized constructor
		
		System.out.println(h1.iq);
		
		System.out.println(h1.mascularStrength);
		
		Human h2 = new Human();//creating object with no-arg constructor...
		
		System.out.println(h2.iq);
		System.out.println(h2.mascularStrength);
		
		Human h3 = new Human(100);
		System.out.println(h3.iq);
		System.out.println(h3.mascularStrength);
	}
}


//class Human {
//	
//	int iq = 4;
//	int mascularStrength = 20;
//	
//	Human(int value1, int value2) {
//		
//		iq = value1;
//		mascularStrength = value2;
//	}
//	
//}
//
//class Main2 {
//	
//	public static void main(String[] args) {
//		
//		Human h1 = new Human(15, 35);
//		
//		System.out.println(h1.iq);
//		
//		System.out.println(h1.mascularStrength);
//		
//		Human h2 = new Human();//This is illegal since the no-arg constructor is given by default
//								//only and only if there is no other constructor defined. If you see in the 
//								//Human class above, there you would notice that the parameterized
//								//constructor is already defined. That is why, no-arg constructor is 
//								//not given to you automatically. So in this program, the only way to
//								//create an object of Human class is to create object with parameterized 
//								//constructor. If you want to create object of Human class from the 
//								//no-arg constructor also, then you would have to define no-arg 
//								//constructor manually but do not expect the system would give you this 
//								//now. Next program will show-case the use of no-arg as well as parameterized 
//								//constructor altogether...
//		
//	}
//}



//class Human {
//	
//	int iq = 4;
//	int mascularStrength = 20;
//	
//	Human(int value1, int value2) {
//		
//		iq = value1;
//		mascularStrength = value2;
//	}
//	
//}
//
//class Main2 {
//	
//	public static void main(String[] args) {
//		
//		Human h1 = new Human(15, 35);
//		
//		System.out.println(h1.iq);
//		
//		System.out.println(h1.mascularStrength);
//		
//		
//	}
//}


//class Human {
//	
//	int iq = 4;
//	int mascularStrength = 20;
//	
//	Human(int value) {//This is parameterized constructor which is not given by default, You have to create one
//						//by yourself
//		
//		iq = value;
//	}
//	
//}
//
//class Main2 {
//	
//	public static void main(String[] args) {
//		
//		Human h1 = new Human(15);
//		
//		System.out.println(h1.iq);
//		
//		System.out.println(h1.mascularStrength);
//		
//		
//	}
//}


//class Human {
//	
//	int iq = 4;
//	int mascularStrength = 20;
//	
//	Human() {// This is no-argument constructor which is usually given by default and we usually do not
//				//create no-arg constructor. So I made this no-ag constructor just to show you that
//				//no-arg constructor actually run but it does not make any difference whether you
//				//declare it manually or let the system give it to you automatically...
//		System.out.println("inside no-arg constructor...");
//	}
//	
//}
//
//class Main2 {
//	
//	public static void main(String[] args) {
//		
//		Human a = new Human();
//		
//		System.out.println(a.iq);
//		System.out.println(a.mascularStrength);
//		
//	}
//}




//class Human {
//	
//	int iq = 4;
//	int mascularStrength = 20;
//	
//}
//
//class Main2 {
//	
//	public static void main(String[] args) {
//		
//		Human a = new Human();//"new Human();" R.H.S of this statement is used to create an object of Human class
//							//by no-argument constructor which is given by default by the system.
//							//If you are creating an object with the help of no-arg constructor then 
//							// your object' instance variables will be given the default values as
//							//author of the class decided at the time of class designing...In this case,
//							//IQ of Human will be given will be given 4 and mascularStrength will be given
//							//20 every time you create object/s with the help of no-arg constructor
//		
//		System.out.println(a.iq);
//		System.out.println(a.mascularStrength);
//		
//	}
//}
























//===============interface starts from here==========

//interface IBMer {
//	
//	int i = 5;//variables of an interface are implicitly "public", "static", "final". So make sure that
//				//you do not re-assign any value to interface variables 
//	
//	void formalShirt();
//}
//
//class Employee implements IBMer {//Implementation class
//
//	public void formalShirt() {
//		System.out.println("Hello formalShirt..");
//	}
//	
//}
//
//public class FourthOOPS {
//	
//	public static void main(String[] args) {
//		
//		Employee emp = new Employee();
//		
//		IBMer.i = 100;// This is illegal to re-assign any new value to interface variables... 
//		
//		System.out.println(emp.i);// This is legal to call interface variable on an object however
//									// is not required...as you can see the yellow line under the "emp.i"
//									//in System.out.println();
//		
//		System.out.println(IBMer.i);//I am trying to access the variable of an interface by its interface
//									//name since the variables in an interface are static so its is legal
//									//to call variables by its interface name... 
//	}
//
//}



//interface IBMer {
//	
//	void formalShirt();
//	void formalTrousers();
//}
//
//class Employee implements IBMer {//Implementation class
//
//	public void formalShirt() {//this is the right way to implement an interface since you have marked
//								//the over-riding method as public
//		System.out.println("Hello formalShirt..");
//	}
//	public void formalTrousers() {
//		System.out.println("Hello formalTrousers..");
//	}
//	
//	void phone() {
//		System.out.println("Inside phone...");
//	}
//}
//
//public class FourthOOPS {
//	
//	public static void main(String[] args) {
//		
//		Employee emp = new Employee();
//		
//		emp.formalShirt();    emp.formalTrousers();     emp.phone();
//		
//		IBMer obj = new Employee();//This is legal since I am holding the object of implementation class
//									//in the reference variable of interface type... 
//	}
//
//}



//interface IBMer {
//	
//	void formalShirt();
//	void formalTrousers();
//}
//
//class Employee implements IBMer {//Implementation class
//
//	void formalShirt() {//This is illegal over-riding since the access modifier of the over-riding
//						//method is default but the access modifier of an over-ridden method is public
//						//implicitly which you can not see because the methods in an interface are 
//						//by default public and abstract so while giving implementation to an interface
//						//we will make sure that all the methods in implementation class are marked public
//						//else will get error... Above example will show you the correct way of 
//						//giving implementation to an interface...
//		System.out.println("Hello formalShirt..");
//	}
//	void formalTrousers() {
//		System.out.println("Hello formalTrousers..");
//	}
//	
//}
//
//public class FourthOOPS {
//	
//	public static void main(String[] args) {
//		
//		
//	}
//
//}



//interface IBMer {
//	
//	void formalShirt();//implicitly all the interface' methods are implicitly abstract
//	void formalTrousers();
//	void formalShoes();
//	
//	//interface is as same as class but the only difference is - you are not supposed to give implementation
//	//to any of its methods...
//	//interface is a keyword and you can not instantiate an interface or can not create object of an
//	//interface but you can use interface as a reference variable i.e you can hold the object of 
//	//implementation class in the reference variable of interface...
//}
//
//
//
//public class FourthOOPS {
//	
//	public static void main(String[] args) {
//		
//		IBMer ibm = new IBMer();//This statement is illegal since you can not create an object of an
//								//interface but the L.H.S is legal since you can use an interface for
//								//the reference variable purpose...
//	}
//
//}
