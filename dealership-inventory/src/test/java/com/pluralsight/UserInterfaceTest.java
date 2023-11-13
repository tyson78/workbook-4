package com.pluralsight;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {
    UserInterface ui = new UserInterface();

    @Test
    void display() {

        ui.display();
    }

    @ParameterizedTest
    @ValueSource(strings = {"20230312"})
    void processSellOrLeaseVehicle_testContractDateFormat(String dateInput) {
        ui.processSellOrLeaseVehicle();

    }
}