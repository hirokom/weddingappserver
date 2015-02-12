package com.abeam.weddingappserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Participant
{
	@Id
	private String weddingId = null;
	private String foodMenueId = null;
	private String hallId = null;
	private String date = null;
	private String toTime = null;
	private String frTime = null;

}
