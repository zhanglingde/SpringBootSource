package com.ling.controller;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Child {

	@NotEmpty(message = "name 不能为空")
	private String name;
}
