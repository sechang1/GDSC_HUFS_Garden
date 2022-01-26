// 클래스를 상위클래스 두번째 하위 클래스로 하여 구현
/*import java.io.*;

class Vehicle {
   public String name = "차량";
   public double maxSpeed;
   public int seater;
}
public class Motor extends Vehicle {
   public String name = "자동차";
   public int displacement;

   public void printInfo() 
	 {
		 System.out.print("name: " + name);
		 System.out.println(", 최대속도: " + maxSpeed + " km");
		 System.out.print("정원: " + seater + " 명");
		 System.out.println(" ,배기량: " + displacement + " cc");
   }
   
   public static void main(String[] args) {
      Motor myCar = new Motor();
		 myCar.maxSpeed = 160;
		 myCar.seater = 5;
		 myCar.displacement = 1500;
      myCar.printInfo();      
   }
}*/


//차량의 하위클래스인 자동차를 위한 클래스
/*import java.io.*;
class Vehicle {
	public String name = "차량";	//이름
	public double maxSpeed; 	//최대 속도
	public int seater;			//정원
}
public class Motor extends Vehicle {
	public String name = "자동차"; 	//이름
	public int displacement; 		//배기량
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;//함수구현
	}
	public void setSeater(int seater) {
		this.seater = seater;//함수구현
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;//함수구현
	}

	public void printInfo() {
		System.out.print(super.name + ": " + this.name);
		System.out.println(", 최대속도: " + maxSpeed + " km");
		System.out.print("정원: " + seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc");

	}
	
	public static void main(String[] args) {
		Motor myCar = new Motor();
		myCar.setMaxSpeed(300);
		myCar.setSeater(2);
		myCar.setDisplacement(3500);
		myCar.printInfo();		
	}
}
*/

//자동차를 위한 생성자의 구현과 객체의 생성
/*import java.io.*;
class Vehicle {
	public String name = "차량"; 	//이름
	public double maxSpeed; 	//최대 속도
	public int seater;			//정원
	
		public Vehicle(){
		}

		public Vehicle(double maxSpeed, int seater){
			this.maxSpeed = maxSpeed;
			this.seater = seater;
		}
	}

public class Motor extends Vehicle {
	public String name = "자동차"; 	//이름
	public int displacement; 		//배기량
	
	public Motor() {
		super();	//생략 가능
	}
	
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		this.displacement = displacement;
	}
	
	public void printInfo() {
		System.out.print(super.name + ": " + this.name);
		System.out.println(", 최대속도: " + maxSpeed + " km"); 
		System.out.print("정원: " + seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc");
	}
	
	public static void main(String[] args) {
		Motor myCar = new Motor(300, 4, 5000);
		myCar.printInfo();
	}
}*/


//저축계좌를 표현한 클래스
/*import java.io.*;
class Account {
	public String name; 
	protected Date open;
	/*package*/ int number;
	private long balance;
	
	protected Account(String name, int number){
		this.name = name;
		this.number = number;
		this.open = new Date();
	}
	
	/*일반 메소드*/
	//입금 메소드
	public long deposit(long amount) {
		return balance += amount;
	}
	//출금 메소드
	public long withdraw(long amount) {
		return balance -= amount;
	}
	//계좌정보 및 잔액출력 메소드
	public long checkBalance() {
		System.out.println(name + ": 계좌번호 " + number + ", 잔액 " + balance);
		return balance;
	}	
}
public class SavingAccount extends Account {
	public double rates;	//이자율
	
	public SavingAccount(String name, int number, double rates){
		super(name, number);
		this.rates = rates;
	}
	
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);		//접근 가능
		System.out.println(myAccount.open);		//접근 가능		
		System.out.println(myAccount.number); 	//접근 가능
		//System.out.println(myAccount.balance);//접근 불가
	}
}*/


//동일한 패키지의 SavingAccount의 사용
/*import java.io.*;
class Account {
	public String name; 
	protected Date open;
	/*package*/ int number;
	private long balance;
	
	//생성자(동일 패키지, 하위 클래스에서 사용 가능)
	//protected로 생성자 구현
	
	/*일반 메소드*/
	//입금 메소드
	public long deposit(long amount) {
		return balance += amount;
	}
	//출금 메소드
	public long withdraw(long amount) {
		return balance -= amount;
	}
	//계좌정보 및 잔액출력 메소드
	public long checkBalance() {
		System.out.println(name + ": 계좌번호 " + number + ", 잔액 " + balance);
		return balance;
	}	
}
class SavingAccount extends Account {
	public double rates;	//이자율
	
