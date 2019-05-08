package hello;

public class Greeter2 implements Greet { //Greet을 구현했기때문에 상관이 없다
	public String sayHello() { //구현한 메소드
		return "Hello";
	}
	public String iam() { // 추가한 커스텀 메소드
		return "english people";
	}
}
