package javabasics;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int num:arr) {
			if(arr[num]==key) {
				System.out.println(num+1);
			}
			else {
				System.out.println("Not found");
			}
		
		}
	}

}
