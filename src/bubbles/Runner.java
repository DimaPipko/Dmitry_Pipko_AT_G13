package bubbles;

public class Runner {
    public static void main(String[] args) {

        SparklingWater water05 = new SparklingWater(5.0, "clear", "transparent", "none");
        SparklingWater water1 = new SparklingWater(6.0, "clear", "transparent", "none");
        SparklingWater water15 = new SparklingWater(4.5, "clear", "transparent", "none");

        water05.pump(createBubbles((int) (0.5 * SparklingWater.BUBBLES_PER_LITER)));
        water1.pump(createBubbles((int) (1.0 * SparklingWater.BUBBLES_PER_LITER)));
        water15.pump(createBubbles((int) (1.5 * SparklingWater.BUBBLES_PER_LITER)));

        Bottle bottle1 = new Bottle(0.5, water05);
        Bottle bottle2 = new Bottle(1.0, water1);
        Bottle bottle3 = new Bottle(1.5, water15);

        bottle1.open();
        bottle1.open();
        bottle2.open();
        bottle2.open();
        bottle3.open();
        bottle3.open();
    }

    private static Bubble[] createBubbles(int count) {
        Bubble[] bubbles = new Bubble[count];
        for (int i = 0; i < count; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        return bubbles;
    }
}