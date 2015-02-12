package com.abeam.weddingappserver.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abeam.weddingappserver.web.form.WeddingForm;


@Controller
@SessionAttributes("weddingForm")
public class InitCtrl
{
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String initLogin(final Model model)
	{
		model.addAttribute("weddingForm", new WeddingForm());
		return "Login";
	}
}
