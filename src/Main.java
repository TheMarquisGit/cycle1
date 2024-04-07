public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        //Задача 2
        System.out.println("\nЗадача 2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        //Задача 3
        System.out.println("\nЗадача 3");
        for (int i = 0; i < 17; i++) {
            if (i != 0 && i % 2 == 0) System.out.print(i + " ");
        }

        //Задача 4
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        //Задача 5
        System.out.println("\nЗадача 5");
        String message = " год является високосным";
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + message);
        }

        //Задача 6
        System.out.println("\nЗадача 6");
        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }

        //Задача 7
        System.out.println("\nЗадача 7");
        for (int i = 2; i < 513; i *= 2) {
            System.out.print(i + " ");
        }

        //Задача 8
        System.out.println("\nЗадача 8");
        int money = 29000;
        for (int i = 1; i < 13; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (money * i) + " рублей");
        }

        //Задача 9
        System.out.println("\nЗадача 9");
        int inBank = 0;
        for (int i = 1; i < 13; i++) {
            inBank = inBank / 100 + inBank;
            inBank += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + inBank + " рублей");
        }

        //Задача 10
        System.out.println("\nЗадача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}