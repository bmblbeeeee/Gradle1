package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;  // Чтобы получить кешбек, нужно потратить еще 1000 рублей
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;  // Чтобы получить кешбек, нужно потратить еще 500 рублей
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;  // Чтобы получить кешбек, нужно потратить еще 1000 рублей
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;  // Чтобы получить кешбек, нужно потратить еще 500 рублей
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs2500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;
        int expected = 500;  // Чтобы получить кешбек, нужно потратить еще 500 рублей
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;  // Чтобы получить кешбек, нужно потратить еще 1 рубль
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs1999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1999;
        int expected = 1;  // Чтобы получить кешбек, нужно потратить еще 1 рубль
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testRemainWhenAmountIs3500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3500;
        int expected = 500;  // Чтобы получить кешбек, нужно потратить еще 500 рублей
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs4999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4999;
        int expected = 1;  // Чтобы получить кешбек, нужно потратить еще 1 рубль
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs5000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;
        int expected = 1000;  // Чтобы получить кешбек, нужно потратить еще 1000 рублей
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}
