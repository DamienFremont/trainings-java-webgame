package com.webgame.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.webgame.abstraction.Building;

import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class BuildingBean implements Serializable {

	private static final long serialVersionUID = -4675969535938539940L;
	
	public BuildingBean() {
		this.buildingList = new ArrayList<Building>();
		buildingList.add(new Building("name", true, 2));
		buildingList.add(new Building("name", true, 4));
	}

	private ArrayList<Building> buildingList;
	
	// TODO BUILDING DATABASE
	private Building building = new Building("Hall de la colonie", true, 1);
	
	
	/** Example of foreach in Java **/
	/**public Building getName() {		
		Building name = null;
		for (Building currentBuilding : this.buildingList) {
			name = currentBuilding;
		}
		
		return name;
	}**/
	
	/* Add a building to the list */
	public void addBuilding() {
		//TODO LOG
		this.buildingList.add(this.building);
	}
	
	/* Delete a building from the list */
	public String deleteBuilding(Building building) {
		//TODO LOG
		this.buildingList.remove(building);
		return null;
	}
	
	/* Getter */
	public ArrayList<Building> getBuildingList() {
		return this.buildingList;
	}
	
	/* Setter */
	public void setBuildingList(ArrayList<Building> buildingList) {
		this.buildingList = buildingList;
	}
	
	public Building setBuilding(Building building) {
		return this.building = building;
	}
}
