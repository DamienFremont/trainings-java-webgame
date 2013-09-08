package com.webgame.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class SettingsBean implements Serializable {

	private static final long serialVersionUID = -1034633155275089191L;
	
	private int details = 0;

	public int getDetails() {
		System.out.println("getDetails:" + details); // TODO log
		return details;
	}

	public void setDetails(int details) {
		System.out.println("setDetails:" + details); // TODO log
		this.details = details;
	}

}