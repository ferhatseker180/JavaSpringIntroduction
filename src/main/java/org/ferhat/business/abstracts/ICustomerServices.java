package org.ferhat.business.abstracts;

import org.ferhat.entities.Customer;

import java.util.List;

public interface ICustomerServices {
    void save(Customer customer);

    void update(Customer customer);

    void deleteById(int id);

    Customer getById(int id);

    List<Customer> getAll();

    Customer findByMail(String mail);
}
