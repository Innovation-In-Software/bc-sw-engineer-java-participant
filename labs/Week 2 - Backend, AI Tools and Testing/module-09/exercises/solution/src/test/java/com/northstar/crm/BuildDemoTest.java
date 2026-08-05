package com.northstar.crm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildDemoTest {
    @Test
    void greetingMatchesBanner() {
        assertEquals("BuildDemo ready for Lab 9", BuildDemo.greeting());
    }
}
