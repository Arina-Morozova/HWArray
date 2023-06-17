package org.example.hwarray.services;

public class StatsService {


    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            }
        return sum;
    }


    public int middleValueSales(int[] sales) {
        int sum = sumSales(sales);
        int mid = sum / sales.length;
        return mid;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int belowMiddleValueSales(int[] sales) {
       int mid = middleValueSales(sales);
       int belowMid = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mid) {
                belowMid++;
            }
        }
        return belowMid;
    }


    public int higherMiddleValueSales(int[] sales) {
        int mid = middleValueSales(sales);
        int higherMid = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > mid) {
                higherMid++;
            }
        }
        return higherMid;
    }
}
