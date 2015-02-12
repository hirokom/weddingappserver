package com.abeam.weddingappserver.web.form;

import lombok.Getter;
import lombok.Setter;

import com.abeam.weddingappserver.domain.model.WeddingInfo;


@Getter
@Setter
public class WeddingForm
{

	private String useId = null;
	private String password = null;
	private WeddingInfo weddingInfo = null;

}
