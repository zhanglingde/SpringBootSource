package com.ling.test01.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Cat {
    private String name;
    private String color;

	public Cat() {
		System.out.println("new Cat...");
	}


}
