package com.webgame.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class GameBean implements Serializable {

	private static final long serialVersionUID = 4521274349458738158L;

	public String getWorldName() {
		return "New world";
	}

}