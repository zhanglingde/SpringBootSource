package com.ling.controller;


import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ToString
public class User {

	@NotNull(message = "id不能为空")
	private Integer id;
	@NotEmpty(message = "name不能为空")
	private String name;
	@Valid
	@NotNull(message = "child不能为空")
	private Child child;
	@Valid
	private List<Child> list;
}
