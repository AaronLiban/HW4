import java.util.List;

public class ProteinFactory extends MacronutrientFactory {

	private static ProteinFactory proteinFactory = null;

	ProteinFactory(){}

	public static ProteinFactory getInstance() {
		if (proteinFactory == null)
			proteinFactory = new ProteinFactory();
		return proteinFactory;
	}

	@Override
	public List<String> getFoodList(String dietPlan) {
		return getFoodList(dietPlan);
	}

	@Override
	public String getRandomFood(String dietPlan) {
		Protein protein = new Protein();
		return protein.getRandomFood(dietPlan);
	}
}