package com.abeam.weddingappserver.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class FoodMenu implements Serializable
{
	@Id
	private String foodMenuId = null;
	private String appetizer = null;
	private String soup = null;
	private String maindish = null;
	private String dessert = null;

}
