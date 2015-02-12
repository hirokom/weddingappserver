package com.abeam.weddingappserver.domain.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Wedding implements Serializable
{
	@Id
	private String weddingId = null;
	private String foodMenuId = null;
	private String hallId = null;
	private Date date = null;
	private Time toTime = null;
	private Time frTime = null;

}
