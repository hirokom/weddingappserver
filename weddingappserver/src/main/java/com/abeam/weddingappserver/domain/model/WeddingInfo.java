package com.abeam.weddingappserver.domain.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.abeam.weddingappserver.domain.entity.Couple;
import com.abeam.weddingappserver.domain.entity.FoodMenu;
import com.abeam.weddingappserver.domain.entity.Hall;
import com.abeam.weddingappserver.domain.entity.Participant;
import com.abeam.weddingappserver.domain.entity.Wedding;


@Getter
@Setter
public class WeddingInfo
{
	private Couple husbandInfo = null;
	private Couple wifeInfo = null;
	private Wedding wedding = null;
	private Hall hall = null;
	private FoodMenu foodMenu = null;
	private List<Participant> participantList = null;

}
