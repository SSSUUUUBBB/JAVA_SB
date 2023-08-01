package Day05.Review;

import java.util.Scanner;

/**
 *  화폐 매수 구하기
 *  
 *  금액		: 537620
 *  50000	: 개
 *  10000	: 개
 *  5000	: 개
 *  1000	: 개
 *  500		: 개
 *  100		: 개
 *  50		: 개
 *  10		: 개
 *  5		: 개
 *  1		: 개
 *  위와 같이 금액을 입력하면, 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */

public class Ex03_NumberOfCurrency {

	/* (순서도)
	 	1. 금액을 입력한다
	 	2. 50000 으로 나눈 값을 출력한다.
	 	3. 나머지 값을 10000으로 나눈 값을 출력한다.
	 	4. 위를 화폐단위 순서대로 반복한다.
	 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("금액 : ");
//		int N = sc.nextInt();
//		
//		int a = N / 50000;
//		int b = (N - a * 50000) / 10000;
//		int c = (N - a * 50000 -b * 10000) / 5000;
//		
//		for (int i = 0; i < args.length; i++) {
//			
//		}
//		
//		System.out.println("50000원권 : " + a + "개");
//		System.out.println("10000원권 : " + b + "개");
//		System.out.println("5000원권 : " + c + "개");
//		
//		sc.close();
//	}
	
	/*(순서도)
	  1. 필요한 변수 선언 - (입력금액), (화폐매수), (화폐단위) 
	  2. (입력금액) 입력
	  3. 화폐매수 계산 - [조건] : 큰 화폐단위부터 계산한다.
	  3-1 화폐매수 계산 : (화폐매수) = (입력금액) / (화폐단위)
	  3-2 잔액 계산	: i ) (잔액) = (입력금액) - (화폐단위*화폐매수)
	  				  ii) (잔액) = (입력금액) % 화폐단위
	  3-3 화폐단위 변환	: 번갈아가면서, /5, /2 연산을 반복한다.
	  				  (화폐단위) = (화폐단위) / 5 , (화폐단위) = (화폐단위) / 2
	  4. 3번의 과정을 반복
	  	- 반복조건 : (화폐단위)가 1보다 크거나 같으면 반복
	  5. 3-1에서 구한 화폐매수를 출력한다.	  
	 */
	
	public static void main(String[] args) {
		//1
		int input; 			//입력금액
		int count; 			//화폐매수
		int money = 50000;	//화폐단위 - 큰 화폐단위부터 시작
		boolean sw = true;	//화폐단위를 전환하는 변수
		
		//2
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		//3, 4
		while ( money >=1 ) {
			count = input / money;
			System.out.println(money + "\t : " + count + "개");
						
			input = input - (money * count); // input = input % money;
			if (sw) {
				money = money / 5;
				//sw = false;
			}
			else {
				money = money / 2;
				//sw = true;
			}
			sw =!sw;  //!(NOT) 연산 : true > false, false > true
		}
		
		
		
		sc.close();
		
	}
	
	
	
}
