package org.example.hwarray.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMiddleValueSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 15;
        int actual = service.middleValueSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBelowMiddleValueSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.belowMiddleValueSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindHigherMiddleValueSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.higherMiddleValueSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
