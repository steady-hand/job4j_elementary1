package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class FitTest {

    @Test
    void whenMan187Then100and05() {
        short input = 187;
        double expected = 100;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenWoman176Then75and8() {
        short input = 176;
        double expected = 75.89;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}