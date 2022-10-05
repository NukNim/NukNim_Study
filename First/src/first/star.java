package first;

import java.util.Iterator;
import java.util.Scanner;

public class star {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int line = sc.nextInt();
		
		int i,j;
		
		for(i=0;i<line;i++) {
			for(j=0;j<line - i-1;j++) {
				System.out.print(" ");	
			}
			for(j=0;j<2*i+1;j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
			
//		for(i=line;i>0;i--) {
//			for(j=line;j>i-1;j--) {
//				System.out.print(" ");	
//			}
//			for(j=2*(i-1)-1;j>0;j--) {
//				System.out.print("*");
//				
//			}
//			
//			System.out.println(" ");
//		}
		
		
		
		for(i=0;i<line;i++) {
			for(j=line;j<line+i+1;j++) {
				System.out.print(" ");	
			}
			for(j=line;j<2*(line-i);j++) {
				System.out.print("*");
				
			}
			
			System.out.println("");
		}
	
}
	
}
