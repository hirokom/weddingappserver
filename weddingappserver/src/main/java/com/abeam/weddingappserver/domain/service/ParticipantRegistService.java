package com.abeam.weddingappserver.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abeam.weddingappserver.domain.entity.Participant;
import com.abeam.weddingappserver.domain.repository.ParticipantRepository;

@Service
public class ParticipantRegistService
{
	@Autowired
	ParticipantRepository participantRepository;

	public List<Participant> registParticipant(String weddingId,String participantName)
	{

//		取得：連番(最大値)
		Participant participant    = new Participant();
		Participant participantTmp = new Participant();
		List<Participant> participantList = participantRepository.findByWeddingIdOrderBySeqNoDesc(weddingId);
		participant = participantList.get(1);

//		チェック：同一人物の登録状況
		Boolean exist = false;
		for ( int i = 0; i < participantList.size(); ++i )
		{
			participantTmp = participantList.get(i);

			if ( participantName.equals(participantTmp.getParticipantName()))
			{
				exist = true;
			}
		}

//		参加者の登録
		if ( exist = false)
		{
			participant.setWeddingId(weddingId);
			participant.setSeqNo(participant.getSeqNo()+1);
			participant.setParticipantName(participantName);

			participantRepository.save(participant);

		}

//		参加者情報の再取得
		participantList = participantRepository.findByWeddingId(weddingId);
		return participantList;

	}
}

