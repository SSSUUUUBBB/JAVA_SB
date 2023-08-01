package Day03;

public class Ex04_Foreach {

	public static void main(String[] args) {
		String []week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		for (int i = 0; i < week.length; i+=2) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		
		//foreach : ctrl + space
		//foreach 문
		//배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		//for(요소타입 요소명 : 배열){}
		for (String day : week) {
			System.out.print(day + " "); //day : week[i]
		}
		System.out.println();
	}
}

//for 문과 foreach 문의 차이점은 조건을 줄 수 있냐 없냐
//foreach는 무조건 전체반복