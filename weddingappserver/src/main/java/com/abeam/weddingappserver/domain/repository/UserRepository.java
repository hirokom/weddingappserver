package com.abeam.weddingappserver.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeam.weddingappserver.domain.entity.User;
import com.sun.xml.internal.bind.v2.model.core.ID;


public interface UserRepository extends JpaRepository<User, ID>
{


	public User findByUserIdAndPassword(final String userId, final String password);

}
