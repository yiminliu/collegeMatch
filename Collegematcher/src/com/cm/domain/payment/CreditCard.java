package com.cm.domain.payment;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
@PrimaryKeyJoinColumn(name="id")
public class CreditCard extends PaymentInfo {
	
	@Column(name="credir_card_number")
	private Integer creaditCardNumber;
	
	@Column(name="expiration_date")
	private Date expirationDate;
	
	@Column(name="security_code")
    private int securityCode;

	public Integer getCreaditCardNumber() {
		return creaditCardNumber;
	}

	public void setCreaditCardNumber(Integer creaditCardNumber) {
		this.creaditCardNumber = creaditCardNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	
	
}
