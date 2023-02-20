package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/data.csv/data")
    public void theSquareRootInRange(int number, int squareRoot, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }
}


