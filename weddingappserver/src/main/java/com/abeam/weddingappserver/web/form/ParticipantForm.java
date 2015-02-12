package com.abeam.weddingappserver.web.form;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.abeam.weddingappserver.domain.entity.Participant;


@Getter
@Setter
public class ParticipantForm
{

	private String weddingId = null;
	private String participantName = null;
	private List<Participant> participantList = null;


}
