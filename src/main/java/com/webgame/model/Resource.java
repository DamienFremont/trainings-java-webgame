package com.webgame.model;

import java.io.Serializable;

public class Resource implements Serializable {
	private static final long serialVersionUID = -598546637065159708L;

	private ResourceType type;
	private Long count = 0L;
	private Long max;

	public Resource(ResourceType type, Long count, Long max) {
		super();
		this.type = type;
		this.count = count;
		this.max = max;
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

}
