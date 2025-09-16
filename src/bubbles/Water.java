package bubbles;

public abstract class Water {
    protected double temperature;
    protected String color;
    protected String transparency;
    protected String smell;

    public Water(double temperature, String color, String transparency, String smell) {
        this.temperature = temperature;
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}
