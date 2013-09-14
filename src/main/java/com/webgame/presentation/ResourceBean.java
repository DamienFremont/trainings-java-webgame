package com.webgame.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.webgame.model.Resource;
import com.webgame.model.ResourceType;

@ManagedBean
@SessionScoped
public class ResourceBean implements Serializable {
	private static final long serialVersionUID = 5832743699529195835L;

	private List<Resource> resourceList;

	@SuppressWarnings("serial")
	private void initDatas() {
		// test datas
		resourceList = new ArrayList<Resource>();
		resourceList.add(new Resource(ResourceType.GOLD, 100L, 100000L));
		resourceList.add(new Resource(ResourceType.CHARACTER, 0L, 100L,
				new HashMap<ResourceType, Long>() {
					{
						put(ResourceType.GOLD, 50L);
					}
				}));
		resourceList.add(new Resource(ResourceType.WOOD, 0L, 1000L,
				new HashMap<ResourceType, Long>() {
					{
						put(ResourceType.GOLD, 20L);
					}
				}));
		resourceList.add(new Resource(ResourceType.MINERAL, 0L, 1000L,
				new HashMap<ResourceType, Long>() {
					{
						put(ResourceType.GOLD, 200L);
					}
				}));
		resourceList.add(new Resource(ResourceType.WATER, 0L, 1000L,
				new HashMap<ResourceType, Long>() {
					{
						put(ResourceType.GOLD, 10L);
					}
				}));
	}

	public ResourceBean() {
		initDatas();
	}

	public List<Resource> getResourceList() {
		return resourceList;
	}

	private Resource getResource(ResourceType type) {
		Resource res = null;
		for (Resource r : resourceList)
			if (r.getType().equals(type))
				res = r;
		return res;
	}

	public Boolean canShop(Resource resource) {
		if (resource.getNeededResourceCountList().isEmpty())
			return false; // empty
		for (Map.Entry<ResourceType, Long> need : resource
				.getNeededResourceCountList().entrySet()) {
			Resource res = getResource(need.getKey());
			if (res.getCount() < need.getValue())
				return false; // not enough minerals!
		}
		return true; // ok
	}

	public String shop(Resource resource) {
		if (canShop(resource)) {
			for (Map.Entry<ResourceType, Long> need : resource
					.getNeededResourceCountList().entrySet()) {
				Resource res = getResource(need.getKey());
				res.setCount(res.getCount() - need.getValue());
			}
			Resource res = getResource(resource.getType());
			res.setCount(res.getCount() + 1);
		}
		return null;
	}

	public String reset() {
		initDatas();
		return null;
	}

}
