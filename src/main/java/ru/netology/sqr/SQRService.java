package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int range, int rangeMax) {
        for (int number = 10; number <= 99; number++) {
            int squareRoot = number * number;
            if ((squareRoot >= range) && (squareRoot <= rangeMax)) {
                return 3;

            }
        }
        return -1;
    }
}

