import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = scanner.nextInt();
        }
        int len = 1;
        int maxLen = 1;
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > ints[i - 1]) {
                len++;
                maxLen = (len > maxLen) ? len : maxLen;
            } else {
                len = 1;
            }
        }

        System.out.println(maxLen);
    }

}