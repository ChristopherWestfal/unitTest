package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_shouldReturn6_whenCalledWith3And3() {
        int expected = 6;
        assertEquals(expected, Main.add(3,3));
    }

    @Test
    void multi_shouldReturn24_whenCalledWith8And3() {
        int expected = 24;
        assertEquals(expected, Main.multi(8,3));
    }

    @Test
    void multi_shouldReturn0_whenCalledWith8And0() {
        int expected = 0;
        assertEquals(expected, Main.multi(8,0));
    }

    @Test
    void convertToUppercase_shouldReturnTEXT_whenCalledWithtext() {
        String expected = "TEXT";
        assertEquals(expected, Main.convertToUppercase("text"));
    }

    @Test
    void convertToUppercase_shouldReturnTEXT_whenCalledWithTeXt() {
        String expected = "TEXT";
        assertEquals(expected, Main.convertToUppercase("TeXt"));
    }

    @Test
    void convertToUppercase_shouldReturnTEXT_whenCalledWithTEXT() {
        String expected = "TEXT";
        assertEquals(expected, Main.convertToUppercase("TEXT"));
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWith2() {
        assertTrue(Main.isEven(2));
    }

    @Test
    void isEven_shouldReturnFalse_whenCalledWith1() {
        assertFalse(Main.isEven(1));
    }

    @Test
    void isPositive_shouldReturnTrue_whenCalledWith2() {
        assertTrue(Main.isEven(2));
    }

    @Test
    void isPositive_shouldReturnFalse_whenCalledWith1() {
        assertFalse(Main.isEven(-1));
    }
}