import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Boolean bool = false;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[1] == num1 && ints[i + 1] == num2
                    || ints[1] == num2 && ints[i + 1] == num1) {
                bool = true;
                break;
            }
        }
        System.out.println(bool);

    }
}