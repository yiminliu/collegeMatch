package com.cm.domain.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.cm.domain.user.User;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(generator="generator")
	@GenericGenerator(name="generator", strategy="foreign",
			parameters = {@Parameter(name="propery", value="user")})

	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;
}
