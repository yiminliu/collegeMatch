package com.cm.domain.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.cm.domain.payment.PaymentInfo;


@Entity
@Table(name="free_user")
@PrimaryKeyJoinColumn(name="id")
public class FreeUser extends User{
	this.type = UserType.FREE;
	
	@GenericGenerator(name="generator", strategy="foreign",
            parameter={@Parameters(name="property", value="user"}))
    @GeneratedValue(generator="generator")
	private Long id;
}
