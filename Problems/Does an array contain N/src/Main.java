import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        Boolean bool = false;
        for (int i : ints) {
            if (i == num) {
                bool = true;
                break;
            }
        }
        System.out.println(bool);

    }

}