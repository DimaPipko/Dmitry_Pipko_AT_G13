package bubbles;

public class Bubble {
    private static final double VOLUME_MM3 = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public String getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(String gasComposition) {
        this.gasComposition = gasComposition;
    }
    public void pop() {
        System.out.println("Cramp!");
    }
}
