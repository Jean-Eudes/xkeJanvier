package eu.xebia.xke2013.dao;

import eu.xebia.xke2013.model.Invoice;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class InvoiceDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public long countNumberOfInvoiceByCustomer(String internalCode) {
        return 0;
    }

    public Invoice saveInvoice(Invoice invoice) {
        return null;
    }

    public Invoice findInvoiceByInvoiceNumber(String invoiceNumber) {
        return null;
    }

    public List<Invoice> findInvoiceByCustomer(String internalCode) {
        return null;
    }


}
