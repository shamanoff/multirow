package com.testingmulti.model;

import java.util.ArrayList;
import java.util.List;


public class WrapperCustomers {

    private List<Customer> customers;

    public WrapperCustomers(){
        customers = new ArrayList<>();
    }

    public List<Customer> getCustomers(){
        return this.customers;
    }
}
