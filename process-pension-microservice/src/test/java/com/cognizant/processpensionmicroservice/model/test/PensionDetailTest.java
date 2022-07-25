package com.cognizant.processpensionmicroservice.model.test;

import com.cognizant.processpensionmicroservice.entity.PensionDetail;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PensionDetailTest {
    PensionDetail pensionDetail = new PensionDetail();
    @Test
    public void PensionDetailBeanTest(){
        assertNotNull(pensionDetail);
    }
    @Test
    public void PensionDetailNoArgsConstructorTest(){
        PensionDetail pensionDetail1 = new PensionDetail();
        assertThat(assertThat(pensionDetail1).isNotNull());

    }
    @Test
    public void PensionDetailAllArgsConstructorTest(){
        PensionDetail pensionDetail1 = new PensionDetail(1, "hamis", "06-11-1999", "SDWER12345", "family", 30000.00,500);
        assertNotNull(pensionDetail1);
    }
    @Test
    public void PensionDetailSetterTest(){
        PensionDetail pensionDetail1 = new PensionDetail();
        pensionDetail1.setId(2);
        pensionDetail1.setPensionAmount(40000);
        pensionDetail1.setName("hamis");
        pensionDetail1.setPensionType("self");
        pensionDetail1.setPanNumber("ASWAE123");
        pensionDetail1.setBankServiceCharge(550);
        pensionDetail1.setDateOfBirth("12-07-1998");
        assertNotNull(pensionDetail1);
    }
}
