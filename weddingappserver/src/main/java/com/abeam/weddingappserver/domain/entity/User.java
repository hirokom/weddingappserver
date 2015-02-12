package com.abeam.weddingappserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class User
{
	@Id
	private String userId = null;
	private String password = null;
	private String weddingId = null;

}
