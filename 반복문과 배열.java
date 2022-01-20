// 1에서 10까지 출력하는 while문
/*import java.io.*;

public class Main {
   public static void main(String[] args) throws Exception {
      int i = 1;
      
		 while (i<=10)
		 {
			System.out.printf("%d ", i);
			 i++;
		 }
			
   }
}*/


// 1에서 10까지 출력하는 do while문
/*import java.io.*;
class Main {
   public static void main(String[] args) {
      int i = 1;
      
      do{
         System.out.print(i++ + " ");
      }while(i<=10);
		 
		 System.out.println();
   }
}*/


//1에서 5까지의 합을 출력하는 for문
/*import java.io.*;
public class Main {
   public static void main(String[] args) {
      
		 int i = 1;
		 for (i = 1;i<=10;i++)
		 {
			 System.out.print(i + " ");
		 }
		 System.out.println();
		 
		 int sum = 0;
		 
		 for(i = 1, sum = 0; i <= 10; sum += i, i++);
		 System.out.printf("합: %d%n", sum);
		 
		 int j = 1;
		 int total = 0;
		 
		 for (j = 1; j<=5; j++)
		 {
			 total += j; 
			 System.out.printf("1에서 %d까지 합은 %d입니다.%n", j, total);
		 }
   
   }
}*/


//2단에서 5단까지의 구구단 출력
/*import java.io.*;

public class Main {
   public static void main(String[] args) 
	 {
      for(int i=2;i<=5;i++)
			{
         for(int j=1;j<10;j++)
				 {
            System.out.printf("%d*%d = %2d ",i,j,i*j);
         }
				System.out.println();
      }
   }
}*/


//1에서 10까지 출력하는 도중 7을 출력하고 반복을 종료
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
		 
		 int i = 1;
		 
		 for (i = 1; i <=10; i++)
		 {
			 System.out.print(i + " ");
			 if (i == 7)
				 break;
		 }
   }
}*/


//1~10까지 중 3의 배수가 아닌 수 출력 for 문
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
      
      for(int i=1;i<=10;i++)
			{
         if(i%3 != 0) 
            System.out.print(i + " ");
      }
		 System.out.println();
   }
}*/


//배열의 선언과 생성, 그리고 필드 length 사용
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
      int[] month;
      double[] values;
      
      month = new int[4];
      values = new double[3];
      
      System.out.println(month.length);
      System.out.println(values.length);
      
      char[] ch = new char[6];
      float[] data = new float[7];
      
      System.out.println(ch.length);
      System.out.println(data.length);
   }
}*/


// 배열의 선언과 생성 그리고 배열 원소 참조
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
      double[] points = new double[3];
      
      points[0] = 28;
      points[1] = 29;
      points[2] = 30;
      
      System.out.println(points.length);
      System.out.println(points[0]);
      System.out.println(points[1]);
      System.out.println(points[2]);
   }
}*/


//배열 초기화 활용
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
		 
      double dScore[] = {2.78, 4.28, 3.18};
      String sbjt[] = {"국어", "영어", "수학"};
      
      System.out.println(sbjt[0] + ": " + dScore[0]);
      System.out.println(sbjt[1] + ": " + dScore[1]);
      System.out.println(sbjt[2] + ": " + dScore[2]);
   }
}*/


//배열 선언 이후 배열 초기화 활용
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
      
		 int score[];
      
      score = new int[] {2,4,7};
      System.out.printf("%d %d %d %n",score[0],score[1],score[2]);
      score = new int[] {23,46,78};
      System.out.printf("%d %d %d %n",score[0],score[1],score[2]);
   }
}*/


//배열을 복사하는 System.arraycopy()
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
		 
		 int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		 int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		 
		 for(int i = 0; i<copyFrom.length; i++)
			 System.out.print(copyFrom[i] + " ");
	 }
}*/


//이차원 배열 활용
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
		 
		 int mtrx[][];
		 
		 mtrx = new int[2][3];
		 
		 mtrx[0][0] = 3; mtrx[0][1] = 5; mtrx[0][2] = 0;
     mtrx[1][0] = 7; mtrx[1][1] = 2; mtrx[1][2] = 8;
		 
		 for(int i = 0; i < mtrx.length; i++){
			 for(int j = 0; j < mtrx[i].length; j++){
				 System.out.printf(mtrx[i][j] + " ");
			 }
			System.out.println();
		 }
   }
}*/


//이차원배열의 초기화 활용 1

//





//이차원배열의 초기화 활용 2
/*import java.io.*;

public class Main {
   public static void main(String[] args) {
      String name[] = {"C++","Java","C#"};
      
      for(String str : name)
         System.out.print(str + " ");
      System.out.println();
      
      String data[][] = {{"홍","길동"},{"최","경","주"},{"Tiger","Woods"}};
      
      for(int i =0; i<data.length;i++){
         for(int j=0;j<data[i].length;j++)
            System.out.print(data[i][j]+" ");
         System.out.println();
      }
   }
}*/


//배열 크기를 표준입력으로 처리
/*import java.io.*;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("배열 크기 입력 > ");
      int size = input.nextInt();
      
      int[] score = new int[size];
		 
		 System.out.print("성적 입력 > ");
		 for (int i=0; i < score.length; i++)
			 score[i] = input.nextInt();
		 
		 for (int value: score)
			 System.out.print(value + " ");
      
   }
}*/



//여기는 객체지향과 클래스 부분(반복과 배열 부분이 아님)

//클래스 CreditCard의 객체 생성과 사용
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


//
