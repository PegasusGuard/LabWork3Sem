package ru.mirea.kerzhen.lab2;

public class Leg {
    private int fingers;
    private boolean functioning;
    public Leg(){
        fingers=5;
        functioning=true;
    }
    public Leg(int f){
        fingers=f;
        functioning=true;
    }
    public Leg(int f, boolean fu){
        fingers=f;
        functioning=fu;
    }
    public Leg(boolean fu){
        functioning=fu;
        fingers=5;
    }

    public int getFingers() {
        return fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public boolean isFunctioning() {
        return functioning;
    }

    public void setFunctioning(boolean functioning) {
        this.functioning = functioning;
    }
    public String toString(){
        return "This leg has "+fingers+" fingers and is "+(functioning ? "functioning" : "not functioning");
    }
}
