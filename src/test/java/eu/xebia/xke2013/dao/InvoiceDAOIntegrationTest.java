package eu.xebia.xke2013.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class InvoiceDAOIntegrationTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private InvoiceDAO invoiceDAO;

    @Test
    public void should_create_invoice_with_one_line() {
        //TODO
    }

    @Test
    public void should_find_invoice_by_invoice_number() {
        //TODO
        // add an invoice in the file import.sql
    }

    @Test
    public void should_find_invoice_by_customer_code() {
        //TODO
        // add an invoice in the file import.sql
    }

    @Test
    public void should_count_number_of_invoice_by_customer_code() {
        //TODO
        // add an invoice in the file import.sql
    }

    @Test
    public void should_create_invoice_with_two_lines_and_remove_one_line() {
        //TODO
        // create invoice with two lines


        // flush and clear the entityManager
        entityManager.flush();
        entityManager.clear();

        // find the entity and remove one line

        // flush and clear the entityManager
        entityManager.flush();
        entityManager.clear();

        // find the invoice and verify number of line

    }

    @Test
    public void should_not_save_invoice_when_invoice_number_is_null() {
        //TODO
    }

    @Test
    public void should_not_save_invoice_when_customer_is_missing() {
        //TODO
    }

    @Test
    public void should_not_save_invoice_when_has_no_lines() {
        //TODO
    }

    @Test
    public void should_not_save_invoice_amount_is_negative() {
        //TODO
    }


}
