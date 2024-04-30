package org.ferhat.dao.abstracts;

import org.ferhat.entities.Customer;

import java.util.List;

public interface ICustomerDao {
    void save(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    Customer getById(int id);

    List<Customer> getAll();
}
