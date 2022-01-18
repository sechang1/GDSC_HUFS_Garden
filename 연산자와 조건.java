// 대입, 산술, 축약 대입 연산자

/*import java.io.*;

public class Main{
	public static void main(String[] args){
		
		int day, remainder;
		day = remainder = 365;
		int week = 365 / 7;
		
		System.out.format("1년은 %d일이며 %d주이다. %n", day, week); // 여기 format의 역할이 무엇인 모르겠다....
		System.out.println(remainder %= 7);
		System.out.println(remainder);
		
	}
}*/


//증가와 감소 연산자
/*import java.io.*;

public class Main{
   public static void main(String[] args){
      int m = 50, n = 30;
		 System.out.printf("%d %d %n", m--, n++);
		 System.out.printf("%d %d %n", m, n);
		 System.out.printf("%d %d %n", --m, ++n);
		 System.out.printf("%d %d %n", m, n);
   }
}*/


//유일한 삼항연산자인 조건 연산자를 이용한 짝홀 판정
/*import java.io.*;

public class Main{
   public static void main(String[] args){
      int point = 31;
		 String str = (point%2 == 0) ? "짝수" : "홀수";
		 System.out.printf("%d은 %s다. %n", point, str);
		 
		 double x = 3.45, y = 6.79;
		 double max = (x>y) ? x : y;
		 System.out.printf("%f와 %f 중에서 %f가 더 크다. %n", x, y, max);
   }
}*/


//표준입력의 두 정수를 이용한 관계 연산자
/*import java.io.*;
import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("두 정수를 입력 >> ");
      int x = input.nextInt();
      int y = input.nextInt();
      
      System.out.format("%d > %d -> %b %n", x, y, x>y);
      System.out.format("%d >= %d -> %b %n", x, y, x>=y);
      System.out.format("%d < %d -> %b %n", x, y, x<y);
      System.out.format("%d <= %d -> %b %n", x, y, x<=y);
      System.out.format("%d == %d -> %b %n", x, y, x==y);
      System.out.format("%d != %d -> %b %n", x, y, x!=y);
      
   }
}*/


// 논리 연산자
/*import java.io.*; 

public class Main{
   public static void main(String[] args){
      System.out.format("%5b && %5b | %b %n", true, true, true && true);
      System.out.format("%5b && %5b | %b %n", true, false, true && false);
      System.out.format("%5b && %5b | %b %n", false, true, false && true);
      System.out.format("%5b || %5b | %b %n", true, false, true|| false);
      System.out.format("%5b || %5b | %b %n", false, true, false || true);
      System.out.format("%5b || %5b | %b %n", false, false, false || false);
      System.out.format("!%5b | %5b %n", true, !true);
      System.out.printf("!false | true");
   }
}*/


//비트 논리 연산자
/*import java.io.*;

public class Main{
   public static void main(String[] args){
      int x = 4, y = 7;
		 System.out.format("%x & %8x -> %-8x %n", x, -1, x & -1);
		 System.out.format("%x & %8x -> %-8x %n", y, -1, y & -1);
		 
		 System.out.format("%x | %-8x -> %-8x %n", x, 0, x | 0);
		 System.out.format("%x | %-8x -> %-8x %n", y, 0, y | 0);
		 
		 System.out.format("(%x ^ 1) ^ 1 -> %1$-4d %n", x, (x^1) ^ 1);
		 
		 System.out.format("%1$-8x %1$-4d %n", (~x) + 1);
		 System.out.format("%1$-8x %1$-4d %n", (~y) + 1);
   }
}*/


//비트 이동 연산자
/*import java.io.*;

public class Main{
   public static void main(String[] args){
      int x = -24, y = 3;
		 System.out.format("%d(%s) >> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x), y, x>>3, Integer.toBinaryString(x>>3));
		 System.out.format("%d(%s) << %d 결과 %d(%s) %n", x, Integer.toBinaryString(x), y, x<<3, Integer.toBinaryString(x<<3));
		 System.out.format("%d(%s) >>> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x), y, x>>>3, Integer.toBinaryString(x>>>3));
   }
}*/


//비트 축약 대입 연산자
/*import java.io.*;

public class Main{
   public static void main(String[] args){
     int x = 3;
		 int y = 0xffff_ffff;
		 System.out.format("%d의 이진수: %s %n", y, Integer.toBinaryString(y));
		 System.out.println(x &= y);
		 System.out.println(x);
		 
		 int key = 120;
		 System.out.println(x ^= key);
		 System.out.println(x ^= key);  
   }
}*/


//비트 마스크
/*import java.io.*;

public class Main{
   public static void main(String[] args){
     int plus = 1, minus = -1;
		 System.out.format("%d의 이진수: %s %n", plus, Integer.toBinaryString(plus));
		 System.out.format("%d의 이진수: %s %n", minus, Integer.toBinaryString(minus));
		 System.out.format("%d의 이진수: %s %n", ~plus + 1, Integer.toBinaryString(minus));
		 
		 int x = 287956;
		 System.out.format("%d의 이진수: %s %n", x, Integer.toBinaryString(x));
		 int num = 4;
		 int mask = 1 << num-1;
		 System.out.format("%d의 오른쪽에서 %d번째 비트 값: ", x, num);
		 System.out.format("%d %n", ((x & mask) == 0) ? 0 : 1);
      
   }
}*/


//자동 형변환과 명시적 형변환
/*import java.io.*;

public class Main{
   public static void main(String[] args){
      byte bt = (byte) -129;
		 System.out.format("%d의 이진수: %s %n", -129, Integer.toBinaryString(-129));
		 System.out.format("%d의 이진수: %s %n", bt, Integer.toBinaryString(bt));
		 
		 int n = (int) (5.0/4.0);
		 System.out.println(n);
		 System.out.println(3/4);
		 System.out.println(3/4.0);
		 
		 double d = 3 + 4*2;
		 System.out.println(d);

   }
}*/


