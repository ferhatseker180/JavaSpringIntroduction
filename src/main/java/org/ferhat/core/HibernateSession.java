package org.ferhat.core;

import org.ferhat.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

    public static Session session = null;

    public static Session getSession() {

        if (session == null) {
            SessionFactory sessionFactory = new Configuration().
                    configure("hibernate.cfg.xml").
                    addAnnotatedClass(Customer.class).buildSessionFactory();
            session = sessionFactory.openSession();
        }
        return session;
    }
}
