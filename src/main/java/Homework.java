public class Homework {

    public static void main (String[] args){

        int a = 5;
        int b = 10;

        System.out.println("Арифметические операций");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " * " + b + " = " + (a * b));


        double с = 0.5;

        System.out.println("Арифметические операций над int и double в одном выражении");
        System.out.println(a + " + " + с + " = " + (a + с));
        System.out.println(a + " / " + с + " = " + (a / с));

        int d = 5;

        System.out.println("Логические операции");
        System.out.println(a + " равно " + d + " : " + (a == d));
        System.out.println(a + " больше или равно " + d + " : " + (a >= d));
        System.out.println(a + " больше " + d + " : " + (a > d));
        System.out.println(a + " меньше или равно " + d + " : " + (a <= d));
        System.out.println(a + " меньше " + d + " : " + (a < d));
        System.out.println(a + " не равно " + d + " : " + (a != d));


        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Диапазон типов данных для вещественных / чисел с плавающей точкой");
        System.out.println("min float: " + minFloat);
        System.out.println("max float: " + maxFloat);
        System.out.println("min double: " + minDouble);
        System.out.println("max double: " + maxDouble);

        int maxByte = Byte.MAX_VALUE;

        System.out.println("Переполнение арифметической операцией: " + maxByte + " + " + 1 + " = " + (maxByte + 1));

    }
}
