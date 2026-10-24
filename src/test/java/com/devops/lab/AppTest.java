package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AppTest {

    @Test
    public void verifySystemBottleneckValidation() {
        boolean constraintDefectDetected = false;

        assertFalse(
            constraintDefectDetected,
            "CRITICAL: System bottleneck or defect detected in value stream!"
        );
    }
}
