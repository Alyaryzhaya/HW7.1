package ru.netology.stats;

public class StatsService {
    public long amountSales(long[] sales) { // метод Сложения

        // ЦИКЛ FOR
//        long sumSale = 0; // первой продаже присваиваем значение ячейки 0
//
//        for (int i = 0; i < sales.length; i++) {
//            sumSale = sumSale + sales[i];

//=============================================================================

        // ЦИКЛ FOR-EACH
        long sumSale = 0; // первой продаже присваиваем значение ячейки 0
        for (long s : sales) { // элемент s в массиве sales перебирается

            //sumSale = sumSale + s;
            sumSale += s;
        }
        return sumSale;
    }
//============================================================================
    public long middleSales(long[] sales) { // метод Среднего

        // ЦИКЛ FOR-EACH
//        long sumSale = 0;
//        for (long s : sales) { // элемент s в массиве sales перебирается
//
//            //sumSale = sumSale + s;
//            sumSale += s;
//        }
//        return sumSale / 12;
        return amountSales(sales) / 12;  // возвращаем результат предыдущего метода (сложения) и делим на 12
    }
//==============================================================================
    public int maxMonthSales(long[] sales) { // метод Месяц с максимальными продажами

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
                //  }else if (sales[i] == sales[maxMonth]) {
                //     maxMonth = i++;
            }
        }
        return maxMonth;
    }
//============================================================================================
    // РАЗБОР
//        long maxSale = sales[0]; // максимальная продажа = продажа в первом элементе массива
//        int maxMonth = 0;  // максимальный месяц - первая ячейка массива
//
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] >= maxSale) {
//                maxSale = sales[i];
//                maxMonth = i;
//            }
//        }
//        return maxMonth;
//    }
//==========================================================================================
    public int minMonthSales(long[] sales) { // метод Месяц с минимальными продажами

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }
//==================================================================================================
    public int monthsBelowAverage(long[] sales) { // метод Количество месяцев ниже среднего

        int monthBelow = 0; // месяцы ниже среднего
        long middleSale = middleSales(sales); // в переменную middleSale кладем результат метода вычисления среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleSale) {  // если продажи в ячейке i ниже среднего,
                monthBelow++;  // добавляй в месяцы ниже среднего по единице
            }
        }
        return monthBelow;
    }
//=====================================================================================================

    // РАЗБОР, ЦИКЛ FOR-EACH
//        long middleSale = middleSales(sales); //в переменную middleSale кладем результат метода вычисления среднего
//        int monthBelow = 0; // месяцы ниже среднего
//
//        for (long sale : sales) {
//            if (sale < middleSale) {
//                monthBelow++;
//            }
//        }
//        return monthBelow;
//    }
//======================================================================================================
    public int monthsAboveAverage(long[] sales) { // метод Количество месяцев выше среднего

        int monthAbove = 0; // месяцы выше среднего
        long middleSale = middleSales(sales); // в переменную middleSale кладем результат метода вычисления среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleSale) {  // если продажи в ячейке i выше среднего,
                monthAbove++;  // добавляй в месяцы ниже среднего по единице
            }
        }
        return monthAbove;
    }
}


