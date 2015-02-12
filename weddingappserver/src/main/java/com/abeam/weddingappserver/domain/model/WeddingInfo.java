package com.abeam.weddingappserver.domain.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.abeam.weddingappserver.domain.entity.Couple;
import com.abeam.weddingappserver.domain.entity.FoodMenu;
import com.abeam.weddingappserver.domain.entity.Hall;
import com.abeam.weddingappserver.domain.entity.Participant;
import com.abeam.weddingappserver.domain.entity.User;
import com.abeam.weddingappserver.domain.entity.Wedding;


@Getter
@Setter
public class WeddingInfo
{
	private User user = null;
	private List<Couple> coupleList = null;
	private Wedding wedding = null;
	private Hall hall = null;
	private FoodMenu foodMenu = null;
	private List<Participant> participantList = null;

}
