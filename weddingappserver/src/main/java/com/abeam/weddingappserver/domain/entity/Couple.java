package com.abeam.weddingappserver.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Couple implements Serializable
{
	@Id
	private String weddingId = null;
	@Id
	private String div = null;
	private String name = null;
	private String hobby = null;
	private String birthday = null;

}
