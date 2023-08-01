package Day01;

public class Ex07_Byte {

	public static void main(String[] args) {
		//byte 는 1byte 범위의 데이터를 표현
		// 8bits (0000 0000) : 2^8 : 256개
		// 양수와 음수로 나누면, -128~127 범위로 표현 가능
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 128; // 결과값 -128나옴 (강제 형변환) -128~127에서 한바퀴 돌아서 -128이 됨
		//(에러) byte var6 = 200;
		//-에러 메시지 : Type mismatch - 타입이 불일치, 데이터 범위를 벗어남(오버플로우)
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}

}
