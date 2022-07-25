package com.cognizant.processpensionmicroservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PensionerDetail {
    @Id
    private String aadhaarNumber;					
    private String name;								
    private String dateOfBirth;							
    private String panNumber;						
    private double salary;								
    private double allowance;						
    private String pensionType;							
    @Embedded
    private BankDetail bankDetail;
}

