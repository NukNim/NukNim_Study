package first;

import java.util.Scanner;

public class main {
	  public static void main(String[] args) {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      //System.out.print("시간:");
	      int h = scan.nextInt(); // h*60
	      //System.out.print("분:"); // m
	      int m = scan.nextInt();
	      if (h==0 && m<45) {
			h=24;
		}
	      int chang = h*60 + (m - 45);
	      int fh = chang/60; // 바뀐 시
	      int fm = chang%60; // 바뀐 분 


	         System.out.println( fh + " " + fm );
	         System.out.println("서로다른 테스트문 추가");

	      
	   }

}
