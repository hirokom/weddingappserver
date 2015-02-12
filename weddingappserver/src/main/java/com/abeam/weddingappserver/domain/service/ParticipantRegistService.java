package com.abeam.weddingappserver.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abeam.weddingappserver.domain.entity.EmbeddableParticipantKey;
import com.abeam.weddingappserver.domain.entity.Participant;
import com.abeam.weddingappserver.domain.repository.ParticipantRepository;


@Service
public class ParticipantRegistService
{
	@Autowired
	ParticipantRepository participantRepository;

	public List<Participant> registParticipant(final String weddingId, final String participantName)
	{

		//		取得：連番(最大値)
		Participant participant = new Participant();
		Participant participantTmp = new Participant();
		List<Participant> participantList = participantRepository.findByKeyWeddingIdOrderByKeySeqNoAsc(weddingId);
		participant = participantList.get(1);

		//		チェック：同一人物の登録状況
		Boolean exist = false;
		for (int i = 0; i < participantList.size(); ++i)
		{
			participantTmp = participantList.get(i);

			if (participantName.equals(participantTmp.getParticipantName()))
			{
				exist = true;
			}
		}

		//		登録：新規参加者
		if (!exist)
		{
			final EmbeddableParticipantKey key = new EmbeddableParticipantKey(weddingId, participant.getKey().getSeqNo() + 1);
			participant.setKey(key);
			participant.setParticipantName(participantName);

			participantRepository.saveAndFlush(participant);
			//			participantRepository.saveAndFlush(participant);

		}

		//		再取得：参加者情報
		participantList = participantRepository.findByKeyWeddingId(weddingId);
		return participantList;

	}
}
