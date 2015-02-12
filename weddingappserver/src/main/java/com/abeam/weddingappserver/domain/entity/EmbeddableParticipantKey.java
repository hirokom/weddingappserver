package com.abeam.weddingappserver.domain.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Embeddable
public class EmbeddableParticipantKey implements Serializable
{

	/**
	 * コンストラクター
	 */
	public EmbeddableParticipantKey()
	{
	}

	public EmbeddableParticipantKey(final String weddingId, final Integer seqNo)
	{
		this.weddingId = weddingId;
		this.seqNo = seqNo;
	}

	private String weddingId = null;
	private Integer seqNo;

}
