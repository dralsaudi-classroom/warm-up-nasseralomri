package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestHello {

    @Test
    public void testHelloWorld() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        try {
            // Action: Run Hello.main
            Hello.main(null);

            // Assertion: Check if the output is "Hello world!\n"
            assertEquals("Hello world!" + System.lineSeparator(), bos.toString());
        } finally {
            // Reset System.out
            System.setOut(originalOut);
        }
    }
}
