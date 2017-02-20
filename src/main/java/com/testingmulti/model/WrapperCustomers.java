package com.testingmulti.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudelin on 2/20/17.
 */
public class WrapperCustomers {

    private List<Customer> customers;

    public WrapperCustomers(){
        customers = new ArrayList<>();
    }

    public List<Customer> getCustomers(){
        return this.customers;
    }
}
