import java.util.Scanner;
class MaxInteger {
    static int FindMaxInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int number1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int number2 = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int number3 = scanner.nextInt();
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        scanner.close();
        return max;
    }
}
