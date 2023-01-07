public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 20;
        String message;
        if (age>=18) {
            message = " он совершеннолетний";
        } else {
            message = " он не достиг совершеннолетия, нужно немного подождать";
        }
        System.out.println("Если возраст человека равен " + age + message);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float temperature = 10.2f;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else{
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        float speedLimit = 60.0f;
        float speed = 70f;
        if (speed <= speedLimit) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        } else{
            System.out.println("Если скорость " + speed + " км/ч, то  придется заплатить штраф.");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 14;
        if (age <= 6 && age>=2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age < 18 && age>=7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age < 24 && age>= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в угиверситет.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходитьна работу.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age < 14 && age >= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");
        int capacity = 102;
        int seats = 60;
        int passengers = 72;
        if (passengers < seats) {
            System.out.println("В вагоне есть сидячее место.");
        } else {
            if (passengers < capacity) {
                System.out.println("В вагоне есть стоячее место.");
            } else {
                System.out.println("В вагоне свободных мет нет");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 101;
        int two = 2;
        int three = 500;
        if (one <= two && three <= two) {
            System.out.println("Наибольшее чмсло:" + two);
        } else {
            if (one <= three && two <= three) {
                System.out.println("Наибольшее чмсло:" + three);
            } else {
                System.out.println("Наибольшее чмсло:" + one);
            }
        }
    }
}