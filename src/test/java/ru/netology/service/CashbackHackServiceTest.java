package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldReturn1000For0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldReturn999For1001() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn100For900() {
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
}