// 클래스 CreditCard 객체 생성과 사용
/*import java.util.*;

public class Main{
	
	private long number;
	public String owner;
	
	public static void main(String[] args){
		
		Main myCard = new Main();
		
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "유 재석";
		
		System.out.print("카드 번호: " + myCard.number);
		System.out.print(", 카드소유자: " + myCard.owner);
		
		
		
	}
}*/

// 신용카드를 추상화하여 여러 필드와 메소드로 구성된 클래스
/*import java.util.*;

public class Main{
	public long number;
	public String owner;
	public int point;
	public int balance; // 현재까지 사용액
	
	public void use(int amount){
		balance += amount;
		System.out.println("현재 카드 사용액: " + balance);
	}
	public void payBill(int amount){
		balance -= amount;
		System.out.print("지불액: " + amount);
		System.out.println(", 지불 잔액: " + balance);
		addPoint(amount);
	}
	private void addPoint(int amount){
		point += amount/1000;
		System.out.print("보너스 포인트: " + point);
	}
	
	public static void main(String[] args){
		Main myCard = new Main();
		
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "이수강";
		
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
	}
}*/


//클래스 CreditCard의 객체 생성과 메소드 활용
/*import java.io.*;

class CreditCard{
   private long number;
   public String owner;
   private int point;
   private int balance;
   
   public void use(int amount){
      balance += amount;
      System.out.println("현재 카드 사용액: " + balance);
   }
   public void payBill(int amount)
	 {
      balance -= amount;
      System.out.println("지불액: "+amount+", 지불 잔액: " + balance );
      addPoint(amount);
   }
   private void addPoint(int amount){
      point += amount/1000;
      System.out.println("보너스 포인트: " + point);
   }
}
public class Main {
   public static void main(String[] args) {
      CreditCard yourCard = new CreditCard();
      yourCard.owner = new String("이민정");
      
      System.out.println("카드소유자: " + yourCard.owner);
      yourCard.use(150000);
      yourCard.use(100000);
      yourCard.payBill(100000);
   }
}*/


//geteer와 setter를 구현한 클래스
/*import java.io.*;

public class Main {
   private long number;
   public String owner;
   private int point;
   private int balance;
   
   public void use(int amount){
      balance += amount;
      System.out.println("현재 카드 사용액: " + balance);
      
   }
   public void payBill(int amount){
      balance -= amount;
      System.out.println("지불액: "+amount+", 지불 잔액: " + balance );
      addPoint(amount);
   }
   private void addPoint(int amount){
      point += amount/1000;
      System.out.println("보너스 포인트: " + point);
   }
   public long getNumber(){
      return number;
   }
   public void setNumber(long number){
      if(number < 1000_0000_0000_0000L){
         System.err.println("잘못된 카드 번호입니다.");
         return;
      }
      this.number = number;
   }
   public int getPoint(){
      return point;
   }
   public void setPoint(int point){
      this.point = point;
   }
   public int getBalance() {
      return balance;
   }
   public void setBalance(int balance){
      this.balance = balance;
   }
	public static void main(String[] args){
		
	}
}*/


//클래스 객체생성과 getter와 setter 사용
/*import java.io.*;

class CreditCard {
   private long number;
   public String owner;
   private int point;
   private int balance;
   
   public void use(int amount){
      balance += amount;
      System.out.println(owner+"카드 사용액: " + balance);
      
   }
   public void payBill(int amount){
      balance -= amount;
      System.out.println(owner+"지불액: "+amount+", 지불 잔액: " + balance );
      addPoint(amount);
   }
   private void addPoint(int amount){
      point += amount/1000;
      System.out.println(owner + "보너스 포인트: " + point);
   }
   public long getNumber(){
      return number;
   }
   public void setNumber(long number){
      if(number < 1000_0000_0000_0000L){
         System.err.println("잘못된 카드 번호입니다.");
         return;
      }
      this.number = number;
   }
   public int getPoint(){
      return point;
   }
   public void setPoint(int point){
      this.point = point;
   }
   public int getBalance() {
      return balance;
   }
   public void setBalance(int balance){
      this.balance = balance;
   }
}
public class Main {
   public static void main(String[] args) {
      CreditCard parkCard = new CreditCard();
      CreditCard leeCard = new CreditCard();
      
      parkCard.owner = "박지성";
      parkCard.setNumber(2378_7643_7634_9825L);
      leeCard.owner = "이민정";
      leeCard.setNumber(6456_9876_4521_6838L);
      
      parkCard.use(100000);
      leeCard.use(15000);
      parkCard.payBill(50000);
      leeCard.payBill(10000);
      System.out.println(parkCard.owner + ":" + parkCard.getNumber());
      System.out.println("카드대금 잔액: "+parkCard.getBalance());
      System.out.println("카드포인트: "+parkCard.getPoint());
      System.out.println(leeCard.owner + ":" + leeCard.getNumber());
      System.out.println("카드대금 잔액: "+ leeCard.getBalance());
      System.out.println("카드포인트: "+leeCard.getPoint());
    
   }
}*/


//학생을 위한 클래스의 생성자 구현과 객체 생성
/*import java.io.*;

public class Student {
   public String name;
   public void print()
	 {
      System.out.println("학생이름: " + this.name);
   }
   
   public static void main(String[] args) {
      Student j = new Student();
      j.name = "김민정";
      System.out.println(j.name);
   }
}*/


