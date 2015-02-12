package com.abeam.weddingappserver.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sun.xml.internal.bind.v2.model.core.ID;

public interface UserRepository extends JpaRepository<User, ID> {


	public User findByUserAndId(String User, String ID)

}
