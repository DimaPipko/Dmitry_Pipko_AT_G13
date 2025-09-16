package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodPrimitive trainMethodPrimitive = new TrainMethodPrimitive();
        trainMethodPrimitive.printBoolean(true);
        trainMethodPrimitive.printByte(1);
        trainMethodPrimitive.printChar('c');
        trainMethodPrimitive.printFloat(333.33);
        trainMethodPrimitive.printInt(333333);
        trainMethodPrimitive.printLong(3234324);
        trainMethodPrimitive.printShort((short) 1);
        trainMethodPrimitive.printFloat(32e3);
    }
}
