package Day02;

public class Ex03_LogicalOperator {

	public static void main(String[] args) {
		//논리연산자
		// AND (&&) : A AND B : A와 B 둘 다 true 일 때, 결과가 true
		// A	B	결과
		// F	F	F
		// T	F	F
		// F	T	F
		// T	T	T
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println();
		
		//OR(||) > | 쓰는법 : shift + \(원화표시)
		// A OR B : A와 B 둘 중 하나라도 true 이면, 결과가 true
		// A	B	결과
		// F	F	F
		// T	F	T
		// F	T	T
		// T	T	T
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || (100 < 50));
		System.out.println((5 < 20) || (5 > 2)); 
		System.out.println();
		//쇼트서킷 : 앞 쪽 피연산자의 논리값에 따라 결과를 알 수 있을 경우 뒤 쪽 연산자 부분을 확인하지 않고 넘어감
		
		
		// XOR(^)
		// A XOR B : A와 B가 다를 때, 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();
		
		//NOT (!)
		//!A : A true 이면 false, false 이면 true 로 변환
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//쇼트 서킷
		// 논리 연산의 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println(value1); // 쇼트서킷으로 진행X
		
		int value2 = 3;
		System.out.println(true || ++value2 > 5);
		System.out.println(value2); // 쇼트서킷으로 진행X
		
		// 비트 연산자의 경우는 쇼트 서킷이 적용되지 않는다.
		int value3 = 3;
		System.out.println(false & ++value3 > 10);
		System.out.println(value3); 
		
		int value4 = 3;
		System.out.println(true | ++value4 > 5);
		System.out.println(value4); 
	}
}
