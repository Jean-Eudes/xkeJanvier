package eu.xebia.xke2013.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class InvoiceServiceTest {

    @Autowired
    private InvoiceService invoiceService;

    @Test
    public void should_find_revisions_for_invoices() {
        //TODO

        // creation d'une facture


        // recuperation et modification de la facture

        // verifier que le nombre de revisions est bien egale à 2.

    }

}
