package com.shiyanlou.spring.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.shiyanlou.spring.dao.CustomerDAO;

@Component
public class CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    // public void setCustomerDAO(CustomerDAO customerDAO) {
    //     this.customerDAO = customerDAO;
    // }

    @Override
    public String toString() {
        return "CustomerService [customerDAO=" + customerDAO + "]";
    }

}