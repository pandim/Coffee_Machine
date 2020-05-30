package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int manyCups = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need:\n" +
                        "%d ml of water\n%d ml of milk\n%d g of coffee beans",
                manyCups, manyCups * 200, manyCups * 50, manyCups * 15);
    }
}
