package ru.geekbrains.lesson1;

public class Homework1 {
    public static void main(String[] args) {

        Creatures[] creatures = {
                new Human("Михаил", 1000, 200),
                new Robot("Пиноккио", 3000, 500),
                new Cat("Борис", 500, 150),
                new Cat("Василий", 200, 200),
                new Robot("Железный дровосек", 4000, 1000),
                new Human("Юрий", 2000, 700),
        };

        Exercises[] exercises = {
                new Treadmill(200),
                new Wall(100),
                new Treadmill(800),
                new Wall(200),
                new Treadmill(2000),
                new Wall(300)
        };

        for (Creatures cre : creatures) {
            for (Exercises exe : exercises) {
                if(!exe.overcome(cre))
                    break;
            }
        }
    }
}
