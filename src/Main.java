public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) ;
        else {
            System.out.println("если возраст человека равен " + age +
                    ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Скорость в норме");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int human1 = 1;
        if (human1 < 2) {
            System.out.println("1.Пора спать");
        } else {
            System.out.println("можно не спать");
        }
        int human2 = 4;
        if (human2 > 2 && human2 < 6) {
            System.out.println("2.Если возрасть человека " + human2 + " года, то нужно хоть в детски сад");
        }
        int human3 = 15;
        if (human3 > 7 && human3 < 18) {
            System.out.println("3.Если возраст человека " + human3 + " лет, то нужно хоть в школу");
        } else {
            System.out.println("можно не хоть в школу");
        }
        int human4 = 21;
        if (human4 > 18 && human4 < 24) {
            System.out.println("4.Если возраст человека " + human4 + " год, нужно посещать университет");
        } else {
            System.out.println("Университет можно не посещать");
        }
        int human5 = 27;
        if (human5 > 24) {
            System.out.println("5.Если возраст человека " + human5 + " лет, нужно ходить на работу");
        } else {
            System.out.println("либо не работать");
        }
        int human6 = 65;
        if (human6 > 60) {
            System.out.println("6.Если возраст человека " + human6 + " лет, то можно и отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 4;
        if (age < 5) {
            System.out.println("1.Если возраст ребенка равен " + age + " года, то он не может кататься на аттракционе");
        } else {
            System.out.println("может кататься");
        }
        int age2 = 11;
        if (age2 > 5 && age2 < 14) {
            System.out.println("2.Если возраст ребенка " + age2 + " лет, то можно кататься в сопровождении");
        } else {
            System.out.println("нельзя кататься");
        }
        int age3 = 15;
        if (age3 > 14) {
            System.out.println("3.Если возраст ребенка " + age3 + " лет, то можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int seat = 60;
        if (seat > 60) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне не осталось сидячих мест");
        }

        int allSeat = 100;
        if (seat < 102) {
            System.out.println("В вагоне есть стоячие места");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int two = 2;
        int one = 1;
        int three = 3;
        if (two < one) {
            System.out.println("VVV");

        } else {
            System.out.println("FFF");
        }
    }
}