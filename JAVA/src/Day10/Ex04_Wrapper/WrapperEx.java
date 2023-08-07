package Day10.Ex04_Wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		
		// Character
		// char -> Character
		// : 문자타입인 char 기본타입을 객체화한 클래스
		
		// 대소문자 변환
		char a = 'a';
		char A = 'A';
		
		System.out.println(Character.toUpperCase(a)); // 대문자로 변환
		System.out.println(Character.toLowerCase(A)); // 소문자로 변환
		
		char c1 = '7' , c2 = 'K' ;
		
		//해당 문자가 숫자인지 확인
		if( Character.isDigit(c1) ) {
			System.out.println(c1 + "(은/는) 숫자");
		}
		
		if( Character.isAlphabetic(c2) ) {
			System.out.println(c2 + "(은/는) 영문자");
		}
		
		//Integer
		// int -> Integer
		// : 정수타입을 int 기본타입으로 객체화한 클래스
		System.out.println(Integer.parseInt("28"));  //문자열 -> 정수
		System.out.println(Integer.toString(28) + 2); //정수 -> 문자열
		System.out.println(Integer.toBinaryString(28)); // 2진수 문자열로 반환
		System.out.println(Integer.bitCount(28));  //2진수 1의 개수 (11100)
		
		
		//deprecated?
		// : 더 이상 사용을 권장하지 않는 문법
		// Integer i = new Integer(28);
		Integer i = 28;
		System.out.println(i.doubleValue() ); //double 타입으로 변환
		
		//Double
		
		//Boolean
		
		
	}
}
