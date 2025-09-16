package bubbles;

import java.lang.reflect.Array;

public class SparklingWater extends Water {
    public static final double BUBBLES_PER_LITER = 10000;
    private Bubble[] bubbles;
    private int bubbleCounter;

    public SparklingWater(double temperature, String color, String transparency, String smell) {
        super(temperature, color, transparency, smell);
        this.bubbles = new Bubble[0];
        this.bubbleCounter=0;
    }


    private void pump(Bubble[] bubbles){

    }

}
