package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipFileManagerTest {

    DealershipFileManager dfm = new DealershipFileManager();

    @Test
    void getDealership_doesntThrowException() {
        dfm.getDealership();
    }

    @Test
    void getDealership_dealershipInfoReadCorrectly() {
        Dealership d = dfm.getDealership();
        assertEquals("D & B Used Cars", d.getName());
        assertEquals("111 Old Benbrook Rd", d.getAddress());
        assertEquals("817-555-5555", d.getPhone());
    }

    @Test
    void saveDealership() {
    }
}