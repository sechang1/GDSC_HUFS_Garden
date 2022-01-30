// 연산자 Fruit 사용법
/*import java.util.*;

public class Frute {
	public static void main(String[] args) {
		Frute f = new Frute();
		System.out.println(f instanceof Frute);
		System.out.println(f instanceof Apple);
		System.out.println(f instanceof Grape);
		
		Frute fa = new Apple();
		System.out.println(fa instanceof Frute);
		System.out.println(fa instanceof Apple);
		System.out.println(fa instanceof Grape);
		Apple a = new Apple();
		System.out.println(a instanceof Frute);
		System.out.println(fa instanceof Apple);
		//System.out.println(a instanceof Grape); //문법 오류
	}
}

class Apple extends Frute {
}

class Pear extends Frute {
}

class Grape extends Frute {
}*/


//printinfo() 메소드 오버라이딩
/*import java.io.*;
class Person {
   public String name;
   public long number;
   
   public Person(String name, long number) {
      super();
      this.name = name;
      this.number = number;
   }

   public void printInfo() {
      System.out.println("이름: " + name + " 주민번호: " + number);
   }
}
class Faculty extends Person {//extends 사용하라
   public String univ;
   public long number;
   
   public Faculty(String name, long number, String univ, long idNumber) {
      super(name, number);
      this.univ = univ;
      this.number = idNumber;
   }

   public long getSNumber() {
      return super.number;
   }
   
   public void printInfo() {//overriding
      System.out.print("이름: " + super.name + " 주민번호: " + super.number);
      System.out.println(" 대학: " + univ + " 직원번호: " + number);
      
   }
}
public final class Staff extends Faculty {//extends 사용하라
   public String division;
   
   public Staff(String name, long number, String univ, long idNumber, String division) {
      super(name, number, univ, idNumber);
      this.division = division;
   }

   //public final void printInfo() {
   public void printInfo() {//overriding
      System.out.print("이름: " + super.name + " 주민번호: " + super.getSNumber());
      System.out.print(" 대학: " + univ + " 직원번호: " + super.number);
      System.out.println(" 부서: " + division);
      
   }
   
   public void printFacultyInfo() {//상위클래스printInfo()를 불러보자.
      super.printInfo();
   }

   public static void main(String[] args) {
      Person she = new Person("이소라", 2056432);
      she.printInfo();

      Faculty i = new Faculty("김영태", 1145782, "연한대학교", 38764);
      i.printInfo();
            
      Staff he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
      he.printInfo();
      he.printFacultyInfo();
   }
}*/


//메소드 제정의
/*import java.io.*;
class Person {
   public String name;
   public long number;
   
   public Person(String name, long number) {
      super();
      this.name = name;
      this.number = number;
   }

   public void printInfo() {
      System.out.println("이름: " + name + " 주민번호: " + number);
   }
}
class Faculty extends Person {//extends 사용하라
   public String univ;
   public long number;
   
   public Faculty(String name, long number, String univ, long idNumber) {
      super(name, number);
      this.univ = univ;
      this.number = idNumber;
   }

   public long getSNumber() {
      return super.number;
   }
   
   public void printInfo() {//overriding
      System.out.print("이름: " + super.name + " 주민번호: " + super.number);
      System.out.println(" 대학: " + univ + " 직원번호: " + number);
      
   }
}
final class Staff extends Faculty {//extends 사용하라
   public String division;
   
   public Staff(String name, long number, String univ, long idNumber, String division) {
      super(name, number, univ, idNumber);
      this.division = division;
   }

   //public final void printInfo() {
   public void printInfo() {//overriding
      System.out.print("이름: " + super.name + " 주민번호: " + super.getSNumber());
      System.out.print(" 대학: " + univ + " 직원번호: " + super.number);
      System.out.println(" 부서: " + division);
      
   }
   
   public void printFacultyInfo() {//상위클래스printInfo()를 불러보자.
      super.printInfo();
   }
}
public class Overriding { 
   public static void main(String[] args) {
      Person she = new Person("이소라", 2056432);
      she.printInfo();

      Faculty i = new Faculty("김영태", 1145782, "연한대학교", 38764);
      i.printInfo();
            
      Person he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
      he.printInfo();
      Faculty f = (Faculty) he;
      f.printInfo();
      Staff s = (Staff) he;
      s.printInfo();
   }
}*/


