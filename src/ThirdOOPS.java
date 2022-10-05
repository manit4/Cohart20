//=============abstract starts here==============
//abstract is a keyword which can be used either with the class or with the method...
//if you do not want to give implementation to any method then mark it as abstract. In addition to this,
	//make sure that the class is also marked abstract if any of the methods is declared abstract...
//You can declare any class abstract even though that abstract class does not have any method abstract 
//and the reason is that you do not want to create object or let others to create object out of that class..

abstract class Car1 {
	
	void steeringWheel() {
		System.out.println("inside steeringWheel of car..");
	}
	void musicSystem() { 
		System.out.println("inside musicSystem of Polo..");
	}
}

class Polo1 extends Car1 {
	
	void abs() {
		System.out.println("inside abs of polo");
	}	
}

class Main1 {
	
	public static void main(String[] args) {
		
		
	}
}



//abstract class Car1 {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of car..");
//	}
	//void musicSystem();
//}
//
//class Polo1 extends Car1 {
//	
//	void abs() {
//		System.out.println("inside abs of polo");
//	}
//	
//	void musicSystem() { 
//		System.out.println("inside musicSystem of Polo..");
//	}
//	
//}
//
//class Main1 {
//	
//	public static void main(String[] args) {
//		
//		Polo1 p = new Polo1();
//		Car1 c = new Polo1();//We know that abstract class can not be instantiated and here I am creating
//							//object of implementation class but the object is being held by the abstract 
//							//class, that means the object is of implementation class but the object is
//							//held by the implementation class...
//	}
//}


//abstract class Car1 {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of car..");
//	}
//	abstract void musicSystem();
//}
//
//class Polo1 extends Car1 {
//	
//	void abs() {
//		System.out.println("inside abs of polo");
//	}
//	
//	void musicSystem() {//This musicSystem method of car1 class is being implemented by Polo. Its mandatory
//						//for the extending/child/implementing class to give implementation to all the 
//						//abstract methods of parent abstract class...  
//		System.out.println("inside musicSystem of Polo..");
//	}
//	
//}
//
//class Main1 {
//	
//	public static void main(String[] args) {
//		
//		Polo1 p = new Polo1();
//		Car1 c = new Polo1();//We know that abstract class can not be instantiated and here I am creating
//							//object of implementation class but the object is being held by the abstract 
//							//class, that means the object is of implementation class but the object is
//							//held by the implementation class...
//	}
//}



//abstract class Car1 {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of car..");
//	}
//	abstract void musicSystem();
//}
//
//class Main1 {
//	
//	public static void main(String[] args) {
//		
//		Car1 car = new Car1();//This is illegal since you can not create object of an abstract class...
//	}
//}



//----------------------final-----------------

//------------final concept starts here--------------
//Variables declared as final can not be updated...
//methods declared final in Parent class can not be over-ridden by the child class... 
//If any class id declared final, that means that final class can not be extended by any class...

//final class Car1 {
//	
//	final void steeringWheel() {
//		System.out.println("inside steeringWheel of Car1");
//	}
//}
//
//class Polo1 extends Car1 {//Extending final class is illegal
//	
//	void abs() {
//		System.out.println("inside abs..");
//	}
//}
//
//class Main1 {
//	
//	public static void main(String[] args) {
//		
//		Polo1 p = new Polo1();
//		
//		p.abs();
//					
//	}
//}



//class Car1 {
//	
//	final void steeringWheel() {
//		System.out.println("inside steeringWheel of Car1");
//	}
//}
//
//class Polo1 extends Car1 {
//	
//	void abs() {
//		System.out.println("inside abs..");
//	}
//
//	void steeringWheel() {//This method over-riding is illegal since you can not override the method made
//							//final in parent class.. if you check the method in parent class declared
//							//final
//		System.out.println("inside steeringWheel of Polo1");
//	}
//}
//
//class Main1 {
//	
//	public static void main(String[] args) {
//		
//		Polo1 p = new Polo1();
//		
//		p.abs();
//		p.steeringWheel();			
//	}
//}




//class Car1 {
//
//	final int i = 4;
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel");
//	}
//}
//
//class Main1 {
//	
//	public static void main(String[] args) {
//		
//		Car1 c = new Car1();
//		
//		c.i = 10;//This statement is illegal since the variable I am trying to update is declared final
//				//in class car1...Variables declared as final can not be updated...
//		
//		System.out.println(c.i);		
//	}
//}


//===================final ends here------------------------



//import java.io.PrintStream;
//
//class A {
//	
//	void print() {
//		System.out.println();
//	}
//	void print(int i) {
//		System.out.println(i);
//	}
//	void print(String name) {
//		System.out.println(name);
//	}
//	void print(double d) {
//		System.out.println(d);
//	}
//}
//
//
//public class ThirdOOPS {
//
//	public static void main(String[] args) {
//
//		PrintStream pw = System.out;//out is the static variable in System class holding the object of PrintStream class
//									//and all the println() methods (over-loaded methods are in PrintStream class
//		pw.println(100);
//
//	}
//
//}





//-----------below is the code for the overloading---------
//Overloading says, if you have multiple methods with same name but with different parameter/argument list
//irrespective of return-types...

//Difference between Over-riding and over-loading is:
//over-riding says, if you have same methods in child as well as in parent class. Same method means,
//method name, method argument list and return type should be same in child  as well as Parent class...


//class ArithmeticOperation {
//
//	void add(int a, int b) {
//
//		System.out.println(a + b);
//	}
//	
//	void add(int a, int b, int c) {
//		
//		System.out.println(a + b + c);
//	}
//	
//	void add(int a, double b) {
//		
//		System.out.println(a + b);
//	}	
//}
//
//
//public class ThirdOOPS {
//
//	public static void main(String[] args) {
//
//		ArithmeticOperation ao = new ArithmeticOperation();
//		
//		ao.add(100, 12.56);
//
//	}
//
//}
