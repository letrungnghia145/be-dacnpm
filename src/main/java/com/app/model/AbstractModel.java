package com.app.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NaturalId;

import com.app.helper.id.IDGenerator;
import com.app.helper.id.UUIDGenerator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@NaturalId
	protected String genId;
	
	//Date
	@Temporal(TemporalType.TIMESTAMP)
	@Setter(AccessLevel.NONE)
	protected Date createdDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Setter(AccessLevel.NONE)
	protected Date modifiedDate;

	@PrePersist
	protected void setBeforeCreate() {
		this.genId = getIDGenerator().generateID();
		this.createdDate = new Date();
	}

	@PreUpdate
	protected void setBeforeUpdate() {
		this.modifiedDate = new Date();
	}

	protected IDGenerator getIDGenerator() {
		return new UUIDGenerator();
	};
}