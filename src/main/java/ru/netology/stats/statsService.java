package ru.netology.stats;

public class statsService {


    public int gitSalesAmount(int[] sales) {
        int salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {

            salesAmount = salesAmount + sales[i];
        }
        return salesAmount;
    }

    public int averageSalesAmount(int[] average) {
        int salesAverage = 0;
        for (int i = 0; i < average.length; i++) {
            //      salesAverage = salesAverage + average[i] / average.length;
            salesAverage = gitSalesAmount(average) / average.length;
        }
        return salesAverage;
    }

    public int gitNumberMax(int[] Max) {
        int salesMax = 0;
        for (int i = 0; i < Max.length; i++) {
            if (Max[i] >= Max[salesMax]) {
                salesMax = i + 1;
            }
        }
        return salesMax;
    }

    public int gitNumberMin(int[] Min) {
        int salesMin = 0;
        for (int i = 0; i < Min.length; i++) {
            if (Min[i] <= Min[salesMin]) {
                salesMin = i + 1;
            }
        }
        return salesMin;
    }

    public int belowAverage(int[] below) {
        int belowAver = averageSalesAmount(below);
        int month = 0;
        for (int i = 0; i < below.length; i++) {
            if (below[i] <= belowAver) {
                month++;
            }
        }
        return month;
    }

    public int moreAverage(int[] more) {
        int moreAver = averageSalesAmount(more);
        int month = 0;
        for (int i = 0; i < more.length; i++) {
            if (more[i] <= moreAver) {
                month++;
            }
        }
        return month;


    }
}
