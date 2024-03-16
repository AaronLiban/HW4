import java.util.List;

public class CarbsFactory extends MacronutrientFactory {

	private static CarbsFactory carbsFactory = null;

	CarbsFactory(){}

	public static CarbsFactory getInstance() {
		if (carbsFactory == null)
			carbsFactory = new CarbsFactory();
		return carbsFactory;
	}

	@Override
	public List<String> getFoodList(String dietPlan) {
		return getFoodList(dietPlan);
	}

	@Override
	public String getRandomFood(String dietPlan) {
		Carbs carbs = new Carbs();
		return carbs.getRandomFood(dietPlan);
	}
}