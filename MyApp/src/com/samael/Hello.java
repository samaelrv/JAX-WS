package com.samael;

import javax.jws.WebService;
import javax.jws.WebMethod;
@WebService
public class Hello {

	@WebMethod
	public String first(String name) {
		return "firstName" + name;
	}
	public String last(String name) {
		return "lastName" + name;
	}
}
