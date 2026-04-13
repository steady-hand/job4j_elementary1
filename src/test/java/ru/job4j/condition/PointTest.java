package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenMin41to5min3then9dot8() {
        double expected = 9.8;
        int x1 = -4;
        int y1 = 1;
        int x2 = 5;
        int y2 = -3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void when41to53then2dot2() {
        double expected = 2.2;
        int x1 = 4;
        int y1 = 1;
        int x2 = 5;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }
}