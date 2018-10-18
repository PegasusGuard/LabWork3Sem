package ru.mirea.kerzhen.lab2;

public class TestHuman {
    public static void main(String[] args) {
        Human hum = new Human();
        System.out.println(hum.ishealthy());
        hum.behead();
        System.out.println(hum.ishealthy());
        System.out.println(hum);
        hum.work();
        hum.work();
        hum.work();
        hum.work();
        hum.work();
        hum.work();
        hum.drinkEnergy();
        hum.sleep();
    }
}
