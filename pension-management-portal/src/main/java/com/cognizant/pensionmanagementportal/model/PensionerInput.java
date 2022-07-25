package com.cognizant.pensionmanagementportal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PensionerInput {

	private String aadhaarNumber;
	private double pensionAmount;
	private double serviceCharge;

}