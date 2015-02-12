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

	@RequestMapping(value = "/menu", params = "_introduction", method = RequestMethod.POST)
	public String introduction(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		return "Introduction";
	}

	@RequestMapping(value = "/introduction", params = "_back", method = RequestMethod.POST)
	public String back(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		return "Menu";
	}

}
