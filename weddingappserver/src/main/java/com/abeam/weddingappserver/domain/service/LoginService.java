package com.abeam.weddingappserver.domain.service;

import org.springframework.stereotype.Service;

import com.abeam.weddingappserver.domain.model.WeddingInfo;


@Service
public class LoginService
{
	public WeddingInfo getBaseInfo(final String id)
	{
		final WeddingInfo weddingInfo = new WeddingInfo();
		weddingInfo.setHusband("渡邉　康司");
		weddingInfo.setWife("渡邉　康子");
		return weddingInfo;
	}
}
