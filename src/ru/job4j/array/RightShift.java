package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        while (count > 0) {
            int last = nums[nums.length - 1];
            int current;
            for (int i = 0; i < nums.length; i++) {
                current = nums[i];
                nums[i] = last;
                last = current;
            }
            count--;
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        int last = nums[nums.length - 1];
        int current;
        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            nums[i] = last;
            last = current;
        }
    }
}