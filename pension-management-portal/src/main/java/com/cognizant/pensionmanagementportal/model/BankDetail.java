package com.cognizant.pensionmanagementportal.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
