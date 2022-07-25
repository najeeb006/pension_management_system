package com.cognizant.pensionerdetailmicroservice.entity.test;

import com.cognizant.pensionerdetailmicroservice.entity.BankDetail;
import com.cognizant.pensionerdetailmicroservice.entity.PensionerDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EntityTest {
   
    @Test
    public void testNoArgsPensionerDetailTest() {
    	assertThat(new PensionerDetail()).isNotNull();
    }
    @Test
    public void SetterArgsPensionerDetailTest() {
        PensionerDetail pensionerDetail = new PensionerDetail("986543276547","Fasla","6-11-1998","GTYIK7412L",60000,12000,"family",new BankDetail("SBI", "1234567890", "Private")) ;
        assertEquals("986543276547", pensionerDetail.getAadhaarNumber());
        assertEquals("6-11-1998", pensionerDetail.getDateOfBirth());
        assertEquals("Fasla", pensionerDetail.getName());
        assertEquals("GTYIK7412L", pensionerDetail.getPanNumber());
        assertEquals(60000, pensionerDetail.getSalary());
        assertEquals(12000, pensionerDetail.getAllowance());
        assertEquals("family", pensionerDetail.getPensionType());
        assertEquals("SBI", pensionerDetail.getBankDetail().getBankName());
        assertEquals("1234567890", pensionerDetail.getBankDetail().getAccountNumber());
        assertEquals("Private", pensionerDetail.getBankDetail().getBankType());
        
    }
    @Test
    public void testAllArgsPensionerDetailTest() {
        PensionerDetail pensionerDetail = new PensionerDetail("986543276547","Fasla","6-11-1998","GTYIK7412L",60000,12000,"family",new BankDetail("SBI", "1234567890", "Private")) ;
        Assertions.assertNotNull(pensionerDetail) ;
    }
    @Test
    public void testSetterPensionerDetailTest() {
        PensionerDetail pensionerDetail = new PensionerDetail();
        pensionerDetail.setAadhaarNumber("986543276547");
        pensionerDetail.setDateOfBirth("6-11-1998");
        pensionerDetail.setName("Mounika");
        pensionerDetail.setPanNumber("GTYIK7412L");
        pensionerDetail.setSalary(70000);
        pensionerDetail.setAllowance(12000);
        pensionerDetail.setPensionType("family");
      

        BankDetail bankDetail = new BankDetail();
        bankDetail.setAccountNumber("102233445566");
        bankDetail.setBankName("SBI");
        bankDetail.setBankType("public");

        pensionerDetail.setBankDetail(bankDetail);
        assertThat(assertThat(pensionerDetail).isNotNull());

        assertEquals("986543276547",pensionerDetail.getAadhaarNumber() ) ;
        assertEquals("6-11-1998", pensionerDetail.getDateOfBirth()) ;
        assertEquals("Mounika", pensionerDetail.getName()) ;
        assertEquals("GTYIK7412L", pensionerDetail.getPanNumber()) ;
        assertEquals(70000, pensionerDetail.getSalary()) ;
        assertEquals(12000, pensionerDetail.getAllowance()) ;
        assertEquals("family", pensionerDetail.getPensionType()) ;

        assertEquals("102233445566",bankDetail.getAccountNumber() ) ;
        assertEquals("SBI", bankDetail.getBankName()) ;
        assertEquals("public",bankDetail.getBankType() ) ;

    }
    
    @Test
    public void testNoArgsBankDetailTest() {
        assertThat(new BankDetail()).isNotNull();
    }
    

    @Test
    public void testAllArgsBankDetailTest() {
        BankDetail bankDetails = new BankDetail("SBI", "1234567890", "Private") ;
        Assertions.assertNotNull(bankDetails) ;
    }

    @Test
    public void testSetterBankTest() {
        BankDetail b = new BankDetail();
        b.setAccountNumber("102233445566");
        b.setBankName("SBI");
        b.setBankType("public");
        assertThat(assertThat(b).isNotNull());

    }

    @Test
    public void SetterArgsBankDetailTest() {
        BankDetail bankDetails = new BankDetail("SBI", "1234567890", "private") ;
        assertEquals("SBI", bankDetails.getBankName()) ;
        assertEquals("1234567890", bankDetails.getAccountNumber()) ;
        assertEquals("private", bankDetails.getBankType()) ;
    }


    
}
