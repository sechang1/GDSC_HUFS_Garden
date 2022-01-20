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