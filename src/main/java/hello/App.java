package hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// IoC Container : Inversion of Control (제어의 역전)
    	// Greeter을 필요한것에 대한것을 정보만 줌 -> ctx가 Greeter을 만들어줌 //주입정보를 xml로 줌
    	ApplicationContext ctx = 
    			new ClassPathXmlApplicationContext("beans.xml");
    	//Greet 인터페이스 성너된 메소드는 sayHello 밖에 없음
    	Greet g = (Greet) ctx.getBean("korea");
    	System.out.println( "Greeting!"+g.sayHello() + ((Greeter) g).iam() );
    	g =(Greet) ctx.getBean("english");
    	System.out.println( "Greeting!"+ g.sayHello() );
    	
    	Greeter korea = (Greeter) ctx.getBean("korea"); // 객체의 형변환을 해주어야한다
       // Greeter 클래스로 부터 생성된 객체를 참조하는 변수, 
       // korea는  Greeter 클래스에 정으된 메소드를 사용할 수있다고 생각함
    	System.out.println( "Greeting!"+korea.sayHello() );
    	Greeter2 eng = (Greeter2) ctx.getBean("english"); 
    	System.out.println( "Greeting!"+ eng.sayHello() );
    }
}
