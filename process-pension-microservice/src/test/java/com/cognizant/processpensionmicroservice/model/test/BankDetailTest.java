package com.cognizant.processpensionmicroservice.model.test;

import com.cognizant.processpensionmicroservice.model.BankDetail;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BankDetailTest {
    BankDetail bankDetail = new BankDetail();
    @Test
    public void BankDetailBeanTest(){
        assertNotNull(bankDetail);
    }
    @Test
    public void BankDetailNoArgsConstructorTest(){
        BankDetail bankDetail1 = new BankDetail();
        assertThat(assertThat(bankDetail1).isNotNull());
    }
    @Test
    public void BankDetailAllArgsConstructorTest(){
        BankDetail bankDetail1 = new BankDetail("SBI","123456789","public");
        assertNotNull(bankDetail1);
    }
    @Test
    public void BankDetailSettersTest(){
        BankDetail bankDetail1 = new BankDetail();
        bankDetail1.setBankName("SBI");
        bankDetail1.setAccountNumber("123456789");
        bankDetail1.setBankType("public");
        assertNotNull(bankDetail1);
    }
}