	//생성자구현
	
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);		//접근 가능
		System.out.println(myAccount.open);		//접근 가능		
		System.out.println(myAccount.number); 	//접근 가능
		//System.out.println(myAccount.balance);//접근 불가
	}
}
public class AccountTest {
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("강민경", 123567834, 0.32);
		myAccount.deposit(50000);
		myAccount.withdraw(4000);
		myAccount.checkBalance();
		
		System.out.println();		//name접근 가능
		System.out.println();		//open접근 가능		
		System.out.println(); 	//number접근 가능
		//System.out.println(myAccount.balance);//접근 불가
	}
}*/


//참조형의 형 넓히기 변환
/*import java.io.*;
class Person {
	public String name;	//이름
	public long number;	//주민번호
	
	public Person(String name, long numebr){
		super();
		this.name = name;
		this.number = number;
	}

}
class Faculty extends Person {
	public String univ;
	public long number;
	
	public Faculty(String name, long number, String univ, long idNumber){
		super(name, number);
		this.univ = univ;
		this.number = idNumber;
	}


	public long getSNumber() {
		return super.number;
	}
}
class Staff extends Faculty {
	public String division;
	
	public Staff(String name, long number, String univ, long idNumber){
		super(name, number, univ, idNumber);
	}
}
public class UpCasting {
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + 2056432);

		Faculty f = new Faculty("김영태", 1145782, "연한대학교", 38764);
		Person p = f;
		System.out.print(p.name + " " + 1145782 + " ");
		//System.out.print(p.univ); //참조 불가능
		System.out.print(p.name + " " + 1145782 + " \n");
		System.out.println(f.univ + " " + f.number);
				
		
		Staff s = new Staff("김상기", 1187543, "강서대학교", 3456);
		s.division = "교학처";
		Person pn = s;
		Faculty ft = s;
		System.out.print(pn.name + " " + 1187543 + " ");
		System.out.print(ft.univ + " " + 3456 + " ");
		System.out.println(s.division);	
	}
}


//참조형의 형 좁히기 변환
/*import java.io.*;
class Person {
	public String name;	//이름
	public long number;	//주민번호
	
		//생성자구현

}
class Faculty extends Person {
	public String univ;
	public long number;
	
		//생성자구현


	public long getSNumber() {
		return super.number;
	}
}
class Staff extends Faculty {
	public String division;
	
	//생성자구현
}
public class DownCasting {
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she; 				//컴파일 오류
		//Faculty f1 = (Faculty) she; 	//실행 오류
				
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456);
		//Staff s = p;			//컴파일 오류
		Staff s = (Staff) p;
		s.division = "교학처";
		System.out.print(p.name + " " + p.number + " ");
		System.out.print(s.univ + " " + s.number + " ");
		System.out.println(s.division);	
	}
}


//연산자 intanceof 사용법
/*import java.io.*;
class Person {
	public String name;	//이름
	public long number;	//주민번호
	
		public Person(String name, long number){
			super();
			this.name = name;
			this.number = number;
		}

}
class Faculty extends Person {
	public String univ;
	public long number;
	
	public Faculty(String name, long number, String univ, long idNumber){
		super(name, number);
		this.univ = univ;
		this.number = idNumber;
	}


	public long getSNumber() {
		return super.number;
	}
}
class Staff extends Faculty {
	public String division;
	
	public Staff(String name, long number, String univ, long idNumber){
		super(name, number, univ, idNumber);
	}
}
public class Instanceof {
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		if (she instanceof Staff) { //instanceof사용
			Staff st1 = (Staff) she;
		} else {
			System.out.println("she는 Staff 객체가 아닙니다. ");			
		}
				
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456);
		if (p instanceof Staff) { //instanceof사용
			System.out.println("p는 Staff 객체입니다. ");			
			Staff st2 = (Staff) p;
		}
	}
}*/