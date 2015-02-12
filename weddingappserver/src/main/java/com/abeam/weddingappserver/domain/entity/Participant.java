package com.abeam.weddingappserver.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Participant implements Serializable
{
	@Id
	private String weddingId = null;
	@Id
	private String seqNo = null;
	private String participantName = null;

}
