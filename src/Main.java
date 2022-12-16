public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц" + month + "сумма накоплений равна" + total + "рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i);
        }
        System.out.println();
        for (int b = 10; b >= 1; b = b - 1) {
            System.out.print(b);
        }
        System.out.println();


    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = (population / 1000) * 17;
        int mortality = (population / 1000) * 8;
        int populationPlus = fertility - mortality;
        int year = 2022;
        while (year < 2032) {
            population = population + populationPlus;
            year = year + 1;
            System.out.println("Год" + year + " численность населения составит" + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int depositAmount = 15000;
        int total = depositAmount;
        double monthPercents = 0.07;
        for (int month = 1; total < 12000000; month++) {
            total = total + total / 100;
            total = (int) ((total) * (1 + monthPercents));
            System.out.println("Месяц " + month + " сумма " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int depositAmount = 15000;
        int total = depositAmount;
        double monthPercents = 0.07;
        for (int month = 1; total < 12000000; month++) {
            total = total + total / 100;
            total = (int) ((total) * (1 + monthPercents));
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " итого " + total);
            }
        }
    }

    public static void task6() {
        int depositAmount = 15000;
        int total = 0;
        double monthPercents = 0.07;
        for (int year = 1; year <= 9; year++) {
            total = total + total / 100;
            total = (int) ((total + depositAmount) * (1 + monthPercents));
            System.out.println("год" + year + " сумма " + total);

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 5;
            int reportDay = firstFriday + 7;
            for (reportDay = firstFriday; reportDay <= 31; reportDay = reportDay+7){
                System.out.println("Сегодня пятница " + reportDay + "-е число. Необходимо подготовить отчет");
            }
        }



    public static void task8() {
        System.out.println("Задача 8");
        int yearNow = 2022;
        int yearEarlier = yearNow - 200;
        int yearNext = yearNow + 100;
        int cometYears = 0;
        for (cometYears = yearEarlier; cometYears <= yearNext; cometYears++) {
            if (cometYears % 79 == 0) {
                System.out.println(cometYears);
            }

        }
    }
}
