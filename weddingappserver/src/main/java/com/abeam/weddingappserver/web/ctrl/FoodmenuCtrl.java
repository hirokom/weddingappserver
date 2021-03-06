package com.abeam.weddingappserver.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abeam.weddingappserver.web.form.WeddingForm;


@Controller
@SessionAttributes("weddingForm")
public class FoodmenuCtrl
{

	@RequestMapping(value = "/foodmenu", method = RequestMethod.GET)
	public String foodmenu()
	{
		return "Foodmenu";
	}

	@RequestMapping(value = "/foodmenu", params = "_back", method = RequestMethod.POST)
	public String back()
	{
		return "redirect:/menu";
	}

}
