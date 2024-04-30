package org.ferhat.business.impl;

import org.ferhat.business.abstracts.ICustomerServices;
import org.ferhat.dao.abstracts.ICustomerDao;
import org.ferhat.dao.impl.CustomerDao;
import org.ferhat.entities.Customer;

import java.util.List;

public class CustomerManager implements ICustomerServices {

    private final ICustomerDao customerDao;

    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        Customer checkMail = this.findByMail(customer.getMail());
        if (checkMail != null) {
            throw new RuntimeException("Mail already exists");
        }
        this.customerDao.save(customer);
    }

    @Override
    public void update(Customer customer) {
        Customer checkMail = this.findByMail(customer.getMail());
        if (checkMail != null && checkMail.getId() != customer.getId()) {
            throw new RuntimeException("Mail already exists");
        }
        this.customerDao.update(customer);
    }

    @Override
    public void deleteById(int id) {
        this.customerDao.delete(this.getById(id));
    }

    @Override
    public Customer getById(int id) {
        return this.customerDao.getById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public Customer findByMail(String mail) {
        return customerDao.findByMail(mail);
    }


}
