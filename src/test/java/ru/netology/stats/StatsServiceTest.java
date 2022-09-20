package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void totalAmountSales() { // СУММА

        StatsService service = new StatsService(); // объект сервиса

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.amountSales(sales); //у объекта вызываем метод и передаем туда массив

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleSales() {  // СРЕДНЕЕ
        StatsService service = new StatsService(); // объект сервиса

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float expected = 180 / 12;
        float actual = service.middleSales(sales); //у объекта вызываем метод и передаем туда массив

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void maxMonthSales() {  // МАКСИМАЛЬНЫЙ МЕСЯЦ
        StatsService service = new StatsService(); // объект сервиса

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 7;
        int actual = service.maxMonthSales(sales); //у объекта вызываем метод и передаем туда массив

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void minMonthSales() {  // МАКСИМАЛЬНЫЙ МЕСЯЦ
        StatsService service = new StatsService(); // объект сервиса

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.minMonthSales(sales); //у объекта вызываем метод и передаем туда массив

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MonthsBelowAverage() { // МЕСЯЦЫ НИЖЕ СРЕДНЕГО
        StatsService service = new StatsService(); // объект сервиса

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthsBelowAverage(sales); //у объекта вызываем метод и передаем туда массив

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MonthsAboveAverage() { // МЕСЯЦЫ ВЫШЕ СРЕДНЕГО
        StatsService service = new StatsService(); // объект сервиса

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthsBelowAverage(sales); //у объекта вызываем метод и передаем туда массив

        Assertions.assertEquals(expected, actual);
    }
}
