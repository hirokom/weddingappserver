package com.abeam.weddingappserver.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeam.weddingappserver.domain.entity.Hall;
import com.sun.xml.internal.bind.v2.model.core.ID;


public interface HallRepository extends JpaRepository<Hall, ID>
{

	public Hall findByhallId(final String hallId);

}
