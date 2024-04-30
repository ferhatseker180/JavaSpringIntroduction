package org.ferhat.view;

import org.ferhat.business.impl.CustomerManager;
import org.ferhat.dao.impl.CustomerDao;
import org.ferhat.entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new CustomerDao());
        Customer customer = new Customer();

        customer.setName("Ferhat");
        customer.setGender(Customer.Gender.MALE);
        customer.setMail("ferhat@mail.com");
        customer.setOnDate(LocalDate.now());


       // customer.setMail("ferhat1@mail.com");

      //  customerManager.save(customer);
       // customerManager.deleteById(5);
       // customerManager.update(customer);
        System.out.println(customerManager.getAll());

        // Customer customer1 = customerManager.getById(1);
        // System.out.println(customer1.toString());
    }
}