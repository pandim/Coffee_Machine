package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String operation;
        while (!((operation = scanner.nextLine()).equals("exit"))) {
            switch (operation) {
                case "buy": {//купить
                    buy();
                    break;
                }
                case "fill": {//заполнить
                    fill();
                    break;
                }
                case "take": {//взять
                    take();
                    break;
                }
                case "remaining": {//осталось
                    printState();
                    break;
                }
                default:
            }
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        }
    }

    public static void buy() {
        System.out.println("What do you want to buy? " +
                "1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String drink;
        if (!(drink = scanner.nextLine()).equals("back")) {
            switch (Integer.parseInt(drink)) {
                case 1:
                    testDrink(250, 0, 16, 4);
                    break;
                case 2:
                    testDrink(350, 75, 20, 7);
                    break;
                case 3:
                    testDrink(200, 100, 12, 6);
                    break;
                default:
            }
        }
    }

    public static void testDrink(int waterOne, int milkOne, int coffeeBeansOne,
                                 int price) {
        if (water > waterOne && milk > milkOne && coffeeBeans > coffeeBeansOne && disposableCups > 1) {
            water -= waterOne;
            milk -= milkOne;
            coffeeBeans -= coffeeBeansOne;
            disposableCups--;
            money += price;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups += scanner.nextInt();

    }

    public static void take() {
        System.out.println("I gave you $" + money + "\n");
        money = 0;
    }

    public static void printState() {
        System.out.printf("The coffee machine has:\n" +
                        "%d of water\n%d of milk\n%d of coffee beans\n" +
                        "%d of disposable cups\n%d of money\n",
                water, milk, coffeeBeans, disposableCups, money);

    }
}
