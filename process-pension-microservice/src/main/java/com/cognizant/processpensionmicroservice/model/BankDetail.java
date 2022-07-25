package com.cognizant.processpensionmicroservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BankDetail {
    private String bankName;					
    private String accountNumber;				
    private String bankType;
}
