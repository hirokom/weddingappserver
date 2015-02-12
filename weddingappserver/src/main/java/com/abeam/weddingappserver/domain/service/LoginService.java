package com.abeam.weddingappserver.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abeam.weddingappserver.web.form.WeddingForm;


@Service
public class LoginService
{

	@Autowired
	UserRepository UserRepository

	public String loginCheck(final String useid, final String password)
	{

		final String weddingId = null;
		return weddingId;

	}

	public WeddingForm getweddingForm(final String weddingid)
	{

		final WeddingForm weddingForm = new WeddingForm();
		return weddingForm;

	}

}
