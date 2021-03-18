package com.bankmanagement.system;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("ebuka", "cus101", "08062611811",
                "kkjj@gmail.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void customerHasAName() {
        customer.setCustomerName("customerName");
        assertNotNull(customer.getCustomerName());
    }

    @Test
    void customerHasId(){
        customer.setCustomerId("customerId");
        assertNotNull(customer.getCustomerId());
    }

    @Test
    void customerHasPhoneNumber(){
        customer.setPhoneNumber("08062611811");
        assertNotNull(customer.getPhoneNumber());
    }

    @Test
    void customerHasEmail(){
        customer.setEmail("greatchidozie@gmail.com");
        assertNotNull(customer.getEmail());
    }

    @Test
    void customerHasAddress(){
        customer.setAddress("customerAddress");
        assertNotNull(customer.getAddress());
    }

    @Test
    void customerHasPassword(){
        customer.setPassword("password");
        assertNotNull(customer.getPassword());
    }
}