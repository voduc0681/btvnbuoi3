class Equation {
    static void CalculateQuadratic(int a, int b, int c) {
        if (a == 0 && b == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (a == 0) {
            System.out.println("Phương trình có một nghiệm: " + (-c / (double) b));
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: " + (-b / (2.0 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}