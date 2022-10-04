


//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steering Wheel of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inside abs of Polo..");
//	}
//	
//}
//
//public class SecondOOPS {
//
//	public static void main(String[] args) {
//		
//		Polo p = new Polo();//Here, object of Polo class is held by the reference variable of Polo class
//		
//		Car c = new Car();
//		
//		SecondOOPS s = new SecondOOPS();
//		
//		Car c1 = new Polo();//Object of child class can be held by the reference variable of Parent class 
//		
//		Polo p1 = new Car();//This is illegal to have object of parent class held by the reference
//							//variable of child class..
//	}
//}


//---------------Below code is for method-overriding
//overriding says, if you do not like any method of parent class the go for over-riding concept.
//since by default, you inherit the methods or variables of parent class in child class. In order to not
// inherit the method you do not like, create the same looking method in the child class such as 
//method' name, its return type and its argument-list is as same as the method present in parent class
//which you d not like...

//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steering Wheel of Car...");
//	}
//	void musicSystem() {
//		System.out.println("inside music system of car...");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inside abs of Polo..");
//	}
//	
//	void musicSystem() {
//		System.out.println("inside music system of Polo...");
//	}
//}
//
//public class SecondOOPS {
//
//	public static void main(String[] args) {
//		
//		Polo p = new Polo();
//		p.abs();
//		p.steeringWheel();       p.musicSystem();
//	}
//}



//class Car {
//
//	int i = 20;
//
//	void steeringWheel() {
//		System.out.println("inside steering Wheel of Car..."+i);
//	}
//}
//
//class Polo extends Car {
//
//	int j = 10;
//
//	void abs() {
//		System.out.println("inside abs of Polo.."+i);
//		System.out.println(j);//You can use variables of parent class anywhere in the child class...
//	}
//}
//
//public class SecondOOPS {
//
//	public static void main(String[] args) {
//		
//		Polo p = new Polo();
//		p.abs();
//		
//		p.i = 23;
//		p.j = 67;
//
//	}
//}



//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steering Wheel of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inside abs of Polo..");
//	}
//}
//
//class Benz extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl of Benz..");
//	}
//}
//
//public class SecondOOPS {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();
//
//		polo.steeringWheel();
//		polo.abs();
//
//		Benz benz = new Benz();
//		benz.steeringWheel();
//		benz.climateControl();
//
//	}
//}

//class Polo {
//	
//	void steeringWheel() {
//		System.out.println("inside SteerinGwheel of Polo..");
//	}
//	void abs() {
//		System.out.println("inside abs of Polo..");
//	}
//}
//
//class Benz {
//	
//	void steeringWheel() {
//		System.out.println("inside SteerinGwheel of Polo..");
//	}
//	void climateControl() {
//		System.out.println("inside climateControl of Benz..");
//	}
//}
//
//public class SecondOOPS {
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();
//		
//		polo.steeringWheel();
//		polo.abs();
//		
//		Benz benz = new Benz();
//		benz.steeringWheel();
//		benz.climateControl();
//		
//		
//	}	
//}

//class Human {
//	
//	double gpsLocation = 50.65;
//	int altitude;
//	
//	void walk() {
//		gpsLocation = gpsLocation + 2.76;
//	}
//	
//	void fly() {
//	
//		AirCraft cessna = new AirCraft();
//		int altitudeLocation = cessna.flying();
//		
//		altitude =  altitude + altitudeLocation;
//	}
//}
//
//class AirCraft {
//	
//	int flying() {
//		
//		return 35000;
//	}
//}
//
//
//public class SecondOOPS {
//	
//	public static void main(String[] args) {
//		
//		Human ali = new Human();
//		
//		System.out.println(ali.altitude);
//		
//		ali.fly();
//		
//		System.out.println(ali.altitude);
//		
//		
//	}	
//}

//class Human {
//	
//	double gpsLocation = 50.65;
//	
//	void walk() {
//		
//		gpsLocation = gpsLocation + 2.2;
//	}
//	void driving() {
//		
//		Car car = new Car();
//		
//		double myLocation = car.drivingByCar();
//		gpsLocation = gpsLocation + myLocation;			
//	}
//}
//
//class Car {
//	
//	double drivingByCar() {
//		
//		return 50.78;
//	}
//}
//
//public class SecondOOPS {
//	
//	public static void main(String[] args) {
//		
//		Human ali = new Human();
//		
//		ali.walk();
//		
//		ali.driving();
//		
//		System.out.println(ali.gpsLocation);
//	}	
//}

//class Human {
//	
//	int iq = 10;
//	double gpsLocation = 50.65;
//	
//	void studying() {
//		iq++;
//	}
//	
//	void travel() {
//		
//		gpsLocation = gpsLocation + 2.2;
//	}		
//}
//
//public class SecondOOPS {
//	
//	public static void main(String[] args) {
//		
//		Human ali = new Human();
//		
//		ali.studying();
//		
//		ali.travel();
//		
//		System.out.println(ali.iq);
//		System.out.println(ali.gpsLocation);
//		
//	
//	}	
//}

//class Human {
//	
//	int mascularStrength = 50;
//	
//	int gyming() {
//		mascularStrength++;
//
//		if(mascularStrength > 55) {
//			return 40;
//		}
//		else {
//			return 50;
//		}
//	}		
//}
//
//class Society {
//	
//	int fund;
//	String name;
//	String secretaryName;
//}
//
//public class SecondOOPS {
//	
//	public static void main(String[] args) {
//		
//		Human inan = new Human();
//		
//		int gymFee = inan.gyming();
//	
//		Society sf = new Society();
//		
//		System.out.println("The Society Fund righjt after innaugration "+sf.fund);
//		sf.fund = gymFee;
//		
//		System.out.println("The Society fund after Inan' gym fee computation "+sf.fund);
//		
//		System.out.println("After calling method "+inan.mascularStrength);
//		
//		Human stephen = new Human();
//		
//		int gymFee2 = stephen.gyming();
//		
//		sf.fund = sf.fund + gymFee2;
//		
//		System.out.println("The society fund after Stephen' fee calculated "+sf.fund);	
//	}	
//}

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
