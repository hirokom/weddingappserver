package com.abeam.weddingappserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Wedding
{
	@Id
	private String weddingId = null;
	private String div = null;
	private String name = null;
	private String hobby = null;
	private String birthday = null;

}
