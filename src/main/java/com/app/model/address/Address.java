package com.app.model.address;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.app.model.AbstractModel;
import com.app.model.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address extends AbstractModel {
	@ManyToOne(fetch = FetchType.LAZY)
	private City city;
	@ManyToOne(fetch = FetchType.LAZY)
	private District district;
	@ManyToOne(fetch = FetchType.LAZY)
	private Ward ward;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	private String details;
}
