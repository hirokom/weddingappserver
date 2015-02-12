package com.abeam.weddingappserver.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abeam.weddingappserver.domain.entity.Couple;
import com.abeam.weddingappserver.domain.entity.FoodMenu;
import com.abeam.weddingappserver.domain.entity.Hall;
import com.abeam.weddingappserver.domain.entity.Participant;
import com.abeam.weddingappserver.domain.entity.User;
import com.abeam.weddingappserver.domain.entity.Wedding;
import com.abeam.weddingappserver.domain.model.WeddingInfo;
import com.abeam.weddingappserver.domain.repository.CoupleRepository;
import com.abeam.weddingappserver.domain.repository.FoodMenuRepository;
import com.abeam.weddingappserver.domain.repository.HallRepository;
import com.abeam.weddingappserver.domain.repository.ParticipantRepository;
import com.abeam.weddingappserver.domain.repository.UserRepository;
import com.abeam.weddingappserver.domain.repository.WeddingRepository;


@Service
public class LoginService
{

	@Autowired
	UserRepository userRepository;

	@Autowired
	CoupleRepository coupleRepository;

	@Autowired
	WeddingRepository weddingRepository;

	@Autowired
	FoodMenuRepository foodMenuRepository;

	@Autowired
	HallRepository hallRepository;

	@Autowired
	ParticipantRepository participantRepository;

	public WeddingInfo getWeddingInfo(final String userId, final String password)
	{
		final WeddingInfo weddingInfo = new WeddingInfo();

		final User user = userRepository.findByUserIdAndPassword(userId, password);

		final List<Couple> coupleList = coupleRepository.findByWeddingId(user.getWeddingId());
		final Wedding wedding = weddingRepository.findByWeddingId(user.getUserId());
		final Hall hall = hallRepository.findByhallId(wedding.getHallId());
		final FoodMenu foodMenu = foodMenuRepository.findByFoodMenuId(wedding.getFoodMenuId());
		final List<Participant> participantList = participantRepository.findByKeyWeddingId(user.getWeddingId());

		for (final Couple couple : coupleList)
		{

			if (couple.getDiv().equals("1"))
			{
				weddingInfo.setHusbandInfo(couple);
			}
			else if (couple.getDiv().equals("2"))
			{
				weddingInfo.setWifeInfo(couple);
			}

		}

		weddingInfo.setWedding(wedding);
		weddingInfo.setHall(hall);
		weddingInfo.setFoodMenu(foodMenu);
		weddingInfo.setParticipantList(participantList);

		return weddingInfo;

	}
}
