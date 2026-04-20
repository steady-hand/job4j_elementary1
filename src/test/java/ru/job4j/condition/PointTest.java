package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenMin41to5min3then9dot8() {
        Point a = new Point(-4, 1);
        Point b = new Point(5, -3);
        double expected = 9.8;
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void when41to53then2dot2() {
        Point a = new Point(4, 1);
        Point b = new Point(5, 3);
        double expected = 2.2;
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.1));
    }
}