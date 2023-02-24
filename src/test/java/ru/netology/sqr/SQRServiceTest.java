package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,15,225",
            "3,16,256",
            "3,17,289"
    })
    public void theSquareRootInRange(int expected, int number, int sqRoot) {
        SQRService service = new SQRService();

        int actual = service.squareRoot(200, 300);
        Assertions.assertEquals(expected, actual);
    }
}
