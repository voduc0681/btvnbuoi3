class Calculator {
    static void CalculatorInteger(String operation, int number1, int number2) {
        switch (operation) {
            case "+":
                System.out.println("Kết quả: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Kết quả: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Kết quả: " + (number1 * number2));
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println("Kết quả: " + (number1 / number2));
                } else {
                    System.out.println("Không thể chia cho 0");
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ");
        }
    }
}