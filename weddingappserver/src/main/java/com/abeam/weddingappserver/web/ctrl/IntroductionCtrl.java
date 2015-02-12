package com.abeam.weddingappserver.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abeam.weddingappserver.web.form.WeddingForm;


@Controller
@SessionAttributes("weddingForm")
public class IntroductionCtrl
{

	@RequestMapping(value = "/introduction", method = RequestMethod.GET)
	public String Introduction()
	{
		return "Introduction";
	}

	@RequestMapping(value = "/introduction", params = "_back", method = RequestMethod.POST)
	public String back2()
	{
		return "redirect:/menu";
	}
	

}
