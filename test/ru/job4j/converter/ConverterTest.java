package ru.job4j.converter;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140.0f;
        float expected = 2.0f;
        float out = Converter.rubleToEuro(in);
        assertEquals(expected, out, 0.0);
    }

    @Test
    public void whenConvert140RblThen233Dollars() {
        float in = 140.0f;
        float expected = 2.33f;
        float out = Converter.rubleToDollar(in);
        assertEquals(expected, out, 0.01);
    }
}