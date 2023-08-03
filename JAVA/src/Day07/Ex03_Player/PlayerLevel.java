package Day07.Ex03_Player;

public abstract class PlayerLevel {

	//달리기, 점프, 회전
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	//난이도 출력 메세지
	public abstract void showLevel();
	
	//템플릿메소드
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}



//템플릿 메서도
//:일련의 작업 수행을 하는 메소드들을 특정 순서로 호출하는 메소드로,
// 전체적인 수행 구조를 변경하지는 않으면서, 특정 단계의 구현 기능을 변경하는 패턴
// -abstract 추상 메소드를 응용하여 정의하고, 구현 클래스에서 다형성을 실현하여 적용한다.