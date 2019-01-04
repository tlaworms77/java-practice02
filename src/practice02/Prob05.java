package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "y";

		// int result = (int)(Math.random()*100)+1;
		Random r = new Random();
		int result = 0;
		int low = 0, max = 0, tmp = 0;
		boolean initFlag = true;

		int i = 1;
		while (answer.equals("y") || answer.equals("Y")) {
			if (initFlag == true) {
				System.out.println("수를 결정하였습니다. 맞추어 보세요");
				result = r.nextInt(100) + 1;
				System.out.println(result);
				i = 1;
				low = 1;
				max = 100;
				tmp = 0;
				initFlag = false;
			}
			System.out.print((i++) + ">>");
			tmp = sc.nextInt();
			if (tmp < result) {
				low = tmp;
				System.out.println("더 높게");
				System.out.println(low + "-" + max);
			} else if (tmp > result) {
				max = tmp;
				System.out.println("더 낮게");
				System.out.println(low + "-" + max);
			} else {
				System.out.println("찾았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");

				answer = sc.next();
				if (answer.equals("y") || answer.equals("Y")) {
					initFlag = true;
				} else if (answer.equals("n") || answer.equals("N")) {
					System.out.println("게임을 종료합니다.");
					break;
				}
			}
		}

		// 자원해제
		sc.close();
	}

}
