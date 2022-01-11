// 자바 메소드 호출에 대한 연습

/* import java.io.*;
	public class Main{
		static String fd = " -- 필드";
		static String md = " -- 메소드";
		
		public static void main(String[] args){
			System.out.println("자바 클래스의 구조");
			write(fd);
			write(md);
		}
		public static void write(String word){
			System.out.println(word);
		}
	}*/

//상수와 그 표현 방법 나타내기

/*import java.io.*;
public class Main{
	static long creditCardNumber = 1234_5678_9012_3456L;
	static long socialSecurityNumber = 999_99_9999L;
	static float pi = 3.14_15F;
	
	public static void main(String[] args){
		
		System.out.println("10");
		System.out.println("14");
		System.out.println("31");
		System.out.println(3.14F);
		System.out.println(3.1415D);
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
	}
}*/

//변수 선언과 초기 값 대입을 나타내기

/*import java.io.*;
public class Main{
	public static void main(String[] args){
		byte b = 0xA;
		short s = 32767;
		long distance = 150000000000L;
		double d = 15000E8D;
		
		int x, y = 10, z = 20;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(distance);
		System.out.println("1.5E11"); //15000E8D 이거는 1.5E11이 아닌 1.5E12임
		System.out.println(y);
		System.out.println(z);
	}
}*/

//필드 외 지역변수의 초기 값 알아보기

/*import java.io.*;
public class Main{
	static int def;
	static boolean bool;
	static String name;
	
	
	public static void main(String[] args){
		
		int n = 100;
		System.out.println(n);
		System.out.println(def);
		System.out.println(bool);
		System.out.println(name);
	}
}*/

// Scanner 사용한 다양한 자료형의 입력

/*import java.util.*;

public class Main {
	
	public static void Sum(int a){
		int i;
		int sum = 0;
		
		for(i = 1; i <= a; i++){
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		Sum(num);
	}
}*/

// 클래스 System의 필드 사용하기

/*import java.io.*;
import java.util.Scanner;

public class HelloStdIO {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("정수와 실수를 각각 입력하세요.");
		int i = input.nextInt();
		double d = input.nextDouble();
		System.out.println("i = " + i + " , d = " + d);
		System.out.println("에러는 없습니다.");
	}
}*/