package ru.geekbrains.lesson1;

public class Wall implements Exercises{
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Creatures creatures) {
        if (creatures.jump(this.height)) {
            System.out.printf("%s %s перепрыгнул стену размером в %d метров.\n", creatures.getClass().getSimpleName(), creatures.getName(), height);
            return true;
        }
        System.out.printf("%s %s не смог перепрыгнуть стену размеров в %d метров.\n", creatures.getClass().getSimpleName(), creatures.getName(), height);
        return false;
    }

}
