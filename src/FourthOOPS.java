//===============interface starts from here==========

interface IBMer {
	
	int i = 5;//variables of an interface are implicitly "public", "static", "final". So make sure that
				//you do not re-assign any value to interface variables 
	
	void formalShirt();
}

class Employee implements IBMer {//Implementation class

	public void formalShirt() {
		System.out.println("Hello formalShirt..");
	}
	
}

public class FourthOOPS {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		IBMer.i = 100;// This is illegal to re-assign any new value to interface variables... 
		
		System.out.println(emp.i);// This is legal to call interface variable on an object however
									// is not required...as you can see the yellow line under the "emp.i"
									//in System.out.println();
		
		System.out.println(IBMer.i);//I am trying to access the variable of an interface by its interface
									//name since the variables in an interface are static so its is legal
									//to call variables by its interface name... 
	}

}



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
