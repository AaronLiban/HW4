public class MacronutrientAbstractFactory {

	private static MacronutrientAbstractFactory macronutrientAbstractFactory = null;

	MacronutrientAbstractFactory(){}

	public static MacronutrientAbstractFactory getInstance() {
		if (macronutrientAbstractFactory == null)
			macronutrientAbstractFactory = new MacronutrientAbstractFactory();
		return macronutrientAbstractFactory;
	}

    public static MacronutrientFactory createFactory(String type) {
        switch (type) {
            case "Carbs":
                return CarbsFactory.getInstance();
        
            case "Protein":
                return ProteinFactory.getInstance();
            
            case "Fats":
                return FatsFactory.getInstance();

            default:
                return null;
                
        }
    }
}