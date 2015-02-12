package com.abeam.weddingappserver.rest.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abeam.weddingappserver.domain.service.LoginService;
import com.abeam.weddingappserver.web.form.WeddingForm;


@RestController
@RequestMapping(value = "/rest")



public class GetWeddingInfoCtrl
{
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public WeddingForm login(@RequestParam(value = "userId") final String weddingId)
	{
		final WeddingForm weddingForm = loginService.getweddingForm(weddingId);

		return weddingForm;
	}


}


