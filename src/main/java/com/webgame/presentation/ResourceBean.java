package com.webgame.presentation;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.webgame.model.Resource;
import com.webgame.model.ResourceType;

@ManagedBean
@SessionScoped
public class ResourceBean implements Serializable {
	private static final long serialVersionUID = 5832743699529195835L;

	private ArrayList<Resource> resourceList = new ArrayList<Resource>();

	public ResourceBean() {
		// test datas
		resourceList.add(new Resource(ResourceType.CHARACTER, 0L, 100L));
		resourceList.add(new Resource(ResourceType.GOLD, 1000L, 100000L));
		resourceList.add(new Resource(ResourceType.WOOD, 0L, 1000L));
		resourceList.add(new Resource(ResourceType.MINERAL, 0L, 1000L));
		resourceList.add(new Resource(ResourceType.WATER, 0L, 1000L));
	}

	public ArrayList<Resource> getResourceList() {
		return resourceList;
	}
}
