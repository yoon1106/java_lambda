
//람다란: 인터페이스 구현을 화살표 함수로
interface Printable{
	int add(int num1, int num2);
}



public class LamdaMain2 {

	public static void main(String[] args) {

		Printable prn = (s) -> {
			System.out.println(s);
		};
		prn.print("람다완성");

	}

}
