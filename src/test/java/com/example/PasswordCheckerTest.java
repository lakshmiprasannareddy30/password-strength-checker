package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {

    @Test
    void testWeakPassword() {
        assertEquals("Weak", PasswordChecker.checkStrength("abc"));
    }

    @Test
    void testMediumPassword() {
        assertEquals("Medium", PasswordChecker.checkStrength("abc12345"));
    }

    @Test
    void testStrongPassword() {
        assertEquals("Strong", PasswordChecker.checkStrength("Abc@1234"));
    }
}
