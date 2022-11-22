public class Main {
    public static void main(String[] args) {
        // Задача 1.1
        System.out.println("Задача 1.1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задача 1.2
        System.out.println("Задача 1.2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задача 1.3
        System.out.println("Задача 1.3");
        for (int i = 0; i < 17; i = i+2) {
            System.out.println(i);
        }
        // Задача 1.4
        System.out.println("Задача 1.4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задача 2.1
        System.out.println("Задача 2.1");
        for (int i = 1904; i < 2096 ; i = i +4) {
            System.out.println(i+ " год является високосным");
        }
        //Задача 2.2
        System.out.println("Задача 2.1");
        for (int i = 7; i <= 98; i=i + 7) {
            System.out.println(i);
        }
        // Задача 2.3
        System.out.println("Задача 2.3");
        int i = 1;
        System.out.println(i);
        for (i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // Задача 3.1
        System.out.println("Задача 3.1");
        int deposit = 29000;
        int total = 0;
        for (int j = 1; j <= 12; j++) {
            total = total + deposit;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + total);
        }
        System.out.println("Годовое накопление равно " + total);
        // Задача 3.2
        System.out.println("Задача 3.2");
        double totalWithPercent = 0;
        double percent = 0.01;
        for (int j = 1; j <= 12 ; j++) {
            totalWithPercent = (totalWithPercent + deposit) * (1 + percent);
            System.out.println("Месяц " + j + ", сумма накоплений равна " + totalWithPercent);
        }
        System.out.println("Годовое накопление равно " + totalWithPercent);
    }
}