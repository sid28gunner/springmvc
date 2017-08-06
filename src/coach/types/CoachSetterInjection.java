package coach.types;

	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class CoachSetterInjection {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
			
			HockeyCoach coach= context.getBean("myCoach", HockeyCoach.class );
			
			System.out.println(coach.getDailyWorkout());
			
			System.out.println(coach.getFortune());
			
			System.out.println(coach.getEmail());
			
			System.out.println(coach.getName());
			
			context.close();

		}

	}
