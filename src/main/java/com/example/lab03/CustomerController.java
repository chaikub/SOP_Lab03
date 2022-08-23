package com.example.lab03;

import javax.management.monitor.StringMonitor;
import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers(){

    }
    public Customer getCustomerByID (String ID){

    }
    public Customer getCustomerByName (String ID){

    }
    public boolean delCustomerByID (String ID){
        return  false;
    }
    public boolean delCustomerByName (String ID){
        return  false
    }
    public boolean addCustomer(String ID, String n, String s, int a){
        boolean b = false;
        if(s == "Female" ^ s == "female"){
            b = false;
        } else if (s == "Male" ^ s == "male") {
            b = true;
        }
        customers.add(new Customer(ID,n,b,a));
    }
}
