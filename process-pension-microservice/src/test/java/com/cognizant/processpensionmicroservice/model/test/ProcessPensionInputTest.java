package com.cognizant.processpensionmicroservice.model.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import com.cognizant.processpensionmicroservice.model.ProcessPensionInput;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProcessPensionInputTest {

    

    @Test
    public void PensionerInputNoArgConstructorTest() {
        ProcessPensionInput pensionerInput1 = new ProcessPensionInput();
        assertThat(assertThat(pensionerInput1).isNotNull());
    }

    @Test
    public void PensionerInputAllArgConstructorTest() {
        ProcessPensionInput pensionerInput1 = new ProcessPensionInput("1234567654678");
        assertNotNull(pensionerInput1);
    }

    @Test
    public void PensionerDetailSettersTest() {
        ProcessPensionInput pensionerDetail1 = new ProcessPensionInput();
        pensionerDetail1.setAadhaarNumber("1211121324343543");

        assertNotNull(pensionerDetail1);

    }

}
