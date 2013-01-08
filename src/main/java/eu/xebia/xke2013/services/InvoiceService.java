package eu.xebia.xke2013.services;

import eu.xebia.xke2013.dao.InvoiceDAO;
import eu.xebia.xke2013.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceDAO invoiceDAO;

    public void saveInvoice(Invoice invoice) {
        //TODO
    }

    public void updateInvoice(Invoice Invoice) {
        //TODO
    }

    public List<Invoice> displayInvoiceAuditByInvoiceId(Long id) {
        return null;
    }

}
