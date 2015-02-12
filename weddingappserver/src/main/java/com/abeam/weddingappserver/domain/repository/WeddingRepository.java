package com.abeam.weddingappserver.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeam.weddingappserver.domain.entity.Wedding;
import com.sun.xml.internal.bind.v2.model.core.ID;


public interface WeddingRepository extends JpaRepository<Wedding, ID>
{

	public Wedding findByWeddingId(final String weddingId);

}
