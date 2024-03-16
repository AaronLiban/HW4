import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Carbs extends Macronutrient {

	@Override
	List<String> getFoodList(String dietPlan) {
		List<String> foodList = new ArrayList<>();
			switch (dietPlan) {
				case "Paleo":
					foodList = Arrays.asList("Pistachio");
					return foodList;

				case "Vegan":
					foodList = Arrays.asList("Bread", "Lentils", "Pistachio");
					return foodList;
		
				case "Nut Allergy":
					foodList = Arrays.asList("Cheese", "Bread", "Lentils");
					return foodList;
	
				default:
					foodList = Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio");
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