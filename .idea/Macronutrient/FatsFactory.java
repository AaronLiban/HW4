import java.util.List;

public class FatsFactory extends MacronutrientFactory {

	private static FatsFactory fatsFactory = null;

	FatsFactory(){}

	public static FatsFactory getInstance() {
		if (fatsFactory == null)
			fatsFactory = new FatsFactory();
		return fatsFactory;
	}

	@Override
	public List<String> getFoodList(String dietPlan) {
		return getFoodList(dietPlan);
	}

	@Override
	public String getRandomFood(String dietPlan) {
		Fats fats = new Fats();
		return fats.getRandomFood(dietPlan);
	}
}