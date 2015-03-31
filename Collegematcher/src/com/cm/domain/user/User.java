package com.cm.domain.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cm.domain.address.Address;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable{
	
	
	private Long userId;
		
	private String password;
	
	@Enumerated(EnumType.STRING)
	UserType type;
		
	private Date creatdDate;

	@Id
	@GeneratedValue
	@Column(name="user_id")
	public Long getUserId() {
		return userId;
	}
	
	@OneToOne(mappedBy="owner", cascade=CascadeType.PERSIST)
	private Address address;
	

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="creation_date")
	public Date getCreatdDate() {
		return creatdDate;
	}

	public void setCreatdDate(Date creatdDate) {
		this.creatdDate = creatdDate;
	}	
	
	

}
