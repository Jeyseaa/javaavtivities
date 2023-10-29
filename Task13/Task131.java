package Task13;

class Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce","Meat"};
        System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
    }
}
// extend Afritada Class here
class Mechado extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce","Meat","Potatoes & Carrots","Tomato Paste"};
        System.out.println("Mechado = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
    }
}
class Menudo extends Mechado {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce","Meat","Potatoes & Carrots","Liver Spread","Raisins","Hotdog"};
        System.out.println("Menudo = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
    }
}

class Caldereta extends Menudo {
    public void showIngredients() {
        String[] Ingredients =
                {"Tomato Sauce",
                        "Meat",
                        "Potatoes & Carrots",
                        "Tomato Paste",
                        "Liver Spread",
                        "Raisins",
                        "Hotdog",

                        "Cheese"};
        System.out.println("Caldereta = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
    }
}

public class Task131 {
    public static void main(String[] args) {
        // add 4 meal$ objects here and set the type as the extended Afritada class
        Afritada meal1 = new Afritada();
        Mechado meal2 = new Mechado();
        Menudo meal3 = new Menudo();
        Caldereta meal4 = new Caldereta();
        // display all ingredients at every object
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
meal4.showIngredients();

    }
}
