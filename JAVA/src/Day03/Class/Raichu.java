package Day03.Class;


// 상속
// 키워드 : 자식클래스 extends 부모클래스 {}
public class Raichu extends Pikachu {

	 //생성자 자동완성
	// alt + shift + S > C
	public Raichu() {
		super(200, "슈퍼전기", 20); // 항상 생성자의 첫번째에 있어야함
//		energy = 200;
//		type = "슈퍼전기";
//		level = 20;
	}

	public Raichu(int energy, String type, int level) {
		super(energy, type, level);
	}
	//메소드 오버라이딩 : 메소드 재정의
	// alt + shift + S > V

	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack() {
		
		if( level >= 40)
			return "아이언테일";
		else
			return "(사용불가)";
		
	}
	
}
