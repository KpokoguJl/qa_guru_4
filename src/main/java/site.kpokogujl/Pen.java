package main.java.site.kpokogujl;

public class Pen {
    String name;
    PenType type;
    boolean isEmpty;

    public Pen(String name, PenType type){
        this.name = name;
        this.type = type;
    }

    public void printStatus(){
        if (isEmpty){
            System.out.println("You must fill more ink in " + name + "!");
        } else {
            System.out.println("Everything is good! " + name + " can write many more letters.");
        }
    }

    public void fillPen(){
        if(!isEmpty){
            System.out.println(name + " is full!");
        } else{
            isEmpty = false;
            System.out.println(name + " successful filled.");
        }
    }
}
