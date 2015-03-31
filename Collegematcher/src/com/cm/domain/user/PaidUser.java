package com.cm.domain.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.cm.domain.payment.PaymentInfo;


@Entity
@Table(name="paid_user")
@PrimaryKeyJoinColumn(name="id")
public class PaidUser extends User{
	this.type = UserType.PAID;
	
	@OneToMany(mappedBy="user")
	private List<PaymentInfo> paymentInfoList;

	public List<PaymentInfo> getPaymentInfoList() {
		return paymentInfoList;
	}

	public void setPaymentInfoList(List<PaymentInfo> paymentInfoList) {
		this.paymentInfoList = paymentInfoList;
	}	
}
