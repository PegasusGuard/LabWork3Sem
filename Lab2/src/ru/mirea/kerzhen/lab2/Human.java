package ru.mirea.kerzhen.lab2;

public class Human {
    private Head head = new Head();
    private Hand lefthand = new Hand();
    private Hand righthand = new Hand();
    private Leg leftleg = new Leg();
    private Leg rightleg = new Leg();

//    public Human(){
//        Head head = new Head();
//        Hand lefthand = new Hand();
//        Hand righthand = new Hand();
//        Leg leftleg = new Leg();
//        Leg rightleg = new Leg();
//    }
    public String ishealthy(){
        return (this.head.isAttached() && this.head.getEnergized()<=100 && this.head.getEnergized()>=20 &&
                this.lefthand.isFunctioning() && this.lefthand.getFingers()==5 && this.righthand.isFunctioning()
                && this.righthand.getFingers()==5 && this.leftleg.isFunctioning() && this.leftleg.getFingers()==5
                && this.rightleg.isFunctioning() && this.rightleg.getFingers()==5 ? "The human is healthy" :
                "The human has some problems, check his status");
    }
    public void drinkEnergy(){
        this.head.setEnergized(this.head.getEnergized()+20);
        System.out.println("The human drank an energy drink and now has" + this.head.getEnergized() + "% energy");
    }
    public void sleep(){
        if (this.head.getEnergized()>=100)
            System.out.println("This human is way too energized to sleep");
        else {
            this.head.setEnergized(100);
            System.out.println("The human slept and is now fully energized");
        }
    }
    public void work(){
        if (this.head.getEnergized()>=20){
            this.head.setEnergized(this.head.getEnergized()-20);
            System.out.println("The human worked for an hour and now has" + this.head.getEnergized() + "% energy");
        }
        else
            System.out.println("This human is too tired, get some sleep or get an energy drink");
    }
    public void behead(){
        this.head.setAttached(false);
    }

    @Override
    public String toString() {
        return "Human{" +
                "\n head= " + this.head.toString() +
                "\n lefthand= " + this.lefthand.toString() +
                "\n righthand= " + this.righthand.toString() +
                "\n leftleg= " + this.leftleg.toString() +
                "\n rightleg= " + this.rightleg.toString() +
                "\n}";
    }
}
