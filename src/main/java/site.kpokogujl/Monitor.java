package main.java.site.kpokogujl;

public class Monitor {
    public String manufacturer;
    public String modelName;
    public int diagonal;
    public int screenHeight;
    public int screenWidth;
    public boolean isBroken;

    public Monitor(String manufacturer, String modelName, int diagonal){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.diagonal = diagonal;

    }

    public void setResolution(int height, int width){
        screenHeight = height;
        screenWidth = width;
    }

    public void printInfo(){
        if (isBroken){
            System.out.println("Monitor is broken!\n\n");
        } else{
            System.out.println("Manufacturer: " + manufacturer + "\n" + "Model: " + modelName + "\n" +
                    "Diagonal: " + diagonal + "\n" + "Resolution: " + screenHeight + "x" + screenWidth + "\n\n");
        }
    }

    public void toTrash(){
        isBroken = true;
    }
}
