package basetask;

public class TrainMethodsIf {
    public int returnNewInt(int value) {
        return value < 8 ? value * 7 : value / 4;
    }

    public long returnNewLong(long value) {
        return value > 300 ? value - 300 : value + 20;
    }

    public String returnNewChar(char value) {
        return value == 'g' ? "go" : "o" + value;
    }

    public float returnNewFloat(float value) {
        return value == 0.67f ? value : value * 2f;
    }

    public double returnNewDouble(double value) {
        if (value > 30 && value < 80) {
            return value + 87;
        } else if (value > 80 && value < 400) {
            return value / 4;
        } else {
            return value;
        }
    }

    public void returnNewBoolean(boolean value) {
        System.out.println(value ? "Я получил на вход значение истины" : "Я получил на вход ложь");
    }
}
