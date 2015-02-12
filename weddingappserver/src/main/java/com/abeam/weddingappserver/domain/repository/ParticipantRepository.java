package com.abeam.weddingappserver.domain.repository;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import com.abeam.weddingappserver.domain.entity.Participant;
import com.sun.xml.internal.bind.v2.model.core.ID;


public interface ParticipantRepository extends JpaRepository<Participant, ID>
{

	public List<Participant> findByWeddingId(final String weddingId);

	public List<Participant> findByWeddingIdOrderBySeqNoAsc(final String weddingId);

//	public Participant save (Participant participant);

	@Lock(LockModeType.OPTIMISTIC)
	public <S extends Participant> S save(S participant);

}
