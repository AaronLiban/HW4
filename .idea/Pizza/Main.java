public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder("Small").setChain("Pizza Hut").setPepperoni(true).setSausage(true).setMushrooms(true).createPizza();
        Pizza pizza2 = new Pizza.PizzaBuilder("Medium").setChain("Pizza Hut").setBacon(true).setOnions(true).setExtraCheese(true).setPeppers(true).setChicken(true).setOlives(true).createPizza();
        Pizza pizza3 = new Pizza.PizzaBuilder("Large").setChain("Pizza Hut").setSpinach(true).setTomatoBasil(true).setBeef(true).setHam(true).setPesto(true).setSpicyPork(true).setPepperoni(true).setSausage(true).setMushrooms(true).createPizza();

        System.out.println(pizza1.eat());
        System.out.println(pizza2.eat());
        System.out.println(pizza3.eat());

        Pizza pizzaHut1 = new Pizza.PizzaBuilder("Large").setChain("Pizza Hut").setPepperoni(true).setPeppers(true).setHamPineapple(true).createPizza();
        Pizza pizzaHut2 = new Pizza.PizzaBuilder("Small").setChain("Pizza Hut").setSausage(true).setMushrooms(true).createPizza();

        Pizza littleCaesars1 = new Pizza.PizzaBuilder("Medium").setChain("Little Caesars").setBacon(true).setBeef(true).setChicken(true).setExtraCheese(true).setHam(true).setMushrooms(true).setOlives(true).setOnions(true).createPizza();
        Pizza littleCaesars2 = new Pizza.PizzaBuilder("Small").setChain("Little Caesars").setTomatoBasil(true).setSpinach(true).setSpicyPork(true).setSausage(true).setPesto(true).setPeppers(true).createPizza();

        Pizza dominos1 = new Pizza.PizzaBuilder("Small").setChain("Dominos").setHamPineapple(true).createPizza();
        Pizza dominos2 = new Pizza.PizzaBuilder("Large").setChain("Dominos").setPepperoni(true).setExtraCheese(true).setTomatoBasil(true).createPizza();

        System.out.println(pizzaHut1.eat());
        System.out.println(pizzaHut2.eat());

        System.out.println(littleCaesars1.eat());
        System.out.println(littleCaesars2.eat());
        
        System.out.println(dominos1.eat());
        System.out.println(dominos2.eat());
    }
}