package com.webgame.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class AuthentBean implements Serializable {

	private static final long serialVersionUID = -8671811166793813239L;

	public AuthentBean() {
		System.out.println("User session started!");
	}

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("userName = " + userName);
	}
}