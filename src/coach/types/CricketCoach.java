package coach.types;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 10 overs of bowling daily";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
