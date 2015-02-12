package com.abeam.weddingappserver.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeam.weddingappserver.domain.entity.FoodMenu;
import com.sun.xml.internal.bind.v2.model.core.ID;


public interface FoodMenuRepository extends JpaRepository<FoodMenu, ID>
{

	public FoodMenu findByFoodMenuId(final String foodMenuId);

}
