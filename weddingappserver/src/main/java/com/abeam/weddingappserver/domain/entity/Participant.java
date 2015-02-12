package com.abeam.weddingappserver.domain.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Participant implements Serializable
{
	@EmbeddedId
	private EmbeddableParticipantKey key = null;

	private String participantName = null;

}
