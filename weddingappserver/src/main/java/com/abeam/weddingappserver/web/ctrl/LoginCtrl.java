package com.abeam.weddingappserver.web.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abeam.weddingappserver.domain.model.WeddingInfo;
import com.abeam.weddingappserver.domain.service.LoginService;
import com.abeam.weddingappserver.web.form.WeddingForm;


@Controller
@SessionAttributes("weddingForm")
public class LoginCtrl
{

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", params = "_login", method = RequestMethod.POST)
	public String search(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		final WeddingInfo weddingInfo = loginService.getWeddingInfo(form.getUserId(), form.getPassword());
		form.setWeddingInfo(weddingInfo);
		return "Menu";

	}


}
