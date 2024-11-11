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
        int t=8;
        //Условие
        if (t>=5) {
            System.out.println("Сегодня тепло, "+t+"гр.С. Можно идти без шапки");
        } else {
            System.out.println("Сегодня холодно, " + t + "гр.С. Наденьте шапку");
        }
        System.out.println("Задача 3. Превышение скорости");
        //Задание скорости
        int speed=50;
        //Условие
        if (speed<=60) {
            System.out.println("Если скорость меньше 60 км/ч, то можно ездить спокойно. Ваша скорость "+speed+ " км/ч.");
        } else {
            System.out.println("Ваша скорость "+speed+" км/ч. Это больше допустимого. Придется заплатить штраф");
        }
        System.out.println("Задача 4. Распределение по возрасту");
        //Задание возраста человека
        int age1=24;
        //Условия выборки
        if (age1>=2 && age1<=6) {
            System.out.println("Если возраст человека равен "+age1+" , то ему нужно ходить в детский сад.");
        }
        if (age1>=7 && age1<=17) {
            System.out.println("Если возраст человека равен "+age1+" , то ему нужно ходить школу.");
        }
        if (age1>=18 && age1<=24) {
            System.out.println("Если возраст человека равен "+age1+" , то его место в унивреситете.");
        }
        if (age1>24) {
            System.out.println("Если возраст человека равен "+age1+" , то ему пора идти на работу.");
        }
        System.out.println("Задача 5. Ограничение по возрасту на аттракционе");
        //Задание возраста ребенка
        int age2=10;
        //Условия выборки
        if (age2<5) {
            System.out.println("Если возраст ребёнка равен "+age2+", то ему нельзя кататься на аттракционе.");
        }
        else if (age2>=5 && age2<14) {
            System.out.println("Если возраст ребёнка равен "+age2+", то можно кататься на аттракционе в сопровождении взрослого.");
        }
        else if (age2>=14) {
            System.out.println("Если возраст ребёнка равен " + age2 + ", то можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("Задача 6. Вместимость вагона.");
        //Задание кол-ва пассажиров в вагоне
        int passenger=100;
        //Условия выборки
        if (passenger>102) {
            System.out.println("В вагоне месть нет");
        }
        else if (passenger>1 && passenger<=60) {
            System.out.println("В вагоне сейчас "+passenger+" чел. Есть сидячие места");
        }
        else if (passenger>60 && passenger<=102) {
            System.out.println("В вагоне сейчас "+passenger+" чел. Есть стоячие места");
        }
        System.out.println("Задача 7. Сравнение чисел.");
        //Задание чисел
        int one=7;
        int two=12;
        int three=8;
        //Условия сравнения чисел
        if (one>two && one>three) {
            System.out.println("Число one="+one+" больше остальных");
        } else if (two>one && two>three) {
            System.out.println("Число two="+two+" больше остальных");
        } else if (three>one && three>two) {
            System.out.println("Число three="+three+" больше остальных");
        }
    }
}