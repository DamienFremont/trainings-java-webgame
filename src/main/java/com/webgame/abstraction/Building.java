package com.webgame.abstraction;

import java.io.Serializable;

public class Building implements Serializable {

	private static final long serialVersionUID = -2514817236355877826L;

	public Building(String name, boolean status, double production) {
		this.buildingName = name;
		this.buildingStatus = status;
		this.buildingProduction = production;
	}
	
	/* Attribute */
	private String buildingName;
	private boolean buildingStatus;
	private double buildingProduction;
	
	/* Getter */
	public String getBuildingName() {
		return buildingName;
	}
	
	/* Convert boolean to string value */
	public String getBuildingStatus() {
		String status;
		if (buildingStatus) {
			status = "Activé";
		}
		else
			status = "Désactivé";
		return status;
	}
	
	public double getBuildingProduction() {
		return buildingProduction;
	}
	

	/* Setter */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public void setBuildingStatus(boolean buildingStatus) {
		this.buildingStatus = buildingStatus;
	}

	public void setBuildingProduction(double buildingProduction) {
		this.buildingProduction = buildingProduction;
	}	
}
