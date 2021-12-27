package main.java.site.kpokogujl;

public class MyClass {
    public static void main(String [] args){

        Monitor myMonitor = new Monitor("Samsung", "F24", 24);
        myMonitor.setResolution(1920, 1080);
        myMonitor.getInfo();
        myMonitor.toTrash();
        myMonitor.getInfo();

        Monitor mySecondMonitor = new Monitor("LG", "IPS236", 24);
        mySecondMonitor.setResolution(1920, 1080);
        mySecondMonitor.getInfo();

        Pen penOne = new Pen("Parker", PenType.roller);
        Pen penTwo = new Pen("Erich Krause", PenType.gel);
        penOne.getStatus();
        penTwo.getStatus();
        penOne.isEmpty = true;
        penOne.getStatus();
        penOne.fillPen();
        penTwo.fillPen();
        penOne.getStatus();
    }
}
