package Day02;

public class Ex14_WhileSum {

	public static void main(String[] args) {
		//1부터 100까지의 합계를 구하시오.
		int a = 1;
		int sum = 0; // 처음 변수를 초기화시켜주기 위해 0으로 지정
		
		while(a<=100) {
			sum += a++; // 아래 두 문장을 축약한 내용
			//sum = sum + a;
			//a = a + 1;
		}
		
		System.out.println("합계 : " + sum);
	}
}
