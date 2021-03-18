package com.bankmanagement.system;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;
    private String bankId;
    private String bankAddress;
    private List<Customer> customerList;

    public Bank(String bankName, String bankId, String bankAddress) {
        this.bankName = bankName;
        this.bankId = bankId;
        this.bankAddress = bankAddress;
        customerList = new ArrayList<>();
//        customerList.add(customer);
    }

    public void setName(String bankName) {
        this.bankName = bankName;
    }

    public String getName() {
        return bankName;
    }

    public void setId(String bankId) {
        this.bankId = bankId;
    }

    public String getId() {
        return bankId;
    }

    public void setAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getAddress() {
        return bankAddress;
    }

    public List<Customer> getCustomer() {
        return customerList;
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }


    public void removeCustomer(String customerId) {
        Customer toRemove = null;
        for (Customer customer : customerList){
            if (customer.getCustomerId().equalsIgnoreCase(customerId)){
                toRemove = customer;
                break;
            }
        }
        customerList.remove(toRemove);
    }
}
