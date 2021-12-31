package main.java.site.kpokogujl;

public class Main {
    public static void main(String[] args){

        Monitor myMonitor = new Monitor("Samsung", "F24", 24);
        myMonitor.setResolution(1920, 1080);
        myMonitor.printInfo();
        myMonitor.toTrash();
        myMonitor.printInfo();

        Monitor mySecondMonitor = new Monitor("LG", "IPS236", 24);
        mySecondMonitor.setResolution(1920, 1080);
        mySecondMonitor.printInfo();

        Pen penOne = new Pen("Parker", PenType.ROLLER);
        Pen penTwo = new Pen("Erich Krause", PenType.GEL);
        penOne.printStatus();
        penTwo.printStatus();
        penOne.isEmpty = true;
        penOne.printStatus();
        penOne.fillPen();
        penTwo.fillPen();
        penOne.printStatus();
    }
}
