package ru.netology.sqr;


public class SQRService {

    public int squareRoot(int min, int max) {
        int result = 0;

        for (int number = 10; number <= 99; number++) {
            int sqRoot = number * number;
            if (sqRoot >= min && sqRoot <= max) {
                result++;
            }
        }
        return result;
    }
}

