package bubbles;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
    }

    public void open() {
        System.out.println("Opening " + volume + "L bottle...");
        water.degas();
    }

    public double getVolume() {
        return volume;
    }

    public SparklingWater getWater() {
        return water;
    }
}