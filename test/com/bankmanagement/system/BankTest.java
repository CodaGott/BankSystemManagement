package com.bankmanagement.system;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Customer customer;

    Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank("Bank name", "bank Id", "Bank address");

        new Customer(" customer name", "Cus101", "093626525",
                "tome@gmail.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void bankHasName(){
        bank.setName("Guarantee Trust Bank");
        assertNotNull(bank.getName());
    }

    @Test
    void bankHasId(){
        bank.setId("GtB");
        assertNotNull(bank.getId());
    }

    @Test
    void bankHasAddress(){
        bank.setAddress("45 Yaba road");
        assertNotNull(bank.getAddress());
    }

    @Test
    void bankHasCustomer(){
        new Customer(" customer name", "Cus101", "093626525",
                "tome@gmail.com");
        bank.addCustomer(customer);
        assertEquals(1, bank.getCustomer().size());
    }

    @Test
    void bankCanRemoveCustomer(){
        bank.removeCustomer("Cus101");
        assertEquals(0, bank.getCustomer().size());
    }

    @Test
    void bankCanAddCustomer(){
        Customer newCustomer=new Customer("jkjksajk,", "hh", "999", "8i");
        bank.addCustomer(newCustomer);
        bank.addCustomer(newCustomer);
        bank.addCustomer(customer);
        assertEquals(3, bank.getCustomer().size());
    }
}