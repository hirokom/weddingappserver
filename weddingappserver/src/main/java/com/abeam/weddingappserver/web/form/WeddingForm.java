package com.abeam.weddingappserver.web.form;

import lombok.Getter;
import lombok.Setter;

import com.abeam.weddingappserver.domain.model.Foodmenueinfo;
import com.abeam.weddingappserver.domain.model.Hallinfo;
import com.abeam.weddingappserver.domain.model.Husbandinfo;
import com.abeam.weddingappserver.domain.model.Wifeinfo;

@Getter
@Setter
public class WeddingForm
{

	private String weddingId = null;
	private String date = null;
	private String totime = null;
	private String frtime = null;
	private Husbandinfo husbandInfo = null;
	private Wifeinfo wifeInfo = null;
	private Foodmenueinfo foodMenueInfo = null;
    private Hallinfo hallInfo = null;




}
