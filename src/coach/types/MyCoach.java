package coach.types;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach= context.getBean("myCoach", Coach.class );
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getFortune());
		
		context.close();

	}

}
