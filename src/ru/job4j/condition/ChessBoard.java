package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
//        int rsl = 0;
//        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
//            rsl = Math.abs(x2 - x1);
//        }
//        return rsl;
        return Math.abs(x1 - x2) == Math.abs(y1 - y2) ? Math.abs(x1 - x2) : 0;
    }

    public static void main(String[] args) {
        System.out.println(way(4, 6, 0, 2));
        System.out.println(way(5, 5, 8, 8));
    }
}