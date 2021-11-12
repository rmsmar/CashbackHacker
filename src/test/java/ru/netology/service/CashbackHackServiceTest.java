package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1000For0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn999For1001() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn100For900() {
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn0For1000() {
        int amount =1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}