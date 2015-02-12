package com.abeam.weddingappserver.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abeam.weddingappserver.web.form.WeddingForm;


@Controller
@SessionAttributes("weddingForm")
public class MenuCtrl
{
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String Menu()
	{
		return "Menu";
	}

	@RequestMapping(value = "/menu", params = "_participate", method = RequestMethod.POST)
	public String participat(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		return "redirect:/participate";
	}

	@RequestMapping(value = "/menu", params = "_foodmenu", method = RequestMethod.POST)
	public String foodmenu(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		return "redirect:/foodmenu";
	}

	@RequestMapping(value = "/menu", params = "_introduction", method = RequestMethod.POST)
	public String introduction(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		return "redirect:/introduction";
	}

	@RequestMapping(value = "/menu", params = "_hall", method = RequestMethod.POST)
	public String hall(@ModelAttribute("weddingForm") final WeddingForm form)
	{
		return "hall";
	}


}
