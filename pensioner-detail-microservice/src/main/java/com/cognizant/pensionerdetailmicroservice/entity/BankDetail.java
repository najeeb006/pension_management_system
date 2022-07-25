package com.cognizant.pensionerdetailmicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankDetail {
    private String bankName;					
    private String accountNumber;				
    private String bankType;
}
