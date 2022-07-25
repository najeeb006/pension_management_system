package com.cognizant.pensionmanagementportal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PensionDetail {

	private int id;
	private String name;
	private String dateOfBirth;
	private String panNumber;
	private String pensionType;
	private double pensionAmount;
	private double bankServiceCharge;
	

}
