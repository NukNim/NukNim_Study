package first;

import java.util.Arrays;

public class sort {
	
	public static void main(String arhs[]){
		
		int i,j,temp;
		int data[] = {30, 50, 10, 40, 20};
		int n = 5;

		
		/*
		 * System.out.println("data[0]" + data[0]); System.out.println("data[1]" +
		 * data[1]);
		 */
		
		
	for(i=0; i<n-1; i++){
		
		System.out.println("**data[i]정렬*");
		System.out.println("data[i]" + data[i]);
		System.out.println("[i] 값 = " + i);
		//System.out.println("data[j]" + data[j]);
		//System.out.println("**data[i]정렬*");
		
		System.out.println("정렬 I 결과 = " + Arrays.toString(data));
		
			for(j=i+1; j<n; j++){
				
				System.out.println("**data[j]정렬*");
				System.out.println("data[j]" + data[j]);
				System.out.println("[j] 값 = " + j);
				//System.out.println("**data[j]정렬*");
				
				System.out.println("정렬 J 결과 = " + Arrays.toString(data));
				
				if(data[i] > data[j]){
					
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
					
					System.out.println("**정렬*");
					System.out.println("data[i]" + data[i]);
					System.out.println("data[j]" + data[j]);
					System.out.println("**정렬*");
					
					System.out.println("정렬 이프 결과 = " + Arrays.toString(data));
					
					
					
					}
				}

			} 
		
		for(j=0; j<n; j++)
			System.out.println(data[j]);
			
	}

}