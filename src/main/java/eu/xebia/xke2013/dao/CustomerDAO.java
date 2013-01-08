package eu.xebia.xke2013.dao;

import eu.xebia.xke2013.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class CustomerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Customer findCustomerByInternalCode(String internalCode) {
        Query query = entityManager.createQuery("FROM Customer c where c.internalCode = :internalCode");
        query.setParameter("internalCode", internalCode);
        return (Customer) query.getSingleResult();
    }

}
