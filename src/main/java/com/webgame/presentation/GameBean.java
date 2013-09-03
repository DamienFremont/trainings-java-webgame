package com.webgame.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class GameBean implements Serializable {

	private static final long serialVersionUID = -8671811166793813239L;

	public GameBean() {
		System.out.println("Game started!");
	}

	public String getUserName() {
		return "New player";
	}

}