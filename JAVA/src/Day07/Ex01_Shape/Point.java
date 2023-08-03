package Day07.Ex01_Shape;

public class Point {

	int x, y;
	
	//기본 생성자
	public Point() {
		this(0, 0);
	}

	//매개변수가 있는 생성자  // alt + shift + S > Generate Constructor Using Field
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString() // alt + shift + S > Generate toString()
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
