import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


//Optional은 if null 회피 하기 위해서 나온 문법
//null 체크 -> 프로그램을 죽이는 이유중에 가장큰 이유중에 하나
//NPE(NullPointerException) => null  체크를 함.

//Java8에서는 Optional<T> 클래스를 사용해 NPE를 방지할 수 있도록 도와준다. 
//Optional<T>는 null이 올 수 있는 값을 감싸는 Wrapper 클래스


public class OptionalMain {
	
	public static void isCheckNull(Object obj) {
		
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Optional<String> os1 = Optional.of(new String("Toy1")); //null 허용 안함
		Optional<String> os2 = Optional.ofNullable(new String("Toy2")); //null 허용
		
		if(os1.isPresent())
			System.out.println(os1.get());
		
		if(os2.isPresent())
			System.out.println(os2.get());
		
		os1.ifPresent(s->System.out.println(s));
		os2.ifPresent(System.out::println);
		
		
		//Object obj = null;
		 
		//isCheckNull(obj);		
		//isCheckNull(new Object());
	
					
	}	
}