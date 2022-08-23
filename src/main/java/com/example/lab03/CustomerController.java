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
        Customer customers1 = new Customer();
        customers1.setID(ID);
        customers1.setName(n);
        customers1.setSex("Male");
        customers1.setAge(20);

        boolean b = false;
        customers.add(customers1);
        //customers.add(new Customer(ID,n,b,a));
    }
}
