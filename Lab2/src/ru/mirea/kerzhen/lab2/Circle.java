package ru.mirea.kerzhen.lab2;

public class Circle {
    private float radius;
    public Circle(){
        radius=5;
    }
    public Circle(float r){
        radius=r;
    }
    public float getRadius(){
        return radius;
    }
    public void setRadius(float r){
        this.radius = r;
    }
    public void zoomRadius(float z){
        this.radius *= z;
    }
    public float getPerimeter(){
        return (float) (2*Math.PI*radius);
    }
    public float getArea(){
        return (float) (Math.PI*radius*radius);
    }
    public String toString(){
        return "A circle with a radius of "+radius;
    }
}
