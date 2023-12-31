package Day10.Ex03_Object;


class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

//clone() 메소드를 사용하려면, Cloneable 인터페이스를 구현해야한다.
//-구현하지 않으면, CloneNotSupportedException 예외 발생
class Circle implements Cloneable{
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x, y);
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

	//clone 메소드 오버라이딩
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle) circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		if( circle.equals(copyCircle)) {
			System.out.println("circle과 copyCircle은 같은 객체입니다.");
		}
		
		//System.identityHashCode(객체) : 객체의 해시코드를 반환
		System.out.println( System.identityHashCode(circle));
		System.out.println( System.identityHashCode(copyCircle));
	}
	
	
	//내용물은 똑같이 만들어졌지만 인스턴스는 각자 만들어졌다는 것 이해하기
}
