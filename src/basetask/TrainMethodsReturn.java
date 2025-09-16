package basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int firstInt) {
        return firstInt * 3;
    }

    public long returnNewLong(long firstLong) {
        return firstLong - 4;
    }

    public String returnNewChar(char firstChar) {
        return "" + firstChar + firstChar;
    }

    public float returnNewFloat(float firstFloat) {
        return firstFloat / 2f;
    }

    public double returnNewDouble(double firstDouble) {
        return firstDouble + 8;
    }

    public short returnNewShort(short firstShort) {
        return (short) (firstShort - 1);
    }

    public byte returnNewByte(byte firstByte) {
        return (byte) (firstByte * 2);
    }

    public boolean returnNewBoolean(boolean firstBoolean) {
        return !firstBoolean;
    }
}
