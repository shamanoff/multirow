package com.testingmulti.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudelin on 2/20/17.
 */

@Controller
public class CustomerController {

    private List<Customer> myList = new ArrayList<>();

    @RequestMapping(value = "/post-array", method = RequestMethod.POST)
    public String postArray(@ModelAttribute WrapperCustomers customers) {
//        System.out.println("customers " + customers.getCustomers() + " " + customers);
//        System.out.println(customers.getCustomers());
        myList = customers.getCustomers();

        myList.stream()
                .forEach(System.out::println);


        return "/index";
    }
}
