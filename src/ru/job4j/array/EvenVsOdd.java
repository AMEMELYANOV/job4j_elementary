package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sumEven += players[i];
                continue;
            }
            sumOdd += players[i];
        }
        if (sumEven != sumOdd) {
            return sumOdd > sumEven ? 2 : 1;
        }
        return 0;
    }
}