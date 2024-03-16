import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Protein extends Macronutrient {

	@Override
	List<String> getFoodList(String dietPlan) {
		List<String> foodList = new ArrayList<>();
			switch (dietPlan) {
				case "Paleo":
					foodList = Arrays.asList("Fish", "Chicken", "Beef");
					return foodList;

				case "Vegan":
					foodList = Arrays.asList("Tofu");
					return foodList;
		
				case "Nut Allergy":
					foodList = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");
					return foodList;
	
				default:
					foodList = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");
					return foodList;
			}
		}

	@Override
	String getRandomFood(String dietPlan) {
		List<String> foodList = getFoodList(dietPlan);
		Random rand = new Random();
		return foodList.get(rand.nextInt(foodList.size()));
	}
}