package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(0, 0, 5, 0);
        assertThat(way, is(0));
    }

    @Test
    public void wayIs1() {
        int way = ChessBoard.way(4, 5, 5, 6);
        assertThat(way, is(1));
    }

    @Test
    public void wayIs2() {
        int way = ChessBoard.way(1, 5, 3, 7);
        assertThat(way, is(2));
    }

    @Test
    public void wayIs3() {
        int way = ChessBoard.way(1, 3, 4, 0);
        assertThat(way, is(3));
    }

    @Test
    public void wayIs4() {
        int way = ChessBoard.way(6, 2, 2, 6);
        assertThat(way, is(4));
    }

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(1, 1, 6, 6);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs6() {
        int way = ChessBoard.way(6, 0, 0, 6);
        assertThat(way, is(6));
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(0, 0, 7, 7);
        assertThat(way, is(7));
    }

}