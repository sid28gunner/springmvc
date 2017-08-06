package coach.types;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
 //Constructor injection
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Score 10 goals daily";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return  "Just Do it: Nike"+fortuneService.getFortune();
	}

}
