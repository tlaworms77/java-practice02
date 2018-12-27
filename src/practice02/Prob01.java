package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int money = sc.nextInt();
		int[] moneyCounts = new int[MONEYS.length]; 
		
		for(int i=0;i<MONEYS.length;i++) {
			if(money/MONEYS[i]>0) {
				moneyCounts[i] = money/MONEYS[i];
				money -= MONEYS[i]*(moneyCounts[i]);
				System.out.println(MONEYS[i]+"원 : " + moneyCounts[i] + "개");
			}
		}
		
		// 해제
		sc.close();
	}

}
