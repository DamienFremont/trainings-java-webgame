package com.webgame.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Resource implements Serializable {
	private static final long serialVersionUID = -598546637065159708L;

	private ResourceType type;
	private Long count = 0L;
	private Long max;
	private Map<ResourceType, Long> neededResourceCountList = new HashMap<ResourceType, Long>();
	
	public Resource(ResourceType type, Long count, Long max) {
		super();
		this.type = type;
		this.count = count;
		this.max = max;
	}

	public Resource(ResourceType type, Long count, Long max,
			Map<ResourceType, Long> neededResourceCountList) {
		super();
		this.type = type;
		this.count = count;
		this.max = max;
		this.neededResourceCountList = neededResourceCountList;
	}

	public ResourceType getType() {
		return type;
	}

	public void setType(ResourceType type) {
		this.type = type;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getMax() {
		return max;
	}

	public void setMax(Long max) {
		this.max = max;
	}

	public Map<ResourceType, Long> getNeededResourceCountList() {
		return neededResourceCountList;
	}

	public void setNeededResourceCountList(
			Map<ResourceType, Long> neededResourceCountList) {
		this.neededResourceCountList = neededResourceCountList;
	}

}
