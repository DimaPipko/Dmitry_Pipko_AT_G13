package bubbles;

public class SparklingWater extends Water {
    public static final double BUBBLES_PER_LITER = 10000;
    private Bubble[] bubbles;

    public SparklingWater(double temperature, String color, String transparency, String smell) {
        super(temperature, color, transparency, smell);
        this.bubbles = new Bubble[0];
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {
        if (bubbles == null || bubbles.length == 0) {
            System.out.println("No gas to release.");
            return;
        }

        for (Bubble bubble : bubbles) {
            if (bubble != null) {
                bubble.pop();
            }
        }

        bubbles = new Bubble[0];
    }
}