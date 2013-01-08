package eu.xebia.xke2013.dao;

import eu.xebia.xke2013.model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CustomerDAOIntegrationTest {

    @Autowired
    private CustomerDAO customerDAO;

    @Test
    public void should_find_customer_when_internal_code_is_ok() {

        //Given
        String internalCode = "CL1253";

        //When
        Customer customer = customerDAO.findCustomerByInternalCode(internalCode);

        //Then
        assertNotNull(customer);
        assertEquals(customer.getInternalCode(), internalCode);

    }

    @Test(expected = DataAccessException.class)
    public void should_find_customer_when_internal_code_is_ko() {

        //Given
        String internalCode = "BADCODE";

        //When
        customerDAO.findCustomerByInternalCode(internalCode);


    }


}
