package com.cognizant.processpensionmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PensionerInput {
	private String aadhaarNumber;
	private double pensionAmount;
	private double serviceCharge;

}
