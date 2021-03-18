package com.bankmanagement.system;

public class Customer {

    private String customerName;
    private String customerId;
    private String phoneNumber;
    private String email;
    private String customerAddress;
    private String password;

    public Customer(String customerName, String customerId, String phoneNumber, String email) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {return customerName;}

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {return customerId;}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {return  email;
    }

    public void setAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getAddress() {return customerAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {return password;}
}
