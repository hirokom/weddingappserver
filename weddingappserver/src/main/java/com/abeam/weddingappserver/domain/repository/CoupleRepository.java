package com.abeam.weddingappserver.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeam.weddingappserver.domain.entity.Couple;
import com.sun.xml.internal.bind.v2.model.core.ID;


public interface CoupleRepository extends JpaRepository<Couple, ID>
{

	public List<Couple> findByWeddingId(final String weddingId);

}
