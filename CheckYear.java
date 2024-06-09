class CheckYear {
    static void CheckLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Đây là năm nhuận");
        } else {
            System.out.println("Đây không phải là năm nhuận");
        }
    }
}