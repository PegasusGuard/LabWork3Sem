package ru.mirea.kerzhen.lab2;

public class Head {
    private boolean attached;
    private int energized;

    public Head() {
        this.attached=true;
        this.energized=100;
    }

    public Head(boolean attached) {
        this.attached = attached;
        this.energized=100;
    }

    public Head(int energized) {
        this.energized = energized;
        this.attached=true;
    }

    public Head(boolean attached, int energized) {
        this.attached = attached;
        this.energized = energized;
    }

    public boolean isAttached() {
        return attached;
    }

    public void setAttached(boolean attached) {
        this.attached = attached;
    }

    public int getEnergized() {
        return energized;
    }

    public void setEnergized(int energized) {
        this.energized = energized;
    }

    @Override
    public String toString() {
        return "Your head is " + (attached ? "attached " : "disembodied ") + "and your mind is "+ energized + "% energized";
    }
}