//학생을 위한 클래스의 여러 생성자 구현과 객체 생성
/*import java.io.*;

public class Student {
   public String name;
   public Student()
	 {
	 }

   public Student(String name)
	 {
      this.name = name;
   }
   public void print() 
	 {
      System.out.println("학생이름: " + this.name);
   }
	
   public static void main(String[] args) {
      Student lee =new Student("이승훈");
      lee.print();

      Student kim = new Student();
      kim.name = "김다빈";
      kim.print();
   }
}*/


//클래스 CreditCard의 여러 생성자 활용
/*import java.io.*;

public class CreditCard {
   public String owner;
   private long number;
   
   public CreditCard(String owner)
	 {
      this.owner = owner;
   }
   public CreditCard(long number)
	 {
      this.number = number;
   }
   public CreditCard(String owner,long number)
	 {
      this(owner);
      this.number = number;
   }
   public long getNumber()
	 {
      return number;
   }

   public static void main(String [] args) {
      CreditCard card1 = new CreditCard("권해동");
      CreditCard card2 = new CreditCard(3452_4587_2345_9845L);
      card2.owner = "권순미";
      CreditCard card3 = new CreditCard("권다혜", 5638_8627_8623_8249L);
            
      System.out.println("card1: " + card1.owner + " " + card1.getNumber());
      System.out.println("card2: " + card2.owner + " " + card2.getNumber());
      System.out.println("card3: " + card3.owner + " " + card3.getNumber());
   }
}*/
//클래스 Account의 객체 생성과 사용
/*import java.io.*;

public class Account {
   public String owner;
   public long balance;
   
   public Account(String owner) 
	 {
      this.owner = owner;
   }
   public Account(long balance) 
	 {
      this.balance = balance;
   }
   public Account(String owner, long balance) 
	 {
      this(owner);
      this.owner = owner;
      this.balance = balance;
   }

   public static void main(String[] args) {
      Account act1 = new Account("최여진");
      Account act2 = new Account(1000000);
      act2.owner = "홍혜빈";
      Account act3 = new Account("신세경", 200000);
      
      System.out.printf("act1: %s %d %n",act1.owner,act1.balance);
      System.out.printf("act2: %s %d %n",act2.owner,act2.balance);
      System.out.printf("act3: %s %d %n",act3.owner,act3.balance);
      
   }
}*/


//자동차를 표현한 클래스
/*import java.io.*;

public class Car {
   private int maxSpeed;
   public String brandName;
   public int speed;

   public Car(String brandName)
	 {
      this.brandName = brandName;
   }
   public Car(String brandName,int maxSpeed)
	 {
      this(brandName);
      this.maxSpeed = maxSpeed;
   }
   public int speedUp()
	 {
      return speed += 30;
   }
   public int speedDown()
	 {
      return speed -= 20;
   }
   public int getMaxSpeed()
	 {
      return maxSpeed;
   }
   public void setMaxSpeed(int maxSpeed)
	 {
      this.maxSpeed = maxSpeed;
   }
   
   
   public static void main(String[] args) {
      Car mycar = new Car("포르쉐", 300);
      mycar.speedUp();
      mycar.speedUp();
      System.out.print("차종: " + mycar.brandName);
      System.out.print(", 최고 속도: " + mycar.getMaxSpeed());
      System.out.println(", 현재 속도: " + mycar.speedDown());
   }
}*/


//클래스 Circle에서 PI를 정적으로 선언하여 사용
/*import java.io.*;

public class Circle {
   public double radius;
   public static final double PI = 3.141592;
   
   public Circle(double radius)
	 {
      this.radius = radius;
   }
   public double getArea()
	 {
      return radius * radius * PI;
   }
   public double getRound()
	 {
      return radius * 2 * PI;
   }
   public void print()
	 {
      System.out.printf("반지름이 %.2f인 원의 면적은 %.2f이고, 둘레 길이는 %.2f이다. %n",radius,getArea(),getRound());
   }
   

   public static void main(String[] args) 
	 {   
      Circle c1 = new Circle(2.78);
      c1.print();
      
      Circle c2 = new Circle(5.25);
      c2.print();
   }
}*/


//지역변수의 상수선언
/*import java.io.*;
public class Const {
	public static void main(String[] args) {
		final int maxSize = 5;
		
		int data[] = new int[maxSize];
		System.out.println("배열 크기: " + data.length);
		System.out.println("배열 크기: " + maxSize);
	}
}*/


//클래스 Circle에서 면적과 원의 둘레 길이
/*import java.io.*;

public class Circle {
   public double radius;
   public static final double PI = 3.141592;

   public Circle(double radius)
	 {
      this.radius = radius;
   }
   
   public double getArea()
	 {
      return radius * radius * PI;
   }
   public double getRound()
	 {
      return radius * 2 * PI;
   }

   public void print()
	 {
      System.out.printf("반지름이 %.2f인 원의 면적은 %.2f이고, 둘레 길이는 %.2f이다. %n",radius,getArea(),getRound());
   }
   
   public static void main(String[] args) {   
      Circle c1 = new Circle(2.78);
      c1.print();
      
      Circle c2 = new Circle(5.25);
      c2.print();
   }
}*/


//