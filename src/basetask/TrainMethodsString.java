package basetask;

import java.util.Scanner;

public class TrainMethodsString {
    String wordMama = "Мама мыла раму";
    String wordPapa = "Папа мыоа раму";

    public void printMama() {
        System.out.println(wordMama);
    }

    public void printPapa() {
        System.out.println(wordPapa);
    }

    public void printMamaString() {
        System.out.println("Print string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(wordMama + " " + input);
    }
}
