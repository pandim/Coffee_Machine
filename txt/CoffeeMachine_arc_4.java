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

        printState();
        System.out.println("\nWrite action (buy, fill, take):");
        switch (scanner.nextLine()) {
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
            default:
        }
        printState();
    }

    public static void buy() {
        System.out.println("What do you want to buy? " +
                "1 - espresso, 2 - latte, 3 - cappuccino:");
        switch (scanner.nextInt()) {
            case 1:
                water -= 250;
                coffeeBeans -= 16;
                disposableCups--;
                money += 4;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                coffeeBeans -= 20;
                disposableCups--;
                money += 7;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                coffeeBeans -= 12;
                disposableCups--;
                money += 6;
                break;
            default:
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
