package ru.mirea.kerzhen.lab2;

public class Hand {
    private int fingers;
    private boolean functioning;
    public Hand(){
        fingers=5;
        functioning=true;
    }
    public Hand(int f){
        fingers=f;
        functioning=true;
    }
    public Hand(int f, boolean fu){
        fingers=f;
        functioning=fu;
    }
    public Hand(boolean fu){
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
        return "This hand has "+fingers+" fingers and is "+(functioning ? "functioning" : "not functioning");
    }
}
