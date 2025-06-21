package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    @Test
    void testMain() {
        // Capture System.out output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        try {
            // Execute main method
            App.main(new String[]{});
            
            // Verify output
            String actualOutput = outputStream.toString().trim();
            assertEquals("Hello, World!", actualOutput);
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }
}
