package org.ferhat.dao.impl;

import org.ferhat.core.HibernateSession;
import org.ferhat.dao.abstracts.ICustomerDao;
import org.ferhat.entities.Customer;
import org.hibernate.Session;

import java.util.List;

public class CustomerDao implements ICustomerDao {

    private final Session session;

    public CustomerDao() {
        this.session = HibernateSession.getSession();
    }

    @Override
    public void save(Customer customer) {
        this.session.beginTransaction();
        this.session.persist(customer);
        this.session.getTransaction().commit();
    }

    @Override
    public void update(Customer customer) {
        this.session.beginTransaction();
        this.session.persist(customer);
        this.session.getTransaction().commit();
    }

    @Override
    public void delete(Customer customer) {
        this.session.beginTransaction();
        this.session.remove(customer);
        this.session.getTransaction().commit();
    }

    @Override
    public Customer getById(int id) {
        return this.session.get(Customer.class, id);
    }

    @Override
    public List<Customer> getAll() {
        return this.session.createSelectionQuery("FROM Customer", Customer.class).getResultList();
    }
}
