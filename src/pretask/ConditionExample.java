package pretask;

public class ConditionExample {
    public static void main (String[] args){
        int conditionValue = (int) (Math.random() * 100);
        int condition = 10;
        boolean isBigger = false;
        if (conditionValue > condition){
            isBigger = true;
        }
        System.out.println(isBigger + " " + conditionValue);
    }
}
