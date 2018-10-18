package ru.mirea.kerzhen.lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circ1 = new Circle();
        System.out.println(circ1);
        circ1.setRadius(3);
        System.out.println(circ1);
        circ1.zoomRadius(4);
        System.out.println(circ1);
        System.out.println("Circle's area: "+ circ1.getArea());
        System.out.println("Circle's length: "+ circ1.getPerimeter());
    }
}
