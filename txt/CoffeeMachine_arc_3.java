package machine;

import java.util.Scanner;

public class CoffeeMachine_arc_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterCup = scanner.nextInt() / 200;
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkCup = scanner.nextInt() / 50;
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeCup = scanner.nextInt() / 15;
        int cupsAvailable = waterCup;
        if (milkCup < cupsAvailable) {
            cupsAvailable = milkCup;
        }
        if (coffeeCup < cupsAvailable) {
            cupsAvailable = coffeeCup;
        }
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeed = scanner.nextInt();
        if (cupsAvailable == cupsNeed) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (cupsAvailable < cupsNeed) {
            System.out.printf("No, I can make only %d cup(s) of coffee",
                    cupsAvailable);
        }
        if (cupsAvailable > cupsNeed) {
            System.out.printf("Yes, I can make that amount of coffee (and " +
                    "even %d more than that)", cupsAvailable - cupsNeed);
        }
    }
}
