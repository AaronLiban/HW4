public class MealPlan {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Ann", "Paleo");
		getMeal(customer1);

		Customer customer2 = new Customer("Bryan", "Vegan");
		getMeal(customer2);

		Customer customer3 = new Customer("Celine", "Nut Allergy");
		getMeal(customer3);

		Customer customer4 = new Customer("Dylan", "No Restriction");
		getMeal(customer4);

		Customer customer5 = new Customer("Evelyn", "Vegan");
		getMeal(customer5);

		Customer customer6 = new Customer("Fred", "No Restriction");
		getMeal(customer6);
	}

	public static void getMeal(Customer customer) {
		MacronutrientFactory carbFactory = MacronutrientAbstractFactory.createFactory("Carbs");
		String carbs = carbFactory.getRandomFood(customer.getDietPlan());

		MacronutrientFactory proteinFactory = MacronutrientAbstractFactory.createFactory("Protein");
		String protein = proteinFactory.getRandomFood(customer.getDietPlan());

		MacronutrientFactory fatsFactory = MacronutrientAbstractFactory.createFactory("Fats");
		String fats = fatsFactory.getRandomFood(customer.getDietPlan());
		

		System.out.println(customer.getName() + "'s Meal:");
		System.out.println("Diet plan: " + customer.getDietPlan());
		System.out.println("Carbs: " + carbs);
		System.out.println("Protein: " + protein);
		System.out.println("Fats: " + fats + "\n");
	}
}
