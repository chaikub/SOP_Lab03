package com.example.lab03;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class CustomerController {
    private List<Customer> customers = new ArrayList<>();

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return  customers;
    }
    @RequestMapping(value = "/customersbyid/{id}", method = RequestMethod.GET)
    public Customer getCustomerByID (@PathVariable("id") String ID){
        return customers.get(0);
    }
    @RequestMapping(value = "/customersbyname/{n}", method = RequestMethod.GET)
    public Customer getCustomerByName (@PathVariable("n") String ID){
        return customers.get(0);
    }
    @RequestMapping(value = "/customersDelbyid/{id}", method = RequestMethod.DELETE)
    public boolean delCustomerByID (@PathVariable("id") String ID){
        return  false;
    }
    @RequestMapping(value = "/customersDelbyname/{n}", method = RequestMethod.DELETE)
    public boolean delCustomerByName (@PathVariable("n") String name){
        return  false;
    }
    public boolean addCustomer(String ID, String n, String s, int a){
        customers.add(new Customer("1010","John",true,25));
        customers.add(new Customer("1018","Peter",true,24));
        customers.add(new Customer("1019","Sara",false,23));
        customers.add(new Customer("1110","Rose",false,23));
        customers.add(new Customer("1001","Emma",false,30));
        boolean b = false;
        if(s == "Female" ^ s == "female"){
            b = false;
        } else if (s == "Male" ^ s == "male") {
            b = true;
        }
        customers.add(new Customer(ID,n,b,a));
        return true;
    }
}
