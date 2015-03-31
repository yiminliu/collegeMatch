package com.cm.domain.payment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cm.domain.user.User;

@Entity
@Table(name="payment_info")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class PaymentInfo {
		
    @Id
    @GeneratedValue
    @Column(name="payment_id")
	private Long paymentId;
		
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="user_id")
	private User owner;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	

}
