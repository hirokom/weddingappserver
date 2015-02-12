package com.abeam.weddingappserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Hall
{
	@Id
	private String hallId = null;
	private String zipCode = null;
	private String address = null;
	private String tel = null;

}
