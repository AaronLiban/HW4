public class Pizza {
    private String size;
    private String chain;
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamPineapple;

    public Pizza(String size, String chain, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extraCheese, boolean peppers, boolean chicken, boolean olives, boolean spinach, boolean tomatoBasil, boolean beef, boolean ham, boolean pesto, boolean spicyPork, boolean hamPineapple) {
        this.size = size;
        this.chain = chain;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoBasil = tomatoBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamPineapple = hamPineapple;
    }

    public String getSize() {
        return size;
    }

    public String getChain() {
        return chain;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isSausage() {
        return sausage;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isOnions() {
        return onions;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isPeppers() {
        return peppers;
    }

    public boolean isChicken() {
        return chicken;
    }

    public boolean isOlives() {
        return olives;
    }

    public boolean isSpinach() {
        return spinach;
    }

    public boolean isTomatoBasil() {
        return tomatoBasil;
    }

    public boolean isBeef() {
        return beef;
    }

    public boolean isHam() {
        return ham;
    }

    public boolean isPesto() {
        return pesto;
    }

    public boolean isSpicyPork() {
        return spicyPork;
    }

    public boolean isHamPineapple() {
        return hamPineapple;
    }

    public String eat() {
        String text =  "Pizza{" +
                "size='" + size + '\'' +
                ", chain='" + chain + '\'';
        text += pepperoni ? (", pepperoni"):"";
        text += sausage ? (", sausage"):"";
        text += mushrooms ? (", mushrooms"):"";
        text += bacon ? (", bacon"):"";
        text += onions ? (", onions"):"";
        text += extraCheese ? (", extra cheese"):"";
        text += peppers ? (", peppers"):"";
        text += chicken ? (", chicken"):"";
        text += olives ? (", olives"):"";
        text += spinach ? (", spinach"):"";
        text += tomatoBasil ? (", tomato and basil"):"";
        text += beef ? (", beef"):"";
        text += ham ? (", ham"):"";
        text += pesto ? (", pesto"):"";
        text += spicyPork ? (", spicy pork"):"";
        text += hamPineapple ? (", ham and pineapple"):"";
        text += '}';
        return text;
    }

    public static class PizzaBuilder {
        private String size;
        private String chain;
        private boolean pepperoni;
        private boolean sausage;
        private boolean mushrooms;
        private boolean bacon;
        private boolean onions;
        private boolean extraCheese;
        private boolean peppers;
        private boolean chicken;
        private boolean olives;
        private boolean spinach;
        private boolean tomatoBasil;
        private boolean beef;
        private boolean ham;
        private boolean pesto;
        private boolean spicyPork;
        private boolean hamPineapple;
        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setChain(String chain) {
            this.chain = chain;
            return this;
        }

        public PizzaBuilder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder setSausage(boolean sausage) {
            this.sausage = sausage;
            return this;
        }

        public PizzaBuilder setMushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public PizzaBuilder setBacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public PizzaBuilder setOnions(boolean onions) {
            this.onions = onions;
            return this;
        }

        public PizzaBuilder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaBuilder setPeppers(boolean peppers) {
            this.peppers = peppers;
            return this;
        }

        public PizzaBuilder setChicken(boolean chicken) {
            this.chicken = chicken;
            return this;
        }

        public PizzaBuilder setOlives(boolean olives) {
            this.olives = olives;
            return this;
        }

        public PizzaBuilder setSpinach(boolean spinach) {
            this.spinach = spinach;
            return this;
        }

        public PizzaBuilder setTomatoBasil(boolean tomatoBasil) {
            this.tomatoBasil = tomatoBasil;
            return this;
        }

        public PizzaBuilder setBeef(boolean beef) {
            this.beef = beef;
            return this;
        }

        public PizzaBuilder setHam(boolean ham) {
            this.ham = ham;
            return this;
        }

        public PizzaBuilder setPesto(boolean pesto) {
            this.pesto = pesto;
            return this;
        }

        public PizzaBuilder setSpicyPork(boolean spicyPork) {
            this.spicyPork = spicyPork;
            return this;
        }

        public PizzaBuilder setHamPineapple(boolean hamPineapple) {
            this.hamPineapple = hamPineapple;
            return this;
        }

        public Pizza createPizza() {
            return new Pizza(size, chain, pepperoni, sausage, mushrooms, bacon, onions, extraCheese, peppers, chicken, olives, spinach, tomatoBasil, beef, ham, pesto, spicyPork, hamPineapple);
        }
    }
}