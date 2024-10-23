
//람다란: 인터페이스 구현을 화살표 함수로

import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface //람다용 인터페이스인지 체크해주는 애노테이션
				    //추상함수가 2개 이상이면 에러때림
interface Add {
	int add(int num1, int num2);

}

interface Div {
	int div(int num1, int num2);

}

interface Calculate {
	int cal(int num1, int num2);
}

interface Generator {
	Set<Integer> randLotto();
}

public class LamdaMain2 {

	public static void main(String[] args) {

		Generator lotto = () -> {

			Set<Integer> lottoSet = new TreeSet<>();
			final int LOTTO = 6;

			while (lottoSet.size() < LOTTO) {
				int num = (int) ((Math.random() * 45) + 1);
				lottoSet.add(num);
			}

			return lottoSet;
		};
		
		System.out.println(lotto.randLotto());

		// ============

		Calculate c;

		c = (a, b) -> a + b;
		System.out.println(c.cal(5, 6));

		c = (a, b) -> a - b;
		System.out.println(c.cal(5, 6));

		// ============

		Div div = (int num1, int num2) -> num1 / num2;
		System.out.println(div.div(4, 2));

		// ============

		Printable prn = (s) -> {
			System.out.println(s);
		};
		prn.print("람다완성");

		// ============

		Add add = (num1, num2) -> num1 + num2;

		int hap = add.add(5, 6);
		System.out.println(hap);

	}

}
