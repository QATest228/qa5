package com.vaqif;

public class JavaHomeWork {

    // Метод для демонстрации переполнения
    public static void demonstrateOverflow() {
        int minInt = Integer.MIN_VALUE; // Минимальное значение для int
        System.out.println("Минимальное значение для int: " + minInt);

        // Переполнение при вычитании
        int result = minInt - 1;
        System.out.println("Результат переполнения (minInt - 1): " + result);

        // Переполнение при делении
        int maxInt = Integer.MAX_VALUE;
        int result2 = maxInt * 3;
        System.out.println("Результат переполнения (maxInt * 3): " + result2);
    }

    // Метод для выполнения логических операций
    public static void logicalOperations() {
        int x = 7;
        int y = 15;

        // Логическое И (&&)
        System.out.println("x < 20 и y > 10: " + ((x < 20) && (y > 10)));

        // Логическое ИЛИ (||)
        System.out.println("x > 10 или y == 15: " + ((x > 10) || (y == 15)));

        // Логическое НЕ (!)
        System.out.println("x не больше 5: " + (!(x > 5)));
    }

    // Метод для выполнения операций с int и double
    public static void arithmeticWithIntAndDouble() {
        int num1 = 8;
        double num2 = 3.6;

        // Сложение int и double
        double sum = num1 + num2;
        System.out.println("Сложение: " + sum);

        // Умножение int и double
        double product = num1 * num2;
        System.out.println("Умножение: " + product);

        // Деление double на int
        double division = num2 / num1;
        System.out.println("Деление: " + division);

        // Приведение double к int
        double decimalValue = 12.345;
        int roundedValue = (int) decimalValue;
        System.out.println("Приведение double к int: " + roundedValue);
    }

    public static void main(String[] args) {
        logicalOperations();
        demonstrateOverflow();
        arithmeticWithIntAndDouble();
    }
}
