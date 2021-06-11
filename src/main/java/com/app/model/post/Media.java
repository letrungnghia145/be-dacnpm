package com.app.model.post;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.app.model.AbstractModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Media extends AbstractModel {
	private String description;
	private String link;
	@Enumerated(EnumType.STRING)
	@JoinColumn(name = "type")
	private MediaType mediaType;
	@ManyToOne(fetch = FetchType.LAZY)
	private Post post;
	
	//fr map
}
