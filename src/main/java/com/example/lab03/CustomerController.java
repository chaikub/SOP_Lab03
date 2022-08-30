package com.example.lab03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class CustomerController {
    private List<Customer> customers = new ArrayList<>();

    public CustomerController(){
        customers.add(new Customer("1010","John",true,25));
        customers.add(new Customer("1018","Peter",true,24));
        customers.add(new Customer("1019","Sara",false,23));
        customers.add(new Customer("1110","Rose",false,23));
        customers.add(new Customer("1001","Emma",false,30));
    }
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return  customers;
    }
    @RequestMapping(value = "/customersbyid/{id}", method = RequestMethod.GET)
    public Customer getCustomerByID (@PathVariable("id") String ID){
        int index = 0;
        for(int i = 0; i < customers.size();i++){
            if(ID.equals(customers.get(i).getID())){
                index = i;
            }
        }
        return customers.get(index);
    }
    @RequestMapping(value = "/customersbyname/{n}", method = RequestMethod.GET)
    public Customer getCustomerByName (@PathVariable("n") String name){
        int index = 0;
        for(int i = 0; i < customers.size();i++){
            if(name.equals(customers.get(i).getName())){
                index = i;
            }
        }
        return customers.get(index);
    }
    @RequestMapping(value = "/customersDelbyid/{id}", method = RequestMethod.DELETE)
    public boolean delCustomerByID (@PathVariable("id") String ID){
        int index = 0;
        for (int i = 0; i < customers.size();i++){
            if(ID.equals(customers.get(i).getID())){
                index = i;
            }
        }
        customers.remove(index);
        for (int i = 0; i < customers.size();i++){
            if(!ID.equals(customers.get(i).getID())){
                return true;
            }
        }
        return  false;
    }
    @RequestMapping(value = "/customersDelbyname/{n}", method = RequestMethod.DELETE)
    public boolean delCustomerByName (@PathVariable("n") String name){
        int index = 0;
        for (int i = 0; i < customers.size();i++){
            if(name.equals(customers.get(i).getName())){
                index = i;
            }
        }
        customers.remove(index);
        for (int i = 0; i < customers.size();i++){
            if(!name.equals(customers.get(i).getName())){
                return true;
            }
        }
        return  false;
    }
    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer(@RequestParam("id") String ID,
                               @RequestParam("name")String n,
                               @RequestParam("sex") String s,
                               @RequestParam("age") int a){
        boolean b = false;
        if(s.equals("Female") || s.equals("female")){
            b = false;
        } else if (s.equals("Male") || s.equals("male")) {
            b = true;
        }
        if(a < 0 ){
            a = 0;
        }
        customers.add(new Customer(ID,n,b,a));
        return true;
    }
}
