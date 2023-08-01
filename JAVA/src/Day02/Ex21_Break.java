package Day02;

import java.util.Scanner;

public class Ex21_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//무한루프
		//반드시 종료조건을 추가해주어야한다. (break)
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
//			if(str == "STOP")  //문자열은 참조자료열이라서 비교연산자로 비교 불가
			if(str.equals("STOP"))
				//문자열.equals("비교문자열")
				//문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
				break;
			
			System.out.println(">> " + str);
		}
		System.out.println("프로그램을 종료합니다...");
		sc.close();
	}
}
