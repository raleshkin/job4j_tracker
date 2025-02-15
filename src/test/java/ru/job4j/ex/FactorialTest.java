package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    public void whenException() {
        IllegalArgumentException exceprion = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-1);
                });
        assertThat(exceprion.getMessage()).isEqualTo("Number could not be less 0.");
    }

    @Test
    public void whenCorrectCalculation() {
        int number = 5;
        int result = new Factorial().calc(number);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }
}