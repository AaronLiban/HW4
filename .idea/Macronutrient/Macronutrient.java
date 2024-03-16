import java.util.List;

public abstract class Macronutrient {

    abstract List<String> getFoodList(String dietPlan);

    abstract String getRandomFood(String dietPlan);

}