package com.abeam.weddingappserver.rest.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abeam.weddingappserver.domain.entity.Participant;
import com.abeam.weddingappserver.domain.service.ParticipantRegistService;


@RestController
@RequestMapping(value = "/rest")
public class ParticipantRegistCtrl
{
	@Autowired
	private ParticipantRegistService participantRegistService;

	@RequestMapping(value = "/participantRegist", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<Participant> participantList(@RequestParam(value = "weddingId") final String weddingId,
			@RequestParam(value = "participantName") final String participantName)
	{
		final List<Participant> participantList = participantRegistService.registParticipant(weddingId, participantName);

		return participantList;
	}


}
