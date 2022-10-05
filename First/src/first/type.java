package first;

import java.util.Scanner;

public class type {
	
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
		
		int line = sc.nextInt();
		
		int i,j;
		
		
		for(i=line;i>0;i--) {
			for(j=line;j>i-1;j--) {
				//System.out.print(" ");
				System.out.print(j);
			}
			for(j=2*(i-1)-1;j>0;j--) {
				System.out.print("*");
				//System.out.print(i);
				
			}
			
			System.out.println(" ");
		}
		
		
		
	}
}
