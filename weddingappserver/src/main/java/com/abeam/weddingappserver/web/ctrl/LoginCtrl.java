package com.abeam.weddingappserver.web.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String initLogin(final Model model)
	{
		model.addAttribute("weddingForm", new WeddingForm());
		return "Login";
	}

	@RequestMapping(value = "/login", params = "_login", method = RequestMethod.POST)
	public String search(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		final WeddingInfo weddingInfo = loginService.getBaseInfo(form.getUserId());
		form.setWeddingInfo(weddingInfo);
		return "Login";
	}

}
