package first;

import java.util.Scanner;

public class HellowWorld { 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		System.out.print("c : ");
		int c = scan.nextInt();
		
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if (a>b && a>c) {
			max =a;
			if (b>c) {
				mid =b;
				min =c;
			}else {
				mid =c;
				min =b;
			}
		}else if(b>a && b>c) {
			max =b;
			if (a>c) {
				mid =a;
				min =c;
			}else {
				mid =c;
				min =a;
			}
		}else if(c>a && c>b) {
			max =c;
			if (a>b) {
				mid =a;
				min =b;
			}else {
				mid =b;
				min =a;
			}
		}
		System.out.println("max : " + max);
		System.out.println("mid : " + mid);
		System.out.println("min : " + min);
		

	}

}
  