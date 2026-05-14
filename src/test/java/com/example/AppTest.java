package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void getMessageReturnsExpectedText() {
        assertEquals("Hello from Azure DevOps Maven Demo!", App.getMessage());
    }
}
