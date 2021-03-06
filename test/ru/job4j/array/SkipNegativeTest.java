package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void skipALL() {
        int[][] in = {
                {-5, -2},
                {-2, -2}
        };
        int[][] expect = {
                {0, 0},
                {0, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void skipNone() {
        int[][] in = {
                {5, 2},
                {2, 2}
        };
        int[][] expect = {
                {5, 2},
                {2, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}