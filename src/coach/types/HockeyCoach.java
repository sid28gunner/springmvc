package coach.types;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public HockeyCoach() {


	}
	public HockeyCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Eat Lassi Daily";
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

}
