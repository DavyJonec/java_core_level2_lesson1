package ru.geekbrains.lesson1;

public class Treadmill implements Exercises{
    private  int length;
    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Creatures creatures) {
        if (creatures.run(this.length)) {
            System.out.printf("%s %s пробежал дистанцию %d метров.\n", creatures.getClass().getSimpleName(), creatures.getName(), length);
            return true;
        }
        System.out.printf("%s %s не смог пробежать дистанцию в %d метров.\n", creatures.getClass().getSimpleName(), creatures.getName(), length);
        return false;
    }
}
