import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Fats extends Macronutrient {

	@Override
	List<String> getFoodList(String dietPlan) {
		List<String> foodList = new ArrayList<>();
			switch (dietPlan) {
				case "Paleo":
					foodList = Arrays.asList("Avacado", "Tuna", "Peanuts");
					return foodList;

				case "Vegan":
					foodList = Arrays.asList("Avacado", "Peanuts");
					return foodList;
		
				case "Nut Allergy":
					foodList = Arrays.asList("Avacado", "Sour cream", "Tuna");
					return foodList;
	
				default:
					foodList = Arrays.asList("Avacado", "Sour cream", "Tuna", "Peanuts");
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