//연산자 우선순위
/*import java.io.*;

public class Main{
   public static void main(String[] args)
	 {
     System.out.println(3 + 4 >> 2 > 5);
		 System.out.println(((3 + 4) >> 2) > 5);
		 System.out.println(3*4 & 4-3 << 5);
		 System.out.println(3*4 & (4-3 << 5));
		 System.out.println((3*4 & 4-3) < 5);
		 System.out.println((1&0) != 1 && 3<<2 > 5);
   }
}*/


//자료형 변환 주의사항(0으로 나눌 때)
/*import java.io.*;

public class Main{
   public static void main(String[] args)
	 {
     short data1 = 32766;
     short data2 = 1;
		 
     short data3 = (short)(data1 + data2);
     short data4 = 32766 + 1;
     System.out.println(data3 + " " + data4);
		 
     System.out.println(0.0 / 0.0);
     System.out.println(3 / 0.0);
      
   }
}*/


//온도로 날씨 표현
/*import java.io.*;

public class Main{
   public static void main(String[] args){
      int degree = 30;
		 
		 if (30 <= degree)
			 System.out.println("날씨가 덥습니다.");
		 
		 System.out.println("날씨 예보였습니다.");

   }
}*/


// 600점 기준으로 합불합 판정
/*import java.io.*;

public class Main{
   public static void main(String[] args){
      int score = 65;
		 
		 if (60 <= score)
			 System.out.println("합격입니다.");
		 else
			 System.out.println("불합격입니다.");

   }
} */


//입력한 성적으로 학점 출력
/*import java.io.*;
import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      
		 Scanner input = new Scanner(System.in);
		 System.out.print("성적 입력: ");
		 int point = input.nextInt();
		 char grade;
		 
		 if (90 <= point)
			 grade = 'A';
		 else if (80 <= point)
			 grade = 'B';
		 else if (70 <= point)
			 grade = 'C';
		 else
			 grade = 'F';
		System.out.println("학점: " + grade);
      
   }
}*/


//중첩if문을 이용한 자동차면허필기 합격 판정
/*import java.io.*;

import java.util.Scanner;

public class Main{
   public static void main(String[] args)
	 {
      Scanner in = new Scanner(System.in);
      System.out.print("면허시험 종류선택 (1[1종] 또는 2[2종] 입력) >> ");
		  int type = in.nextInt();
		 System.out.print("필기 면허시험 점수 입력 >> ");
		 int score = in.nextInt();
		 
		 if (type == 1)
		 {
			 if (score >= 70)
				 System.out.println("1종 면허 시험 합격");
			 else
				 System.out.println("1종 면허 시험 불합격");
		 }
		 else if (type == 2)
		 {
			 if (score>=60)
				 System.out.println("2종 면허 시험 합격");
			 else
				 System.out.println("2종 면허 시험 불합격");
		 }
      
   }
}*/


//switch문을 이용한 두 실수 연산
/*import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double x, y;
		int op;
		Scanner input = new Scanner(System.in);
		System.out.print("두 실수 입력: ");
		x = input.nextDouble();
		y = input.nextDouble();
		System.out.print("번호 선택 1(+), 2(-), 3(*), 4(/): ");
		op = input.nextInt();
		
		switch (op) {
			case 1:
				System.out.printf("%.2f + %.2f = %.2f\n", x, y, x+y);
				break;
			case 2:
				System.out.printf("%.2f - %.2f = %.2f\n", x, y, x-y);
				break;
			case 3:
				System.out.printf("%.2f * %.2f = %.2f\n", x, y, x*y);
				break;
			case 4:
				System.out.printf("%.2f / %.2f = %.2f\n", x, y, x/y);
				break;
			default:
				System.out.printf("연산자 번호를 잘못 입력했습니다.\n");
				
		}
	}
}*/


//switch로 1년의 분기 확인
/*import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("년의 월(month)을 입력: ");
		int month = input.nextInt();
		
		switch (month){
			case 1:
			case 2:
			case 3:
				System.out.printf("%d월은 1분기입니다.\n", month);
				break;
			case 4:
			case 5:
			case 6:
				System.out.printf("%d월은 2분기입니다.\n", month);
				break;
				
			case 7:
			case 8:
			case 9:
				System.out.printf("%d월은 3분기입니다.\n", month);
				break;
				
			case 10:
			case 11:
			case 12:
				System.out.printf("%d월은 4분기입니다.\n", month);
				break;
				
			default :
				System.out.printf("월(month)을 잘못 입력했습니다.\n");
				
		}
	}
}*/


// 문자열을 사용하는 switch
/*import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nation = input.next();
		
		switch (nation) {
			case "한국" :
			case "일본" :
			case "중국" :
				System.out.printf("%s은(는) 아시아입니다.\n", nation);
				break;
			case "남아프리카" :
			case "수단" :
			case "모로코" :
				System.out.printf("%s은(는) 아프리카입니다.\n", nation);
				break;
			case "미국" :
			case "멕시코" :
			case "브라질" :
				System.out.printf("%s은(는) 아메리카입니다.\n", nation);
				break;
			case "스위스" :
			case "영국" :
			case "독일" :
				System.out.printf("%s은(는) 유럽입니다.\n", nation);
				break;
				
			default:
				System.out.printf("나라 이름을 잘못 입력하셨습니다.\n");
		}
	}
}*/


//여기까지 자바에서의 연산자 조건 수업을 듣고 정리한 내용입니다.