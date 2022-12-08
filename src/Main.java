public class Main {
    public static void main(String[] args) {
        // Домашка
        // Задача 1
        // С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 2
        // С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 3
        // Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // Задача 4
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        System.out.println("Задача №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 5
        /*
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».
        */
        System.out.println("Задача №5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        // Задача 6
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
        */
        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задача 7
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512
        */
        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задача 8
        /*
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете
        откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма
        накоплений равна … рублей».
        */
        System.out.println("Задача №8");
        int intoTheJar = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += intoTheJar;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        // Задача 9
        /*
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в
        банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый
        месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        */
        System.out.println("Задача №9");
        int intoTheBank = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 += total2 / 100;
            total2 += intoTheBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println();

        // Задача 10
        // Напишите программу, которая выводит в консоль таблицу умножения на 2:
        System.out.println("Задача №10");
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}