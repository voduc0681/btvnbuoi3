public class baitap3 {
    public static void main(String[] args) {
        // Kiểm tra năm nhuận
        CheckYear checkyear = new CheckYear();
        System.out.println("Kiểm tra năm nhuận:");
        checkyear.CheckLeapYear(2024); // Đây là năm nhuận
        checkyear.CheckLeapYear(1900); // Đây không phải là năm nhuận
        checkyear.CheckLeapYear(2000); // Đây là năm nhuận
        System.out.println();
        // Calculator
        Calculator calculator = new Calculator();
        System.out.println("Calculator:");
        calculator.CalculatorInteger("+", 10, 5); 
        calculator.CalculatorInteger("-", 10, 5); 
        calculator.CalculatorInteger("*", 10, 5); 
        calculator.CalculatorInteger("/", 10, 5); 
        calculator.CalculatorInteger("/", 10, 0);
        System.out.println();
        // Tìm số nguyên lớn nhất
        MaxInteger maxInteger = new MaxInteger();
        System.out.println("Tìm số nguyên lớn nhất:");
        System.out.println("Số lớn nhất là: " + maxInteger.FindMaxInteger());
        System.out.println();
        // Tìm nghiệm phương trình bậc 2
        Equation equation = new Equation();
        System.out.println("Tìm nghiệm phương trình bậc 2:");
        equation.CalculateQuadratic(1, -3, 2);
        equation.CalculateQuadratic(1, 2, 1); 
        equation.CalculateQuadratic(1, 2, 3); 
        equation.CalculateQuadratic(0, 2, 3); 
        equation.CalculateQuadratic(0, 0, 3);
    }
}