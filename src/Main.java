public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 3. Переменные");
        System.out.println("Задача 1. Возраст совершеннолетия");
        // Задание возраста
        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то возраст совершеннолетия не наступил");
        }
        System.out.println("Задача 2. Температура и шапка");
        //Задание температуры
        int tempAir = 8;
        //Условие
        if (tempAir >= 5) {
            System.out.println("Сегодня тепло, " + tempAir + "гр.С. Можно идти без шапки");
        } else {
            System.out.println("Сегодня холодно, " + tempAir + "гр.С. Наденьте шапку");
        }
        System.out.println("Задача 3. Превышение скорости");
        //Задание скорости
        int speed = 50;
        //Условие
        if (speed <= 60) {
            System.out.println("Если скорость меньше 60 км/ч, то можно ездить спокойно. Ваша скорость " + speed + " км/ч.");
        } else {
            System.out.println("Ваша скорость " + speed + " км/ч. Это больше допустимого. Придется заплатить штраф");
        }
        System.out.println("Задача 4. Распределение по возрасту");
        //Задание возраста человека
        int ageMan = 24;
        //Условия выборки
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + " , то ему нужно ходить в детский сад.");
        }
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.println("Если возраст человека равен " + ageMan + " , то ему нужно ходить школу.");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + " , то его место в унивреситете.");
        }
        if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + " , то ему пора идти на работу.");
        }
        System.out.println("Задача 5. Ограничение по возрасту на аттракционе");
        //Задание возраста ребенка
        int childeAge = 10;
        //Условия выборки
        if (childeAge < 5) {
            System.out.println("Если возраст ребёнка равен " + childeAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childeAge >= 5 && childeAge < 14) {
            System.out.println("Если возраст ребёнка равен " + childeAge + ", то можно кататься на аттракционе в сопровождении взрослого.");
        } else if (childeAge >= 14) {
            System.out.println("Если возраст ребёнка равен " + childeAge + ", то можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("Задача 6. Вместимость вагона.");
        //Задание кол-ва пассажиров в вагоне
        int passengerCount = 100;
        //Условия выборки
        if (passengerCount > 102) {
            System.out.println("В вагоне месть нет");
        } else if (passengerCount > 1 && passengerCount <= 60) {
            System.out.println("В вагоне сейчас " + passengerCount + " чел. Есть сидячие места");
        } else if (passengerCount > 60 && passengerCount <= 102) {
            System.out.println("В вагоне сейчас " + passengerCount + " чел. Есть стоячие места");
        }
        System.out.println("Задача 7. Сравнение чисел.");
        //Задание чисел
        int oneNum = 7;
        int twoNum = 10;
        int threeNum = 8;
        //Условия сравнения чисел
        if (oneNum > twoNum && oneNum > threeNum) {
            System.out.println("Число one=" + oneNum + " больше остальных");
        } else if (twoNum > oneNum && twoNum > threeNum) {
            System.out.println("Число two=" + twoNum + " больше остальных");
        } else if (threeNum > oneNum && threeNum > twoNum) {
            System.out.println("Число three=" + threeNum + " больше остальных");
        }
    }
}