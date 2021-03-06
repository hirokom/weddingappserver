package com.abeam.weddingappserver.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeam.weddingappserver.domain.entity.Participant;
import com.sun.xml.internal.bind.v2.model.core.ID;


public interface ParticipantRepository extends JpaRepository<Participant, ID>
{

	/**
	 *
	 * @param weddingId
	 * @return
	 */
	public List<Participant> findByKeyWeddingId(final String weddingId);

	/**
	 *
	 * @param weddingId
	 * @return
	 */
	public List<Participant> findByKeyWeddingIdOrderByKeySeqNoDesc(final String weddingId);

}
