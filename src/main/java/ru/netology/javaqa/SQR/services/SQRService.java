package ru.netology.javaqa.SQR.services;

public class SQRService {

    public int calcSqr(int lowerLimit, int upperLimit) {
        int sqr = 0;

        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                sqr = sqr + 1;
            }

        }
        return sqr;
    }
}
