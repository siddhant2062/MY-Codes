package medium;

import java.util.Scanner;

public class i_container_with_most_water_bonus_question {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int start=0;
		int end=arr.length-1;
		int max=0;
		while(start<end) {
			int lh=arr[start];
			int rh=arr[end];
			int min_h=Math.min(lh, rh);
			int cur_area=(end-start)*min_h;
			max=Math.max(max,cur_area);
			if(lh<rh) {
				start++;
			}else {
				end--;
			}
			
		}
		System.out.print(max);
		
	}
}