//메소드 오버로딩
/*import java.io.*;
public class Sum {
	public int add(int a, int b) {//메소드 overloading사용하여 add()함수들을 구현해보자.
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add(int a[], int n) {
		int sum = 0;
		for (int i=0; i<n; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Sum adder = new Sum();
		System.out.println(adder.add(3, 6));
		System.out.println(adder.add(3, 6, 9));
		System.out.println(adder.add(new int[] {3, 6, 9, 12}, 4));	
	}
}*/


//정적 메소드의 오버로딩 구현
/*import java.io.*;
public class MyMath {
	double x, y;
	
	public MyMath(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double multiply() {
		return x * y;
	}
	double multiply(double a, double b) {//static 사용해서 메소드 만들기
		return a * b;
		//return x * y;				//static메소드 내부에서는 객체에 소속된 변수와 메소드 사용불가. 오류 발생
		//return this.x * this.y;	//오류 발생
	}
	
	public static void main(String[] args) {
		MyMath math = new MyMath(3.4, 6.7);
		System.out.println(math.multiply());
		System.out.println(math.multiply(3.4, 6.7));

	}
}*/


//추상클래스 Shaple형 객체의 추상 메소드 호출
/*import java.io.*;
abstract class Shape {
   protected double x, y;
   
   public Shape(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   public void drawCenter() {      //일반 클래스
      System.out.println("중심좌표 (x, y) = " + x + ", " + y);  
   }
   
   public abstract void draw();   //추상 클래스
}
class Circle extends Shape {
   double radius;
   
   public Circle(double x, double y, double radius) {
      super(x, y);
      this.radius = radius;
   }
   
   public void draw() {//추상메소트 구현
      super.drawCenter();
      System.out.printf("반지름: %f, ", radius);
      System.out.printf("원 면적: %f\n", radius*radius*Math.PI);
   }
}
class Rectangle extends Shape {
   double width;
   double height;
   
   public Rectangle(double x, double y, double width, double height) {
      super(x, y);
      this.width = width;
      this.height = height;
   }

   public void draw() {//추상메소드 구현
      super.drawCenter();
      System.out.printf("가로: %f, 세로: %f, ", width, height);
      System.out.printf("사각형 면적: %f\n", width * height);
   }
}
public class Abstarct {
   public static void main(String[] args) {
      Shape r = new Rectangle(2, 3, 3.67, 7.89);
      Shape c = new Circle(3, 4, 4.82);
      r.draw();
      c.draw();
      
      Shape sa[] = {new Rectangle(2.5, 3.1, 1.67, 3.89), new Circle(4.2, 3.8, 1.56)};
      sa[0].draw();
      sa[1].draw();
   }
}*/


//객체 HPPrint와 USBMemory의 사용
/*import java.io.*;
interface Connectable {
	public static final String name = "연결 방법: USB";
	public abstract void connect();
}
abstract class Device {
	public abstract void print(); 
}
class HPPrinter extends Device implements Connectable {
	public void print(){
		System.out.println("HP 프린터입니다.");
	}
	public void connect(){
		System.out.println(name + ", HP 프린터를 연결합니다.");
	}
	
}
class USBMemory extends Device implements Connectable {
	public void print(){
		System.out.println("삼성 USB 메모리입니다.");
	}
	public void connect(){
		System.out.println(name + ", USB 메모리를 연결합니다.");
	}
	
}
public class InterfaceTest {
	public static void main(String[] args) {
		Device pdev[] = {new HPPrinter(), new USBMemory()};
		
		pdev[0].print();
		pdev[1].print();
		((Connectable) pdev[0]).connect(); //pdev[0].connect() 불가능
		((Connectable) pdev[1]).connect(); //pdev[1].connect() 불가능
	}
}*/


//